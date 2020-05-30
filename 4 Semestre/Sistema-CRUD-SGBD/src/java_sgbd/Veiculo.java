package java_sgbd;

public class Veiculo {
	
	/* 
	 * Ve�culos devem possuir placa, renavam (String), modelo, marca (lincar tabelas, mas � String tb), 
	 * cor (String) e ano de fabrica��o (coloquei Int no lugar do Date)
	 */
	
	private String placa, renavam, modelo, marca, cor;
	private int ano;
	
	
	//criando construtores
	
	public Veiculo(String renavam, String placa, String modelo, String marca, String cor, int ano) {
		setRenavam(renavam);
		setPlaca(placa);
		setModelo(modelo);
		setMarca(marca);
		setCor(cor);
		setAno(ano);
	}
	
	//aqui quero fazer um construtor onde ou a placa ou a renavam s�o suficientes para remover um ve�culo
	
	public Veiculo(String placa, String renavam) {
		//set veiculo para null
		this(null, null, null, null, null, 0);
	}
	
	//getter/setter b�sico, vou modificar ainda

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno_fab() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public void add(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
	}
	
}
