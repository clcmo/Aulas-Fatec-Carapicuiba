<?php
	include_once("pdo.php");
	include ("assets/names.php");
	echo'<doctype html!>
	<!--Cabeçalho do site-->
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="assets/style.css" />
		<title>'.$nome_site.'</title>
		<script>
			window.console = window.console || function(t) {};
		</script>
		<script>
			if (document.location.search.match(/type=embed/gi)) {
				window.parent.postMessage("resize", "*");
			}
		</script>
	</head>
	<body>
		<h1 class="page_title">'.$nome_site.'</h1>
		<div class="cf">
			<form method="post" action="acao/login.php">
				<input type="text" name="cpf" placeholder:"CPF:">
				<input type="text" name="senha" placeholder:"Senha:">
			</form>';
	include("footer.php");
?>