<?php 
	include ("header.php");
	include ("pdo.php");
	//$cons = $_POST[$consulta];
	$achou = false;

	echo'<h2>'.$textConsulta.' de '. $tiposdemateriais.'</h2>
		<table id="customers">
		<tr>
			<th>Codigo</th>
			<th>Tipo</th>
		</tr>
		<tr>';
		$sql = "SELECT * FROM tipo_material";
		$con = $conn->query($sql) or die ($conn);
		while($row = $con->fetch(PDO::FETCH_OBJ)){
        	//if($row->id_pac == $cons || $row->nome == $cons) {
            	echo "<td>" . $row->id_tipo . "</td>";
            	echo "<td>" . $row->tipo . "</td></tr>";
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