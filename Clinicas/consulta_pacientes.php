<?php 
	include ("header.php");
	include ("pdo.php");
	//$cons = $_POST[$consulta];
	$achou = false;

	echo'<h2>'.$textConsulta.' de '. $pacientes.'</h2>
	<table id="customers">
		<tr>
			<th>Codigo</th>
			<th>Paciente</th>
			<th>CPF</th>
			<th>Endereço</th>
			<th>Número</th>
			<th>Bairro</th>
			<th>Cidade</th>
			<th>UF</th>
			<th>Telefone</th>
		</tr>
		<tr>';
		$sql = "SELECT * FROM paciente";
		$con = $conn->query($sql) or die ($conn);
		while($row = $con->fetch(PDO::FETCH_OBJ)){
        	//if($row->id_pac == $cons || $row->nome == $cons) {
            	echo "<td>" . $row->id_pac . "</td>";
            	echo "<td>" . $row->nome . "</td>";
            	echo "<td>" . $row->cpf . "</td>";
            	echo "<td>" . $row->endereco . "</td>";
            	echo "<td>" . $row->numero . "</td>";
            	echo "<td>" . $row->bairro . "</td>";
            	echo "<td>" . $row->cidade . "</td>";
            	echo "<td>" . $row->uf . "</td>";
            	echo "<td>" . $row->telefone . "</td></tr>";
            	$achou =  true;
        	//}
    	}
		
		if($achou == false) {
        	echo "<td colspan='9'>Não há registros</td>";
    	}

		echo'</tr>
	</table>';
	include ("footer.php");
?>