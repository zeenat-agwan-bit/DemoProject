<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<%@page import="com.zee.domain.*"%>
<html>
<head>
<title>Search By Data</title>
</head>
<body>

	<form:form action="searchdata" method="post" modelAttribute="student">
Id : <form:input path="id" />
Or Name : <form:input path="name" />
Or Course : <form:input path="course" />
Or Time :<form:input path="time" />
Or Type :<form:input path="type" />
Or Gender : <form:input path="gender" />

		<input type="submit" value="SEARCH">

	</form:form>




	<table border="2" width="100%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Date</th>
			<th>Time</th>
			<th>Course</th>
			<th>Gender</th>
			<th>Type</th>


		</tr>
		<jstl:forEach items="${li}" var="student">
			<tr>

				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.date}</td>
				<td>${student.time}</td>
				<td>${student.course}</td>
				<td>${student.gender}</td>
				<td>${student.type}</td>
			</tr>
		</jstl:forEach>
	</table>

</body>
</html>
