<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<%@page import="com.zee.domain.*"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">

	<a class="navbar-brand" href="#">HealthCare</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link" href="complex">Form<span
					class="sr-only">(current)</span></a></li>
		</ul>


		<form class="form-inline my-2 my-lg-0" action="searchbyid"
			method="post">
			<input class="form-control mr-sm-2" type="search" name="querybox"
				placeholder="Search By Id" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>

<%-- 
		<form:form action="searchdata" modelAttribute="student"
			class="form-inline my-2 my-lg-0" method="post">
			
			Id : <form:input path="id" />
Or Name : <form:input path="name" />
Or Course : <form:input path="course" />
Or Time :<form:input path="time" />
Or Type :<form:input path="type" />
Or Gender : <form:input path="gender" />

			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>

		</form:form>

 --%>

	</div>
</nav>
