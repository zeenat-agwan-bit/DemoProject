<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>
<%@page import="java.util.List , com.zee.domain.*"%>
<%@page isELIgnored="false"%>
<html>
<body>
	<h2
		style="text-align: center; font-weight: bold; font-size: 30px; color: black; margin-top: 20px;">Details
		Of Appointment ${appointment.aid}</h2>


	<h3>Search By Id</h3>
	<hr>
	<table border="2">
		<tr>

			<th>Appointment Id</th>
			<th>Date</th>
			<th>Time</th>
			<th>Diagnosis</th>
<th>Patient id</th>
<th>Patient Name</th>
<th>Patient Phone</th>

		</tr>

		<tr>
			<td>${appointment.aid }</td>
			<td>${appointment.date}</td>
			<td>${appointment.time}</td>
			<td>${appointment.diagnosis}</td>
			<td>${appointment.patient.pid}</td>
			<td>${appointment.patient.name}</td>
			<td>${appointment.patient.phone}</td>

		</tr>

	</table>

	<hr>
	<a href="alisthome">Back</a>
	<hr>
</body>
</html>