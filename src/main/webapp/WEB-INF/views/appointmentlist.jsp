<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@page import="java.util.List, com.zee.domain.* "%>
<%@page isELIgnored="false"%>
<html>
<body>
	<form action="searchbyappid" method="post">
		<input type="search" name="appbox" placeholder="Search By Id">
		<button type="submit">Search</button>
	</form>

	<h3>Appointment-List</h3>
	<hr>
	<table border="2">
		<tr>

			<th>Appointment Id</th>
			<th>Date</th>
			<th>Time</t>
			<th>Diagnosis</th>

			<th>Name</th>
			<th>Patient Id</th>
			<th>Phone</th>
			<th>City</th>
			<th>ACTION</th>
		</tr>
		<jstl:forEach items="${alist}" var="appointments">

			<tr>
				<td>${appointments.aid }</td>
				<td>${appointments.date}</td>
				<td>${appointments.time}</td>
				<td>${appointments.diagnosis}</td>
				<td>${appointments.patient.name}</td>
				<td>${appointments.patient.pid}</td>
				<td>${appointments.patient.phone}</td>
				<td>${appointments.patient.city}</td>


				<%-- <td><a href="updateappointmentform?id=${appointments.aid}">Update</a></td>
				<td><a href="deleteappointment?id=${appointments.aid}">Delete</a></td>
 --%>



			</tr>
		</jstl:forEach>
	</table>

	<hr>
	<a href="adminhomea">Back</a>
	<hr>
</body>
</html>