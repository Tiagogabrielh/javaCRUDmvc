<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%-- <%@ taglib uri="http:java.sun.com/jsp/jstl/fmt" prefix="fmt" %> --%>
<%-- <c:url value="/entrada" var="links" /> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Itens</title>

</head>

<body>
	
	<header>
	
	Usuário: ${nome } 
	<p><c:import url="Logout.jsp" /></p>
	
    </header>
	
	
	
	
	<a href="/projeto1/entrada?acao=ChamaFormulario">Inserir novo item</a><br><br>
	Itens:
	
	<ul>
	
		
		<c:forEach items="${itens }" var="itens">
			<li>
				${itens.nome }           Qtd:${itens.qtd }        R$${itens.preco }
				<a href="/projeto1/entrada?acao=Mostra&id=${itens.id }">edita</a>
				<a href="/projeto1/entrada?acao=Remove&id=${itens.id }">remove</a>
<!-- 				<input type="hidden" name="acao" value="ListaItens"> -->
			
			</li>
		</c:forEach>
		
	
	</ul>
	
	

</body>
</html>