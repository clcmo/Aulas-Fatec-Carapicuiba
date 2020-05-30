<?php 
	include ("header.php");
	echo '<h2>'.$titulocadastro.''.$especialidades.'</h2>
    <form method="post" action="acao/'.$link_cadastro.''.$link_especialidades.'">
        <input type="text" name="especialidade" placeholder="Especialidade: ">
        <input type="submit" value="Cadastrar" class="botao">
	</form>';
	include ("footer.php");
?>