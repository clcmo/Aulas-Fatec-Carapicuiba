<?php 
	include("header.php");
	include_once("pdo.php");
	echo'<h2>'.$textRealizacao.' de '.$textConsultas.'</h2>
		<form method="post" action="acao/'.$link_cadastro.'rea_'.$link_consultas.'">
			<p>Paciente e Consulta: </p><select name="id_pac">';
			$sql = "SELECT * FROM ag_consulta, paciente where ag_consulta.id_pac = paciente.id_pac";
			$con = $conn->query($sql) or die ($conn);
			while($row = $con->fetch(PDO::FETCH_OBJ)){
            	echo "<option value=" . $row->id_con . ">". $row->cpf.' -> '.$row->nome . "</option>";
            }
			echo'</select>';
			$sql = "SELECT * FROM ag_consulta";
			$con = $conn->query($sql) or die ($conn);
			while($row = $con->fetch(PDO::FETCH_OBJ)){
            	echo '<input type="text" name="data_con" placeholder="Data da Consulta: ' .$row->data_con . '" disabled>';
            }
			echo '<p>Método de Pagamento: </p> <select name="met_pag">';
			$sql = "SELECT * FROM met_pag";
			$con = $conn->query($sql) or die ($conn);
			while($row = $con->fetch(PDO::FETCH_OBJ)){
            	echo "<option value=" . $row->id_met . ">". $row->met_pag . "</option>";
    		}
			echo'</select>
			<input type="text" name="valor_cons" placeholder="R$15,00">
			<input type="submit" value="Realizar Pagamento" class="botao">
		</form>';
	include("footer.php");
?>