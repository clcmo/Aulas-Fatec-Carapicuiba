<?php 
	include ("header.php");
	include ("pdo.php");
	//$cons = $_POST[$consulta];
	$achou = false;

	echo'<h2>'.$textConsulta.' de '. $exames.'</h2>
		<table id="customers">
		<tr>
			<th>Codigo</th>
			<th>Paciente</th>
			<th>CRM do Médico</th>
			<th>Data de Agendamento</th>
			<th>Data da Consulta</th>
		</tr>
		<tr>';
		$sql = "SELECT * FROM ag_exame, paciente, medico where (ag_exame.id_pac = paciente.id_pac && ag_exame.id_med = medico.id_med)";
		$con = $conn->query($sql) or die ($conn);
		while($row = $con->fetch(PDO::FETCH_OBJ)){
        	//if($row->id_pac == $cons || $row->nome == $cons) {
            	echo "<td>" . $row->id_exa . "</td>";
            	echo "<td>" . $row->nome . "</td>";
            	echo "<td>" . $row->crm . "</td>";
            	echo "<td>" . $row->data_ag . "</td>";
            	echo "<td>" . $row->data_con. "</td></tr>";
            	$achou =  true;
        	//}
    	}
		
		if($achou == false) {
        	echo "<td colspan='5'>Não há registros</td>";
    	}
		echo'</tr>
	</table>';
	include ("footer.php");
?>