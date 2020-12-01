<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@page isELIgnored="false" %>

<html>
<body>
	<h3>Appointment-Registration-Form</h3>
	<hr>
	<form:form action="updateappointment" method="post"  modelAttribute="appointment">
		
		

Appointment Id		:         <form:hidden path="aid"/>	<form:errors path="aid"/>

Date			:         <form:input path="date"/> <form:errors path="date"/>


Time			:         <form:select path="time"/>  <form:errors path="time"/>


Diagnosis			:         <form:input path="diagnosis"/>  <form:errors path="diagnosis"/>


                           <input type="submit" value="UPDATE">
       
	</form:form>
	<hr>
	<a href="adminpage.jsp">HOME</a>
</body>
</html>

		
		
		
		