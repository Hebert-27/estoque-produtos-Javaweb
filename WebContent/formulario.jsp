<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Minha Loja</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<c:import url="cabecalho.jsp" />
<div class="container" style="margin-top: 5%">
	<h1 style="text-align: center">Formulário de Cadastro</h1>
	<table class="table">
		<form action="cadastro-efetuado" method="GET">
			<tr>
				<td>Nome:</td>
			</tr>
			<tr>
				<td><input type="text" name="nome" class="form-control"></td>
			</tr>
			<tr>
				<td>Valor:</td>
			</tr>
			<tr>
				<td><input type="number" name="valor" class="form-control"></td>
			</tr>
			<tr>
				<td>Descrição:</td>
			</tr>
			<tr>
				<td><textarea name="descricao" rows="3" class="form-control"></textarea></td>
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
				<td style="text-align: center">
					<input type="submit" class="btn btn-primary" value="Cadastrar" name="botao">
				</td>
			</tr>
		</form>
	</table>
</div>
<c:import url="rodape.jsp" />
</body>
</html>