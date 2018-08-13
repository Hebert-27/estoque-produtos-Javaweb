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
 <script type="text/javascript" src="<c:url value="js/jquery-3.3.1.min.js" />"></script>
</head>
<body>
<script>
function remove(id){
		$.get("http://localhost:8080/gerenciador/removercontroller", {id: id}).done(function(){
			document.location.reload();
		});
	}
</script>
<c:import url="cabecalho.jsp"/>
<div class="container" style="margin-top: 5%">
	<h1 style="text-align: center">Listagem de Produtos</h1>
	<jsp:useBean id="dao" class="br.com.alura.gerenciador.dao.Banco"/>
	<table class="table" style="text-align: center">
	<tr>
    	<th style="text-align: center">Id</th>
    	<th style="text-align: center">Nome</th>
    	<th style="text-align: center">Valor</th>
    	<th style="text-align: center">Descrição</th>
    	<th style="text-align: center">Categoria</th>
  	</tr>
		<c:forEach var="f" items="${dao.Listar()}">
			<tr>
				<td>${f.id}</td>
				<td>${f.nome}</td>
				<td>${f.valor}</td>
				<td>${f.descricao}</td>
				<td>${f.categoria}</td>
				<td>
					<button name="alterar" value="alterar" class="btn btn-primary">Alterar</button>
				</td>
				<td>
					<button class="btn btn-danger" onclick="remove(${f.id})">Remover</button>
				</td>
			</tr>
		</c:forEach>
	</table>
<c:import url="rodape.jsp"/>
</div>
</body>
</html>