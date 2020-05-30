<?php 
	include ("header.php");
	include ("pdo.php");
	//$cons = $_POST[$consulta];
	$achou = false;

	echo'<h2>'.$textConsulta.' de '. $especialidades.'</h2>
		<table id="customers">
		<tr>
			<th>Codigo</th>
			<th>Especialidade</th>
		</tr>
		<tr>';
		$sql = "SELECT * FROM especialidade";
		$con = $conn->query($sql) or die ($conn);
		while($row = $con->fetch(PDO::FETCH_OBJ)){
        	//if($row->id_pac == $cons || $row->nome == $cons) {
            	echo "<td>" . $row->id_esp . "</td>";
            	echo "<td>" . $row->especialidade . "</td></tr>";
            	$achou =  true;
        	//}
    	}
		
		if($achou == false) {
        	echo "<td colspan='2'>Não há registros</td>";
    	}
		echo'</tr>
	</table>';
	include ("footer.php");
?>