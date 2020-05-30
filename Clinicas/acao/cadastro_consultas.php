<?php
	include_once("../pdo.php");
	//include_once("cadastro_funcionarios.php");

	$id_pac = $_POST["id_pac"];
	//$id_fun = $_POST["id_fun"];
	if(array_key_exists('data_ag', $_POST)) {
    	$data_ag = "true";
	} else {
    	$data_ag = "false";
	}
	//$data_emi = $_POST["data_emi"];
	if(array_key_exists('data_con', $_POST)) {
    	$data_con = "true";
	} else {
    	$data_con = "false";
	}
	
	$id_med = $_POST["id_med"];
	//$id_esp = $_POST["id_esp"];
	/*if(array_key_exists('id_esp', $_POST)) {
    	$id_esp = "true";
	} else {
    	$id_esp = "false";
	}*/

	$data_ag = date("d/m/Y");

	$retornou = false;
	$sql = "SELECT * FROM `ag_consulta`";
	$con = $conn->query($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
		if($row->id_pac == $id_pac){
			$retornou = true;
		}
	}
	if($retornou == false){
		$sql = "INSERT INTO `ag_consulta`(`id_pac`, `id_med`, `data_con`, `data_ag`) VALUES (:id_pac, :id_med, :data_con, :data_ag)";
			$stmt = $conn->prepare($sql);
			$stmt->bindParam(':id_pac', $id_pac);
			$stmt->bindParam(':id_med', $id_med);
			$stmt->bindParam(':data_con', $data_con);
			$stmt->bindParam(':data_ag', $data_ag);
		
			$result = $stmt->execute();
			 
			if (!$result){
				var_dump($stmt->errorInfo());
				exit;
			} else {
			//	return ("../cadastro_pacientes.php");
				echo "<br> Consulta já cadastrado </br>";
			}
			//return ("../cadastro_pacientes.php");
			echo "<br> Consulta registrado com sucesso </br>";
	}
?>