<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@page import="java.util.List, com.zee.domain.* "%>
<%@page isELIgnored="false"%>
<html>
<body>

	<form action="searchbypatid" method="post">
		<input type="search" name="patbox" placeholder="Search By Id">
		<button type="submit">Search</button>
	</form>

	<h3>Patient-List</h3>
	<hr>
	<table border="2">
		<tr>


			<th>Patient Id</th>
			<th>Name</th>
			<th>Mobile</t>
			<th>City</th>
			<th>ACTION</th>
		</tr>
		<jstl:forEach items="${plist}" var="patients">

			<tr>

				<td>${patients.pid }</td>
				<td>${patients.name}</td>
				<td>${patients.phone}</td>
				<td>${patients.city}</td>
				<td><a href="updatepatientform?id=${patients.pid}">Update</a></td>
				<td><a href="deletepatient?id=${patients.pid}">Delete</a></td>



			</tr>
		</jstl:forEach>
	</table>

	<hr>
	<a href="adminhomep">Back</a>
	<hr>
</body>
</html>