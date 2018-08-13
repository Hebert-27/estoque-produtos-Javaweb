<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
	<meta charset="UTF-8">
	<title>Formulário</title>
 	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body style="text-align: center">
<c:import url="../../cabecalho.jsp" />
	<div class="container">
		<p class="text-success" style="padding-top: 5%">${formulario.getNome()} cadastrado com sucesso!</p>
	</div>	
	<c:import url="../../rodape.jsp" />
</body>
</html>