<?php
	include_once('../pdo.php');
	
	$tipo = $_POST["tipo"];
	
	$retornou = false;
	$sql = "SELECT * FROM `tipo_material`";
	$con = $conn->query($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
		if($row->tipo == $tipo){
			$retornou = true;
		}
	}
	
	if($retornou == false){
		$sql = "INSERT INTO `tipo_material`(`tipo`) VALUES (:tipo)";
		$stmt = $conn->prepare($sql);
		$stmt->bindParam(':tipo', $tipo);
		 
		$result = $stmt->execute();
		 
		if (!$result){
			var_dump($stmt->errorInfo());
			exit;
		} else {
			echo "<br> Tipo já cadastrado </br>";
		}
		echo "<br> Tipo registrado com sucesso </br>";
	}
?>