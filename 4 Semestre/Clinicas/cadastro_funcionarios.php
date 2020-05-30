<?php 
	include ("header.php");
	//include_once("pdo.php");
	echo '<h2>'.$titulocadastro.''.$funcionarios.'</h2>
    <form method="post" action="acao/'.$link_cadastro.''.$link_funcionarios.'">
        <input type="text" name="nome" placeholder="Nome Completo: ">
        <input type="text" name="cpf" placeholder="CPF: ">
		<input type="text" name="endereco" placeholder="Endereço: ">
		<input type="text" name="numero" placeholder="Número: ">
		<input type="text" name="bairro" placeholder="Bairro: ">
		<input type="text" name="cidade" placeholder="Cidade: ">
		<p>Estado:</p> <select name="uf">
			<option value="AC">AC</option>
			<option value="AL">AL</option>
			<option value="AP">AP</option>
			<option value="AM">AM</option>
			<option value="BA">BA</option>
			<option value="CE">CE</option>
			<option value="DF">DF</option>
			<option value="ES">ES</option>
			<option value="GO">GO</option>
			<option value="MA">MA</option>
			<option value="MT">MT</option>
			<option value="MS">MS</option>
			<option value="MG">MG</option>
			<option value="PA">PA</option>
			<option value="PB">PB</option>
			<option value="PR">PR</option>
			<option value="PE">PE</option>
			<option value="PI">PI</option>
			<option value="RR">RR</option>
			<option value="RO">RO</option>
			<option value="RJ">RJ</option>
			<option value="RN">RN</option>
			<option value="RS">RS</option>
			<option value="SC">SC</option>
			<option value="SP">SP</option>
			<option value="SE">SE</option>
			<option value="TO">TO</option>
		</select>
		<input type="text" name="telefone" placeholder="Telefone: (11) 00000-0000">
		<input type="submit" value="Cadastrar Funcionario" class="botao">
	</form>';
	include ("footer.php");
?>