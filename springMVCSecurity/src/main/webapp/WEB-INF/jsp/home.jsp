<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Demo Food App</title>
</head>
<body>

	<a href="addFood">Add a food to the list</a>
	
	<h1>All Foods</h1>
	
	<p>Welcome <sec:authentication property="name"/> </p>
	
	<!-- 
	<ul id="fooList">
	
		<c:forEach items="${allFoods}" var="food">
		
			<li>
				${food.getName()}
			</li>
			
		</c:forEach>
	</ul>
	 -->

</body>
</html>