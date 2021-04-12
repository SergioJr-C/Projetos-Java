package Trabalho_Pratico_2_Resolvido_Pelo_Professor;


public class Elemento {
	
	private Bicicleta bicicleta;	
	private Elemento proximo ;
	
	public Elemento(){}
	
	public Elemento(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	public String toString() {
		return bicicleta.toString();
	}
	
}

