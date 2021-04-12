package REV_07_Lista_Duplamente_Encadeada_EX1_Inserir;

public class Elemento {
	
	private String info;
	private Elemento anterior;
	private Elemento proximo;
	
	public Elemento(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}
	
	public Elemento getAnterior() {
		return anterior;
	}

	public void setAnterior(Elemento anterior) {
		this.anterior = anterior;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}


	
	
}
