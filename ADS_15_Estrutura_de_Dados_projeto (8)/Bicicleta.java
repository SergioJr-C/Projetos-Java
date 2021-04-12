package Trabalho_Pratico_2;

public class Bicicleta {
	private String id;
	private String marca;
	private String tipo;
	private String valor;
	private String estado;
	
	public Bicicleta() {}
	
	public Bicicleta(String id,String marca,String tipo,String valor, String estado) {
		this.id = id;
		this.marca = marca;
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString() {
		return "ID: " + this.id + "\nMarca: " + this.marca + "\nTipo: " + this.tipo + "\nValor: " +
		this.valor + "\nEstado: " + this.estado + "\n";
		}
}
