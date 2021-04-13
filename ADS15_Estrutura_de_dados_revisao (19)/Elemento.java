
package REV_18_Fila_EX3;

public class Elemento{
	
	private Valor valor;
	
	private Elemento proximo;
	
	public Elemento(Valor num) {
		this.valor = num;
	}
	

	public Valor getValor() {
		return valor;
	}


	public void setValor(Valor valor) {
		this.valor = valor;
	}



	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}	
	
}