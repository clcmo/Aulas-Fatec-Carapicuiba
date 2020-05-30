package java_sgbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Alugai_DAO {

	public void inserir (Veiculo veiculo) throws SQLException {
		//1. Especificar o comando sql
		String sql = "INSERT INTO veiculo (renavam, placa, modelo, marca, cor, ano) VALUES (?, ?, ?, ?, ?,?)";
		Connection conn = null;
		try{
			//2. Abrir o canal de comunicação, ou seja, fabricar uma conexão
			conn = ConnectionFactory.getConnection();
			//3. pré compilar o comando sql
			PreparedStatement ps = conn.prepareStatement(sql);
			//4 Preencher os place holders
			ps.setString(1, veiculo.getRenavam());
			ps.setString(2, veiculo.getPlaca());
			ps.setString(3, veiculo.getModelo());
			ps.setString(4, veiculo.getMarca());
			ps.setString(5, veiculo.getCor());
			ps.setInt(3, veiculo.getAno_fab());
			//5 Executar o comando
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.CloseConnection();
		}
	}
	
	public void atualizar (Veiculo veiculo) {
		//1. Especificar o comando sql
		String sql = "UPDATE livro SET renavam = ?, modelo = ?, marca = ?, cor = ?, ano = ? WHERE placa = ?";
		//2 Abrir a conexao
		//3 Pre compilar o comando sql
		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)){
			//4 Preencher os place holders
			ps.setString(1, veiculo.getRenavam());
			ps.setString(2, veiculo.getPlaca());
			ps.setString(3, veiculo.getModelo());
			ps.setString(4, veiculo.getMarca());
			ps.setString(5, veiculo.getCor());
			ps.setInt(3, veiculo.getAno_fab());
			//5 executar
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void removerporPlaca (Veiculo veiculo) {
		//1 Especificar o comando sql
		String sql = "DELETE veiculo WHERE placa = ?";
		//2 Abrir a conexão com o banco
		//3 Pré compilar o comando sql
		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);){
			//4 Preencher os place holders
			ps.setString(1, veiculo.getPlaca());
			//5 executar
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerporRenavam (Veiculo veiculo) {
		//1 Especificar o comando sql
		String sql = "DELETE veiculo WHERE renavam = ?";
		//2 Abrir a conexão com o banco
		//3 Pré compilar o comando sql
		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);){
			//4 Preencher os place holders
			ps.setString(1, veiculo.getRenavam());
			//5 executar
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List <Veiculo> listar (){
		List <Veiculo> veiculos = new ArrayList <> ();
		String sql = "SELECT * FROM veiculo";
		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()){
				while (rs.next()) {
					String placa = rs.getString("placa");
					String renavam = rs.getString ("renavam");
					String modelo = rs.getString("modelo");
					String marca = rs.getString ("marca"); 
					String cor = rs.getString("cor");
					int ano = rs.getInt("ano");
					Veiculo veiculo = new Veiculo (placa, renavam, modelo, marca, cor, ano);
					veiculo.add(veiculo);
				}
		}catch (SQLException e) {
			e.printStackTrace();
		} return veiculos;	
	}
	
	public void consultar(Veiculo veiculo) {
		//1. Especificar o comando sql
		String sql = "SELECT * FROM veiculo WHERE placa = ?";
		//2 Abrir a conexao
		//3 Pre compilar o comando sql
		try (Connection conn = ConnectionFactory.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery()){
			String placa = rs.getString("placa");
			String renavam = rs.getString ("renavam");
			String modelo = rs.getString("modelo");
			String marca = rs.getString ("marca"); 
			String cor = rs.getString("cor");
			int ano = rs.getInt("ano");
			veiculo = new Veiculo (placa, renavam, modelo, marca, cor, ano);
			veiculo.add(veiculo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
