
package REV_03_Lista_Encadeada_EX2;

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