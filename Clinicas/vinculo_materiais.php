<?php 
	include ("header.php");
	include ("pdo.php");

	echo'<h2>'.$textVinculo.' de '. $materiais.'</h2>
	<form method="post" action="acao/cadastro_uso_materiais.php">
	<p>Material: </p><select name="id_mat">';
	$sql = "SELECT * FROM material";
	$con = $conn->query($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
       	echo "<option value=" . $row->id_mat . ">". $row->material . "</option>";
    }
	echo'</select><p/>
	<p style="float: left">Data do Uso: </p>
	<input type="text" style="width: 50%; float: right" name="data_uso" placeholder="'.date("d/m/Y").'"><p/>
	<p>Médico: </p> <select name="id_med">';
	$sql = "SELECT * FROM medico, funcionario where medico.id_fun = funcionario.id_fun";
	$con = $conn->prepare($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
       	echo "<option value=" . $row->id_med . ">". $row->nome . "</option>";
    }
	echo'</select>
	<input type="submit" value="Usar Material" class="botao">
	</form>';

	include ("footer.php");
?>