<%@page import="br.com.alura.gerenciador.dao.Banco"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listagem dos Produtos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript"
	src="<c:url value="js/jquery-3.3.1.min.js" />"></script>
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	<div class="container" style="margin-top: 5%">
	<h1 style="text-align: center">Alteração de Produtos</h1>
	<table class="table">
		<form action="/concluir-alteracao" method="GET">
			<input type="hidden" name="id" class="form-control"/>
			<tr>
				<td>Nome:</td>
			</tr>
			<tr>
				<td><input type="text" name="nome" class="form-control" value="${formulario.getNome()}" /></td>
			</tr>
			<tr>
				<td>Valor:</td>
			</tr>
			<tr>
				<td><input type="number" name="valor" class="form-control" value="${formulario.valor}"></td>
			</tr>
			<tr>
				<td>Descrição:</td>
			</tr>
			<tr>
				<td><textarea name="descricao" rows="3" class="form-control" value="${formulario.descricao}"></textarea></td>
			</tr>
			<tr>
				<td>Categoria:</td>
			</tr>
			<tr>
				<td><select class="form-control" name="categoria">
						<option value="1">Esporte</option>
						<option value="2">Alimentação</option>
						<option value="3">Eletrodomestico</option>
				</select></td>
			</tr>
			<tr>
				<td style="text-align: center"><input type="submit"
					class="btn btn-primary" value="Cadastrar" name="botao"></td>
			</tr>
		</form>
	</table>
</div>
	<c:import url="rodape.jsp"/>
</body>
</html>