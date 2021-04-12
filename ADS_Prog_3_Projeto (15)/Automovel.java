package Exec_3b;


public class Automovel {
	private int id;
	private String marca;
	private String modelo;
	private String ano_fab;
	
	public Automovel() {}			
	
	
	
	public Automovel(String marca, String modelo, String ano_fab) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano_fab = ano_fab;
	}


	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getAno_fab() {
		return ano_fab;
	}



	public void setAno_fab(String ano_fab) {
		this.ano_fab = ano_fab;
	}


	
	public String toString() {
		return "ID: " + this.id + " \nMarca: " + this.marca + " \nModelo: " + this.modelo + " \nAno de Fabricação: " + this.ano_fab + "\n";
	}
}

