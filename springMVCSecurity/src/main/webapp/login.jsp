<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Custom Login Page</title>
</head>
<body>

	<h1>Welcome To This Demo Apps Custom Login Page</h1>
	
	<form:form action="login" name="myForm" method="POST" >
	
		What's your username? <input type="text" name="username" value="" />
				
		What's your password <input type="password" name="password" />
		
		<input type="submit" name="submit" value="Get Started">
		
	</form:form>
</body>
</html>