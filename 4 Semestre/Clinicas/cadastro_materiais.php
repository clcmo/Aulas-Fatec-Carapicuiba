<?php 
	include ("header.php");
	include ("pdo.php");

	echo '<h2>'.$titulocadastro.''.$materiais.'</h2>
    <form method="post" action="acao/'.$link_cadastro.''.$link_materiais.'">
        <input type="text" name="material" placeholder="Nome do Material: ">
		<p>Tipo:</p> <select name="id_tipo">';
		$sql = "SELECT * FROM tipo_material";
		$con = $conn->query($sql) or die ($conn);
		while($row = $con->fetch(PDO::FETCH_OBJ)){
           	echo "<option value=" . $row->id_tipo . ">". $row->tipo . "</option>";
    	}
		echo'</select></p>
		<input type="text" name="data_com" placeholder="Data de Compra: '.date("d/m/Y").'">
		<input type="text" name="data_val" placeholder="Data de Validade: '.date("d/m/Y").'">
		<input type="submit" value="Cadastrar" class="botao">
	</form>';
	include ("footer.php");
?>