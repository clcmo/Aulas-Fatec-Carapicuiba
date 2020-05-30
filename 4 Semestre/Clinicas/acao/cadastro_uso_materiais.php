<?php
	include_once("../pdo.php");
	//include_once("cadastro_funcionarios.php");

	$id_mat = $_POST["id_mat"];
	$id_med = $_POST["id_med"];

	//$id_fun = $_POST["id_fun"];
	if(array_key_exists('data_uso', $_POST)) {
    	$data_uso = "true";
	} else {
    	$data_uso = "false";
	}
	//$data_emi = $_POST["data_emi"];
	/*if(array_key_exists('data_con', $_POST)) {
    	$data_con = "true";
	} else {
    	$data_con = "false";
	}*/
	
	$id_med = $_POST["id_med"];
	//$id_esp = $_POST["id_esp"];
	/*if(array_key_exists('id_esp', $_POST)) {
    	$id_esp = "true";
	} else {
    	$id_esp = "false";
	}*/

	$data_uso = date("d/m/Y");

	$retornou = false;
	$sql = "SELECT * FROM `enc_mat`";
	$con = $conn->query($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
		if($row->id_pac == $id_pac){
			$retornou = true;
		}
	}
	if($retornou == false){
		$sql = "INSERT INTO `enc_mat`(`id_mat`, `data_uso_desc`, `id_med`) VALUES (:id_mat, :data_uso, :id_med)";
			$stmt = $conn->prepare($sql);
			$stmt->bindParam(':id_mat', $id_mat);
			$stmt->bindParam(':data_uso', $data_uso);
			$stmt->bindParam(':id_med', $id_med);
		
			$result = $stmt->execute();
			 
			if (!$result){
				var_dump($stmt->errorInfo());
				exit;
			} else {
			//	return ("../cadastro_pacientes.php");
				echo "<br> Material já encaminhado </br>";
			}
			//return ("../cadastro_pacientes.php");
			echo "<br> Encaminhamento registrado com sucesso </br>";
	}
?>