<%@page import="br.com.alura.gerenciador.dao.Banco" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listagem dos Produtos</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="css/index.css" rel="stylesheet">
</head>
<body>
<c:import url="cabecalho.jsp"/>
<div class="container" style="margin-top: 5%">
	<h1 style="text-align: center">Listagem de Produtos</h1>
	<jsp:useBean id="dao" class="br.com.alura.gerenciador.dao.Banco"/>
	<table class="table">
	<tr>
    	<th>ID</th>
    	<th>Nome</th>
  	</tr>
		<c:forEach var="f" items="${dao.Listar()}">
			<tr>
				<td>${f.id}</td>
				<td>${f.nome}</td>
			</tr>
		</c:forEach>
	</table>
<c:import url="rodape.jsp"/>
</div>
</body>
</html>