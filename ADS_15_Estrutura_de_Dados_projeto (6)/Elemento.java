package Exemplo_ListaEncad_ReferObjetos;


public class Elemento {
	
	private int info;
	
	/*Onde será guardado a referência, não é um objeto */
	private Elemento proximo;
	
	public Elemento(){}
	
	public Elemento(int info) {
		this.info = info;
	}
	

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}
	

	
	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return this.info + " ";
	}
}
