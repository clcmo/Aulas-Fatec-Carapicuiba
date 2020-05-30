<?php 
	include ("header.php");
	include ("pdo.php");
	//$cons = $_POST[$consulta];
	$achou = false;

	echo'<h2>'.$textConsulta.' de '. $medicos.'</h2>
	<table id="customers">
		<tr>
			<th>Codigo</th>
			<th>Médico</th>
			<th>CRM</th>
			<th>Data de Emissão</th>
			<th>Data de Validade</th>
			<th>Especialidade</th>
		</tr>
		<tr>';
		$sql = "SELECT * FROM funcionario, medico, especialidade where (funcionario.id_fun = medico.id_fun and medico.id_esp = especialidade.id_esp)";
		$con = $conn->query($sql) or die ($conn);
		while($row = $con->fetch(PDO::FETCH_OBJ)){
        	//if($row->id_pac == $cons || $row->nome == $cons) {
            	echo "<td>" . $row->id_med . "</td>";
            	echo "<td>" . $row->nome . "</td>";
            	echo "<td>" . $row->crm . "</td>";
            	echo "<td>" . $row->data_emi . "</td>";
            	echo "<td>" . $row->data_val . "</td>";
            	echo "<td>" . $row->especialidade . "</td></tr>";
            	$achou =  true;
        	//}
    	}
		
		if($achou == false) {
        	echo "<td colspan='6'>Não há registros</td>";
    	}
		echo'</tr>
	</table>';
	include ("footer.php");
?>