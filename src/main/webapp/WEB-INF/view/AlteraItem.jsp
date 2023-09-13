<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>     
<c:url value="/entrada" var="link" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Item</title>
</head>
<body>

	<form action="${link }" method="post">
	Nome: <input type="text" name="nome" value="${item.nome }">
	Qtd: <input type="text" name="qtd" value="${item.qtd }">
	Preco: <input type="text" name="preco" value="${item.preco }">
	<input type="hidden" name="id" value="${item.id }">
	<input type="hidden" name="acao" value="AlteraItem">
	<input type="submit">
	
	
	</form>

</body>
</html>