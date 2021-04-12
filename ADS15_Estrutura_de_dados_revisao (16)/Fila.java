package REV_15_Fila;

public class Fila {
	private Elemento inicio;
	
	public void enfileirar(String info) {
		if(this.inicio == null) {
			this.inicio = new Elemento(info);
		}else {
			Elemento elemento = this.inicio;
			while(elemento.getProximo() != null) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(info));
		}
	}
	
	public String desenfileirar() {
		if(this.inicio == null) {
			return null;
		}else {
			Elemento elemento = this.inicio;
			this.inicio = elemento.getProximo();
			return elemento.getInfo();
		}
	}
}
