<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>
<%@page import="java.util.List , com.zee.domain.*"%>
<%@page isELIgnored="false"%>
<html>
<body>
<h2
		style="text-align: center; font-weight: bold; font-size: 30px; color: black; margin-top: 20px;">Details Of Doctor ${doctor.name}</h2>
	

	<h3>Search By Id</h3>
	<hr>
	<table border="2">
		<tr>

			<th>Doctor Id</th>
			<th>Name</th>
			<th>Specialization</t>
			<th>Qualification</th>
			

		</tr>
		
			<tr>
				<td>${doctor.did }</td>
				<td>${doctor.name}</td>
				<td>${doctor.specialization}</td>
				<td>${doctor.qualification}</td>
				
			</tr>
		
	</table>

	<hr>
	<a href="dlisthome">Back</a>
	<hr>
</body>
</html>