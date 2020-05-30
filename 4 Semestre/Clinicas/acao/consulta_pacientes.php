<?php 
	include ("pdo.php");
	
	$sql = "SELECT nome, CPF, end, num_end, bairro_end, cidade, uf FROM pacientes";
	$result = $conn->query($sql);

	if ($result->num_rows > 0) {
		// output data of each row
		while($row = $result->fetch_assoc()) {
			echo "<td>". $row["nome"]. "" . $row["end, num_end"]. " " . $row["bairro_end"]. "".$row["cidade"]."".$row["uf"]."</td>";
		}
	} else {
		echo "Não há resultados";
	}
?>