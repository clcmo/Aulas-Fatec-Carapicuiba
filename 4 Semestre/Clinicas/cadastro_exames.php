<?php 
	include("header.php");
	include("pdo.php");
	echo'
		<form method="post" action="acao/'.$link_cadastro.''.$link_exames.'">
			<p>Paciente: </p><select name="paciente">';
			$sql = "SELECT * FROM paciente";
			$con = $conn->query($sql) or die ($conn);
			while($row = $con->fetch(PDO::FETCH_OBJ)){
            	echo "<option value=" . $row->id_pac . ">". $row->nome . "</option>";
    		}
			echo'</select><p/>
			<p style="float: left">Data do Agendamento: </p>
			<input type="text" style="width: 50%; float: right" name="data_age" placeholder=" '.date("d/m/Y").'" disabled><p/>
			<p style="float: left">Data do Exame: </p>
			<input type="text" style="width: 50%; float: right" name="data_con" placeholder="'.date("d/m/Y").'"><p/>
			<p>Médico: </p> <select name="id_med">';
			$sql = "SELECT * FROM medico, funcionario where medico.id_fun = funcionario.id_fun";
			$con = $conn->query($sql) or die($conn);
			while($row = $select->fetch(PDO::FETCH_OBJ)) {
				echo '<option value='.$row->id_med.'>'.$row->nome.'</option>';
			}
			echo'</select>
			<input type="submit" value="Agendar Exame" class="botao">
		</form>';
	include("footer.php");
?>