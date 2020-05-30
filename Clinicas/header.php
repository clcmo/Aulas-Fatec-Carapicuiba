<?php 
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
		<!--Conteudo do site-->
		<a href="index.php"><h1 class="page_title">'.$nome_site.'</h1></a>';
		include("assets/menu.php");
		echo '<div class="cf">
		<!-- aqui começa o conteúdo dinâmico -->';
		?>