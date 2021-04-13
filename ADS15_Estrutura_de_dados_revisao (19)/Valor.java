package REV_18_Fila_EX3;

public class Valor {
	private int valor;

		
	public Valor() {}
	
	public Valor(int valor) {
		this.valor = valor;
		
	}

	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String toString() {
		return "Valor: " + this.valor + "\n";
	}
}
