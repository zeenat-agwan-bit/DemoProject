package com.zee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.zee.domain.Student;
import com.zee.service.StudentService;

@Controller
public class FormController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/complex")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView("complexform");
		mv.addObject("student", new Student());
		return mv;
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {

		if (result.hasErrors()) {
			return "complexform";
		}

		System.out.println(student);
		studentService.addStudent(student);
		return "success";
	}
	

	
	

	@RequestMapping("/searchbyid")
	public ModelAndView showSearchButton(@RequestParam("querybox") Long query) {
		ModelAndView mv = new ModelAndView("searchsuccess");
		Student student = studentService.searchStudentById(query);
		System.out.println(student);
		mv.addObject("student", student); // request-scope
		return mv;
	}

	@RequestMapping("/searchdata")
	public ModelAndView searchData(@ModelAttribute("student") Student student) {
		ModelAndView mv = new ModelAndView("datasearched");
		List list = studentService.findData(student);
		if (!list.isEmpty()) {
			mv.addObject("li", list);
		} else {
			mv.addObject("msg", "Oops!!Record not found");
		}
		return mv;

	}

	@RequestMapping("/searchbydate")
	public ModelAndView showDateSearchResult(@RequestParam("datebox") String date) {
		ModelAndView mv = new ModelAndView("datesearchsuccess");

		List<Student> students = studentService.searchStudentsByDate(date);
		mv.addObject("students", students);
		return mv;

	}

	/*
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value = Exception.class) public String
	 * exceptionHandlerGeneric(Model m) { m.addAttribute("msg",
	 * "An Exception has occured..!"); return "errorpage"; }
	 */

}