
package REV_01_Lista_Encadeada;

public class Elemento{
	
	private String info;
	
	private Elemento proximo;
	
	public Elemento(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}
	

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	
	
}