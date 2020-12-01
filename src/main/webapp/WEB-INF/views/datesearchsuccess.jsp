<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ page isELIgnored="false"%>
<%@page import="com.zee.domain.*" %>
<html>
<head>
<title>Search By Date</title>
</head>
<body>

	<jstl:forEach items="${students}" var="student">


	    ${student.id}	
		${student.name}
		${student.date}
		${student.time}
		${student.course}
		${student.gender}
		${student.type}
		
	</jstl:forEach>

</body>
</html>
