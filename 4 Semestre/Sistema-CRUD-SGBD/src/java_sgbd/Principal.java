package java_sgbd;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		int op;
		String menu = "0-Sair\n 1-Inserir Veículo \n 2-Consultar Veículo \n 3-Remover Veículo pela Placa\n 4-Remover Veículo pelo RENAVAM\n 5-Listar Veículos\n 6-Atualizar Veículo pela Placa";
		Alugai_DAO dao = new Alugai_DAO();
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
				case 0:
					JOptionPane.showMessageDialog(null, "Tchau");
					break;
				case 1:{
					String renavam = JOptionPane.showInputDialog("Informe o RENAVAM: ");
					String placa = JOptionPane.showInputDialog("Informe a placa: ");
					String modelo = JOptionPane.showInputDialog("Informe o modelo: ");
					String marca = JOptionPane.showInputDialog("Informe a marca: ");
					String cor = JOptionPane.showInputDialog("Informe a cor: ");
					int ano = Integer.parseInt (JOptionPane.
							showInputDialog("Informe o ano de fabricação: "));
					Veiculo veiculo = new Veiculo(renavam, placa, modelo, marca, cor, ano);
					dao.inserir(veiculo);
					JOptionPane.showMessageDialog(null, "Beleza, o Veículo foi cadastrado");
					break;
				}					
				case 2:{
					String placa = JOptionPane.showInputDialog("Informe a placa: ");
					Veiculo veiculo = new Veiculo(placa);
					dao.consultar(veiculo);
					JOptionPane.showMessageDialog(null, veiculo);
					break;
				}
				case 3:{
					String placa = JOptionPane.showInputDialog("Informe a placa: ");
					Veiculo veiculo = new Veiculo(placa);
					dao.removerporPlaca(veiculo);
					JOptionPane.showMessageDialog(null, "Ok, removemos o veículo de nossa base.");
					break;
				}
				case 4:{
					String renavam = JOptionPane.showInputDialog("Informe o RENAVAM: ");
					Veiculo veiculo = new Veiculo(renavam);
					dao.removerporRenavam(veiculo);
					JOptionPane.showMessageDialog(null, "Ok, removemos o veículo de nossa base.");
					break;
				}
				case 5:{
					List <Veiculo> veiculos = dao.listar();
					JOptionPane.showMessageDialog(null, veiculos);
					break;
				}
				case 6:{
					String placa = JOptionPane.showInputDialog("Informe a placa: ");
					//pedir os novos detalhes do veículo
					String renavam = JOptionPane.showInputDialog("Informe o RENAVAM: ");
					//String placa = JOptionPane.showInputDialog("Informe a placa: "); 
					//não será necessário, pois a placa (ou a renavam) será a chave primária da tabela
					String modelo = JOptionPane.showInputDialog("Informe o modelo: ");
					String marca = JOptionPane.showInputDialog("Informe a marca: ");
					String cor = JOptionPane.showInputDialog("Informe a cor: ");
					int ano = Integer.parseInt (JOptionPane.
							showInputDialog("Informe o ano de fabricação: "));
					Veiculo veiculo = new Veiculo(renavam, placa, modelo, marca, cor, ano);
					dao.atualizar(veiculo);
					JOptionPane.showMessageDialog (null, "O veículo foi atualizado com sucesso");
					break;
				}
			}
		} while (op != 0);
	}
}
