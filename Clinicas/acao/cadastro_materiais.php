<?php
	include_once('../pdo.php');
	
	//$material = $_POST["material"];
	if(array_key_exists('material', $_POST)) {
    	$material = "true";
	} else {
    	$material = "false";
	}
	$id_tipo = $_POST["id_tipo"];
	//$data_com = $_POST["data_com"];
	if(array_key_exists('data_com', $_POST)) {
    	$data_com = "true";
	} else {
    	$data_com = "false";
	}
	$data_val = $_POST["data_val"];
	
	$retornou = false;
	$sql = "SELECT * FROM `material`";
	$con = $conn->query($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
		if($row->material == $material){
			$retornou = true;
		}
	}
	
	if($retornou == false){
		$sql = "INSERT INTO `material`(`material`, `data_com`, `data_val`, `id_tipo`) VALUES (:material, :data_com, :data_val, :id_tipo)";
		$stmt = $conn->prepare($sql);
		$stmt->bindParam(':material', $material);
		$stmt->bindParam(':data_com', $data_com);
		$stmt->bindParam(':data_val', $data_val);
		$stmt->bindParam(':id_tipo', $id_tipo);
		 
		$result = $stmt->execute();
		 
		if (!$result){
			var_dump($stmt->errorInfo());
			exit;
		} else {
			echo "<br> material já cadastrado </br>";
		}
		echo "<br> material registrado com sucesso </br>";
	}
?>