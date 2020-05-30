<?php 
	include ("header.php");
	echo '<h2>'.$titulocadastro.''.$tipos.'</h2>
    <form method="post" action="acao/'.$link_cadastro.''.$link_tipos.'">
        <input type="text" name="tipo" placeholder="Tipo: ">
        <input type="submit" value="Cadastrar" class="botao">
	</form>';
	include ("footer.php");
?>