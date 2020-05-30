<?php
	include_once('../pdo.php');
	
	$nome = $_POST["nome"];
	$cpf = $_POST["cpf"];
	$endereco = $_POST["endereco"];
	$numero = $_POST["numero"];
	$bairro = $_POST["bairro"];
	$cidade = $_POST["cidade"];
	$uf = $_POST["uf"];
	$telefone = $_POST["telefone"];
	
	$retornou = false;
	$sql = "SELECT * FROM `paciente`";
	$con = $conn->query($sql) or die ($conn);
	while($row = $con->fetch(PDO::FETCH_OBJ)){
		if($row->nome == $nome){
			$retornou = true;
		}
	}
	
	if($retornou == false){
		$sql = "INSERT INTO `paciente`(`nome`, `cpf`, `endereco`, `numero`, `bairro`, `cidade`, `uf`, `telefone`) VALUES (:nome, :cpf, :endereco, :numero, :bairro, :cidade, :uf, :telefone)";
		$stmt = $conn->prepare($sql);
		$stmt->bindParam(':nome', $nome);
		$stmt->bindParam(':cpf', $cpf);
		$stmt->bindParam(':endereco', $endereco);
		$stmt->bindParam(':numero', $numero);
		$stmt->bindParam(':bairro', $bairro);
		$stmt->bindParam(':cidade', $cidade);
		$stmt->bindParam(':uf', $uf);
		$stmt->bindParam(':telefone', $telefone);
		 
		$result = $stmt->execute();
		 
		if (!$result){
			var_dump($stmt->errorInfo());
			exit;
		} else {
		//	return ("../cadastro_pacientes.php");
			echo "<br> Paciente já cadastrado </br>";
		}
		//return ("../cadastro_pacientes.php");
		echo "<br> Paciente registrado com sucesso </br>";
	}
?>