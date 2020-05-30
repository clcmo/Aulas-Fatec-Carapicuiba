<?php
	include("header.php");
	include("pdo.php");

	echo'<h2>'.$titulocadastro.''.$medicos.'</h2>
    	<form method="post" action="acao/'.$link_cadastro.''.$link_medicos.'">
    	<input type="text" name="crm" placeholder="CRM: ">
		<p>Médico: </p><select name="id_fun">';
		$sql = "SELECT * FROM funcionario";
		$con = $conn->query($sql) or die ($conn);
		while($row = $con->fetch(PDO::FETCH_OBJ)){
            echo "<option value=" . $row->id_fun . ">". $row->nome . "</option>";
    	}
		echo '</select>
		<input type="text" name="data_emi" placeholder="Data de Emissão: '.date("d/m/Y").'">
		<input type="text" name="data_val" placeholder="Data de Validade: '.date("d/m/Y").'">
		<p>Especialidade:</p><select name="id_esp">';
		$sql = "SELECT * FROM especialidade";
		$con = $conn->query($sql) or die ($conn);
		while($row = $con->fetch(PDO::FETCH_OBJ)){
           	echo "<option value=" . $row->id_esp . ">". $row->especialidade . "</option>";
    	}
		echo'</select>
        <input type="submit" value="Cadastrar" class="botao">
        </form>';
	include("footer.php");
?>