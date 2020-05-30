	<?php 
		echo'<div class="side_menu">
			<div class="burger_box">
				<div class="menu-icon-container">
					<a href="#" class="menu-icon js-menu_toggle closed">
						<span class="menu-icon_box">
							<span class="menu-icon_line menu-icon_line--1"></span>
							<span class="menu-icon_line menu-icon_line--2"></span>
							<span class="menu-icon_line menu-icon_line--3"></span>
						</span>
					</a>
				</div>
		</div>
		<div class="container">
			<h2 class="menu_title">'.$textCadastro.'</h2>
				<ul class="list_load">
					<li class="list_item"><a href="'.$link_cadastro. '' .$link_pacientes. '">' .$textPacientes. '</a></li>
					<li class="list_item"><a href="' .$link_cadastro. ''  .$link_funcionarios. '">' .$textFuncionarios. '</a>
						<ul>
							<li class="list_item"><a href="' .$link_cadastro. ''  .$link_medicos. '">' .$textMedicos. '</a>
								<ul>
									<li class="list_item"><a href="' .$link_cadastro. ''  .$link_especialidades. '">' .$textEspecialidades. '</a></li>
								</ul>
							</li>
						</ul>
					</li>
					<li class="list_item"><a href="' .$link_cadastro. ''  .$link_materiais. '">' .$textMateriais. '</a>
						<ul>
							<li class="list_item"><a href="' .$link_cadastro. ''  .$link_tipos. '">' .$textTipos. '</a></li>
						</ul>
					</li>
					<li class="list_item"><a href="' .$link_cadastro. ''  .$link_consultas. '">' .$textConsultas. '</a></li>
					<li class="list_item"><a href="' .$link_cadastro. ''  .$link_exames. '">' .$textExames. '</a></li>
					<h2 class="menu_title">'.$textConsulta.'</h2>
					<ul class="list_load">
						<li class="list_item"><a href="' .$link_consulta. '' .$link_pacientes. '">' .$textPacientes. '</a></li>
						<li class="list_item"><a href="' .$link_consulta. ''  .$link_funcionarios. '">' .$textFuncionarios. '</a>
							<ul>
								<li class="list_item"><a href="' .$link_consulta. ''  .$link_medicos. '">' .$textMedicos. '</a>
									<ul>
										<li class="list_item"><a href="' .$link_consulta. ''  .$link_especialidades. '">' .$textEspecialidades. '</a></li>
									</ul>
								</li>
							</ul>
						</li>
						<li class="list_item"><a href="' .$link_consulta. ''  .$link_materiais. '">' .$textMateriais. '</a>
							<ul>
								<li class="list_item"><a href="' .$link_consulta. ''  .$link_tipos. '">' .$textTipos. '</a></li>
							</ul>
						</li>
						<li class="list_item"><a href="' .$link_consulta. ''  .$link_consultas. '">' .$textConsultas. '</a></li>
						<li class="list_item"><a href="' .$link_consulta. ''  .$link_exames. '">' .$textExames. '</a></li>
					</ul>
					<h2 class="menu_title">'.$textVinculo.'</h2>
					<ul class="list_load">
						<li class="list_item"><a href="' .$link_vinculo. '' .$link_materiais. '">' .$textMateriais. '</a></li>
					</ul>
					
			</div>
		</div>';
	?>