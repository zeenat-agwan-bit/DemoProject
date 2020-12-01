<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@page import="java.util.List, com.zee.domain.* "%>
<%@page isELIgnored="false"%>
<html>
<body>
	<h3>Doctor-List</h3>
	<form action="searchbydocid" method="post">
		<input type="search" name="docbox" placeholder="Search By Id">
		<button type="submit">Search</button>
	</form>

	<hr>
	<table border="2">
		<tr>

			<th>Doctor Id</th>
			<th>Name</th>
			<th>Specialization</t>
			<th>Qualification</th>
			<th>ACTION</th>

		</tr>
		<jstl:forEach items="${dlist}" var="doctors">

			<tr>
				<td>${doctors.did }</td>
				<td>${doctors.name}</td>
				<td>${doctors.specialization}</td>
				<td>${doctors.qualification}</td>
				<td><a href="updatedoctorform?id=${doctors.did}">Update</a></td>
				<td><a href="deletedoctor?id=${doctors.did}">Delete</a></td>




			</tr>
		</jstl:forEach>
	</table>

	<hr>
	<a href="adminpage">Back</a>
	<hr>
</body>
</html>