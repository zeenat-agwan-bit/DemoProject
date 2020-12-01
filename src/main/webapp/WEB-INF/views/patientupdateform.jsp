<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@page isELIgnored="false" %>

<html>
<body>
	<h3>Patient-Registration-Form</h3>
	<hr>
	<form:form action="updatepatient" method="post"  modelAttribute="patient">
		
		

Patient Id		:         <form:hidden path="pid"/>	<form:errors path="pid"/>

Name			:         <form:input path="name"/> <form:errors path="name"/>


Mobile			:         <form:input path="phone"/>  <form:errors path="phone"/>


City			:         <form:input path="city"/>  <form:errors path="city"/>


                           <input type="submit" value="UPDATE">
       
	</form:form>
	<hr>
	<a href="adminpage.jsp">HOME</a>
</body>
</html>

		
		
		
		