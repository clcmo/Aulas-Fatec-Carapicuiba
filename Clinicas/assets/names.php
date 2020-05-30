<?php

	function remover_caracter($string) {
		$string = preg_replace("/[áàâãä]/", "a", $string);
		$string = preg_replace("/[ÁÀÂÃÄ]/", "A", $string);
		$string = preg_replace("/[éèê]/", "e", $string);
		$string = preg_replace("/[ÉÈÊ]/", "E", $string);
		$string = preg_replace("/[íì]/", "i", $string);
		$string = preg_replace("/[ÍÌ]/", "I", $string);
		$string = preg_replace("/[óòôõö]/", "o", $string);
		$string = preg_replace("/[ÓÒÔÕÖ]/", "O", $string);
		$string = preg_replace("/[úùü]/", "u", $string);
		$string = preg_replace("/[ÚÙÜ]/", "U", $string);
		$string = preg_replace("/ç/", "c", $string);
		$string = preg_replace("/Ç/", "C", $string);
		$string = preg_replace("/[][><}{)(:;,!?*%~^`@]/", "", $string);
		$string = preg_replace("/ /", "_", $string);
		return $string;
	}
	
	//rodape
	$clcmo = "CLCMO";
	$clcmo_link = "//clcmo.github.io";
	
	$rodape = "Copyright &copy; " .date("Y")." <a href=".$clcmo_link. ">" .$clcmo." </a>";
	
	
	//definindo os nomes das páginas
	$nome_site = "Sistema de Gestão de Clinica Medica";
	$descricao = "App realizada por <a href=" .$clcmo_link. ">" .$clcmo. "</a>";
	$sobre = "Sobre";
	$menu = "Menu";
	
	
	
	
	//cadastro, consulta, agendamento e cancelamento: titulos
	$textAgendamento = "Agendamento";
	$agendamento = mb_strtolower($textAgendamento);
	
	$textEspecialidade = "Especialidade";
	//$especialidade = mb_strtolower($textEspecialidade);

	$textEspecialidades = "Especialidades";
	$especialidades = mb_strtolower($textEspecialidades);
	
	$textCadastro = "Cadastro";
	$cadastro = mb_strtolower($textCadastro);
	
	$textVinculo = "Vinculo";
	$vinculo = mb_strtolower($textVinculo);
	
	$textVinculos = "Vinculos";
	$vinculos = mb_strtolower($textVinculos);
	
	$textConsulta = "Consulta";
	$consulta = mb_strtolower($textConsulta);
	
	$textConsultas = "Consultas";
	$consultas = mb_strtolower($textConsultas);
	
	$textCancelamento = "Cancelamento";
	$cancelamento = mb_strtolower($textCancelamento);
	
	$textPacientes = "Pacientes";
	$pacientes = mb_strtolower($textPacientes);

	$textRealiza = "Realiza";
	$realiza = mb_strtolower($textRealiza);
	$link_realiza = "".$realiza."_";
	$textRealizacao = "Realização";
	$realizacao = mb_strtolower($textRealizacao);
	
	$textMateriais = "Materiais";
	$materiais = mb_strtolower($textMateriais);
	
	$textTipos = "Tipos";
	$textTiposdeMateriais = "".$textTipos. " de ". $textMateriais;
	$tipos = mb_strtolower($textTipos);
	$tiposdemateriais = mb_strtolower($textTiposdeMateriais);
	
	$textFuncionarios = "Funcionarios";
	$funcionarios = mb_strtolower($textFuncionarios);
	
	$textMedicos = "Medicos";
	$medicos = mb_strtolower($textMedicos);
	
	$textSalas = "Salas";
	$salas = mb_strtolower($textSalas);
	
	$textRecepcao ="Recepção";
	$recepcao = mb_strtolower($textRecepcao);
	
	$textExames ="Exames";
	$exames = mb_strtolower($textExames);
	
	$titulocadastro = "".$textCadastro. " de ";
	$tituloconsulta = "".$textConsulta. " de ";
	$titulovinculo = "".$textVinculo. " de ";
	
	$tituloagendamento = "".$textAgendamento. " de ";
	$titulocancelamento = "".$textCancelamento. "de ";
	
	
	$link_cadastro = "".$cadastro."_";
	$link_consulta = "".$consulta."_";
	
	$link_consultas = "".$consultas.".php";
	$link_pacientes = "".$pacientes.".php";
	$link_funcionarios = "".$funcionarios.".php";
	$link_materiais = "".$materiais.".php";
	$link_tipos = "".$tipos.".php";	
	$link_exames = "".$exames.".php";
	$link_medicos = "".$medicos.".php";	
	$link_especialidades = "".$especialidades.".php";
	$link_vinculo = "".$vinculo."_";	
?>