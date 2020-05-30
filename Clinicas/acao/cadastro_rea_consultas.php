<?php
	include_once("../pdo.php");
	//include_once("cadastro_funcionarios.php");

	$id_con = $_POST["id_con"];
	//$id_fun = $_POST["id_fun"];
	if(array_key_exists('id_pac', $_POST)) {
    	$id_pac = "true";
	} else {
    	$id_pac = "false";
	}
	//$data_emi = $_POST["data_emi"];
	if(array_key_exists('id_met', $_POST)) {
    	$id_met = "true";
	} else {
    	$id_met = "false";
	}
	
	$valor_cons = $_POST["valor_cons"];
	//$id_esp = $_POST["id_esp"];
	/*if(array_key_exists('id_esp', $_POST)) {
    	$id_esp = "true";
	} else {
    	$id_esp = "false";
	}*/

	$retornou = false;
	$sql = "SELECT * FROM `rea_consulta`";
	$con = $conn->query($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
		if($row->id_con == $id_con){
			$retornou = true;
		}
	}
	if($retornou == false){
		$sql = "INSERT INTO `rea_consulta`(`id_con`, `id_pac`, `id_met`, `valor_cons`) VALUES (:id_con, :id_pac, :id_met, :valor_cons)";
			$stmt = $conn->prepare($sql);
			$stmt->bindParam(':id_con', $id_con);
			$stmt->bindParam(':id_pac', $id_pac);
			$stmt->bindParam(':id_met', $id_met);
			$stmt->bindParam(':valor_cons', $valor_cons);
		
			$result = $stmt->execute();
			 
			if (!$result){
				var_dump($stmt->errorInfo());
				exit;
			} else {
			//	return ("../cadastro_pacientes.php");
				echo "<br> A consulta será realizada </br>";
			}
			//return ("../cadastro_pacientes.php");
			echo "<br> Pagamento registrado com sucesso </br>";
	}
?>