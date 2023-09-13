<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<c:url  value="/entrada" var="link" />
<!DOCTYPE html>
<html>
<head> 
<meta charset="ISO-8859-1">
<title>Inserir Item</title>
</head>
<body>
	<c:import url="Logout.jsp" />
	
	Usuário: ${nome }
	<br>
	<form action="${link }" method="post">
	Nome: <input type="text" name="nome">
	Qtd: <input type="text" name="qtd">
	Preco: <input type="text" name="preco">
	<input type="hidden" name="acao" value="InsereNova">
	<input type="submit">
	
	
	</form>

</body>
</html>