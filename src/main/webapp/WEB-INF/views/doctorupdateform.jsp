<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@page isELIgnored="false" %>

<html>
<body>
	<h3>Doctor-Update-Form</h3>
	<hr>
	<form:form action="updatedoctor" method="post"  modelAttribute="doctor">
		
		

Doctor Id		:         <form:hidden path="did"/>	<form:errors path="did"/>

Name			:         <form:input path="name"/> <form:errors path="name"/>


Qualification	:         <form:input path="qualification"/>  <form:errors path="qualification"/>


Specialization	:         <form:input path="specialization"/>  <form:errors path="specialization"/>


                           <input type="submit" value="UPDATE">
       
	</form:form>
	<hr>
	<a href="adminpage">HOME</a>
</body>
</html>

		
		
		
		