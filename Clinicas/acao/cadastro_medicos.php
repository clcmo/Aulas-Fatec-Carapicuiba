<?php
	include_once("../pdo.php");
	//include_once("cadastro_funcionarios.php");

	$crm = $_POST["crm"];
	//$id_fun = $_POST["id_fun"];
	if(array_key_exists('id_fun', $_POST)) {
    	$id_fun = "true";
	} else {
    	$id_fun = "false";
	}
	//$data_emi = $_POST["data_emi"];
	if(array_key_exists('data_emi', $_POST)) {
    	$data_emi = "true";
	} else {
    	$data_emi = "false";
	}
	
	$data_val = $_POST["data_val"];
	//$id_esp = $_POST["id_esp"];
	if(array_key_exists('id_esp', $_POST)) {
    	$id_esp = "true";
	} else {
    	$id_esp = "false";
	}

	$retornou = false;
	$sql = "SELECT * FROM `medico`";
	$con = $conn->query($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
		if($row->crm == $crm){
			$retornou = true;
		}
	}
	if($retornou == false){
		$sql = "INSERT INTO `medico`(`crm`, `id_fun`, `data_emi`, `data_val`, `id_esp`) VALUES (:crm, :id_fun, :data_emi, :data_val, :id_esp)";
			$stmt = $conn->prepare($sql);
			$stmt->bindParam(':crm', $crm);
			$stmt->bindParam(':id_fun', $id_fun);
			$stmt->bindParam(':data_emi', $data_emi);
			$stmt->bindParam(':data_val', $data_val);
			$stmt->bindParam(':id_esp', $id_esp);
		
			$result = $stmt->execute();
			 
			if (!$result){
				var_dump($stmt->errorInfo());
				exit;
			} else {
			//	return ("../cadastro_pacientes.php");
				echo "<br> Médico já cadastrado </br>";
			}
			//return ("../cadastro_pacientes.php");
			echo "<br> Médico registrado com sucesso </br>";
	}
?>