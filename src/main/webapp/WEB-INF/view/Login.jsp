<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<c:url  value="/entrada" var="link" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="${link }" method="post">
	Nome: <input type="text" name="nome">
	Senha: <input type="text" name="senha">
	<input type="hidden" name="acao" value="Login">
	<input type="submit">
	 
	</form>

</body>
</html>