<?php
	define('MYSQL_HOST', 'localhost');
	define('MYSQL_USER', 'adm_clc');
	define('MYSQL_PASSWORD', 'yMcgoImF85t6wdTH');
	define('MYSQL_DB_NAME', 'clinica');
	
	try{
		$conn = new PDO( 'mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD );
		// set the PDO error mode to exception
		//$conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
	} catch(PDOException $e) {
		echo 'Erro ao conectar com o MySQL: ' . $e->getMessage();
    }
	
	//$conn = null;
	$conn->exec("set names utf8");
?>