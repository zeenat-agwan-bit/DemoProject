<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@page isELIgnored="false" %>

<html>
<body>
	<h3>Doctor-Registration-Form</h3>
	<hr>
	<form:form action="savedoctor" method="post"  modelAttribute="doctor">
		<pre>
		

Doctor Id		:         <form:hidden path="did"/>	<form:errors path="did"/>

Name			:         <form:input path="name"/> <form:errors path="name"/>


Qualification	:         <form:input path="qualification"/>  <form:errors path="qualification"/>


Specialization	:         <form:input path="specialization"/>  <form:errors path="specialization"/>


                           <input type="submit" value="REGISTER">
       </pre>
	</form:form>
	<hr>
	<a href="adminpage">Back</a>
	<a href="index.jsp">HOME</a>
</body>
</html>
		
		
		