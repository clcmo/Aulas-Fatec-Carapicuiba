<?php
	include_once('../pdo.php');
	
	$especialidade = $_POST["especialidade"];
	
	$retornou = false;
	$sql = "SELECT * FROM `especialidade`";
	$con = $conn->query($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
		if($row->especialidade == $especialidade){
			$retornou = true;
		}
	}
	
	if($retornou == false){
		$sql = "INSERT INTO `especialidade`(`especialidade`) VALUES (:especialidade)";
		$stmt = $conn->prepare($sql);
		$stmt->bindParam(':especialidade', $especialidade);
		 
		$result = $stmt->execute();
		 
		if (!$result){
			var_dump($stmt->errorInfo());
			exit;
		} else {
			echo "<br> Especialidade já cadastrado </br>";
		}
		echo "<br> Especialidade registrado com sucesso </br>";
	}
?>