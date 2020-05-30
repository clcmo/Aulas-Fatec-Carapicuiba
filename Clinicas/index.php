<?php 
	include ("header.php");
	echo '<h2>' .$sobre. '</h2>
	<p>' .$descricao. '</p>
	<hr/>
	<h3 style="text-align: center">Menu de Itens</h3>
	<div class="half left">
		<h4 style="text-align: center">'.$textCadastro.'</h4>
		<ul >
			<li ><a href="'.$link_cadastro. '' .$link_pacientes. '">' .$textPacientes. '</a></li>
			<li ><a href="' .$link_cadastro. ''  .$link_funcionarios. '">' .$textFuncionarios. '</a>
				<ul>
					<li ><a href="' .$link_cadastro. ''  .$link_medicos. '">' .$textMedicos. '</a>
						<ul>
							<li ><a href="' .$link_cadastro. ''  .$link_especialidades. '">' .$textEspecialidades. '</a></li>
						</ul>
					</li>
				</ul>
			</li>
			<li ><a href="' .$link_cadastro. ''  .$link_materiais. '">' .$textMateriais. '</a>
				<ul>
					<li ><a href="' .$link_cadastro. ''  .$link_tipos. '">' .$textTipos. '</a></li>
				</ul>
			</li>
			<li ><a href="' .$link_cadastro. ''  .$link_consultas. '">' .$textConsultas. '</a></li>
			<li ><a href="' .$link_cadastro. ''  .$link_exames. '">' .$textExames. '</a></li>
		</ul>
		<h4 style="text-align: center">'.$textRealiza.'</h4>
		<ul>
			<li ><a href="' .$link_realiza. ''  .$link_consultas. '">' .$textConsultas. '</a></li>
			<li ><a href="' .$link_realiza. ''  .$link_exames. '">' .$textExames. '</a></li>
		</ul>
	</div>
	<div class="half textmoreright">
		<h4 style="text-align: center">'.$textConsulta.'</h4>
		<ul >
			<li ><a href="' .$link_consulta. '' .$link_pacientes. '">' .$textPacientes. '</a></li>
			<li ><a href="' .$link_consulta. ''  .$link_funcionarios. '">' .$textFuncionarios. '</a>
				<ul>
					<li ><a href="' .$link_consulta. ''  .$link_medicos. '">' .$textMedicos. '</a>
						<ul>
							<li ><a href="' .$link_consulta. ''  .$link_especialidades. '">' .$textEspecialidades. '</a></li>
						</ul>
					</li>
				</ul>
			</li>
			<li ><a href="' .$link_consulta. ''  .$link_materiais. '">' .$textMateriais. '</a>
				<ul>
					<li ><a href="' .$link_consulta. ''  .$link_tipos. '">' .$textTipos. '</a></li>
				</ul>
			</li>
			<li ><a href="' .$link_consulta. ''  .$link_consultas. '">' .$textConsultas. '</a></li>
			<li ><a href="' .$link_consulta. ''  .$link_exames. '">' .$textExames. '</a></li>
		</ul>
		<h4 style="text-align: center">'.$textVinculo.'</h4>
		<ul>
			<li><a href="' .$link_vinculo. '' .$link_materiais. '">' .$textMateriais. '</a></li>
		</ul>
	</div>';
	include ("assets/menu.php");
	include ("footer.php");
?>