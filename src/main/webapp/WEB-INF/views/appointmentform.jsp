<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@page isELIgnored="false"%>

<html>
<body>
	<h3>Appointment-Registration-Form</h3>
	<hr>
	<form:form action="saveappointment" method="post"
		modelAttribute="appointment">

		<pre>

Appointment Id		:         <form:hidden path="aid" />	<form:errors
				path="aid" />

Time			  	:         <form:input path="time" /> <form:errors path="time" />


Date				:         <form:input path="date" />  <form:errors path="date" />


Diagnosis			:         <form:input path="diagnosis" />  <form:errors
				path="diagnosis" />

patient Id           :			<form:select path="patient.pid" items="${ids}" />
                           <input type="submit" value="Booking">
       </pre>
	</form:form>
	<hr>
	<a href="adminpage">Back</a>
	<a href="index.jsp">HOME</a>
</body>
</html>


