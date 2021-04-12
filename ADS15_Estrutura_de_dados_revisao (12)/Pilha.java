package REV_11_Pilha;

public class Pilha {
	private Elemento topo;
	
	public void empilhar(String info) {
		if(this.topo == null) {
			this.topo = new Elemento(info);
		}else {
			Elemento elemento = this.topo;
			this.topo = new Elemento(info);
			this.topo.setProximo(elemento);;
		}
	}
	
	public String desempilhar() {
		if(this.topo == null) {
			return null;
		}else {
			Elemento elemento = this.topo;
			this.topo = elemento.getProximo();
			return elemento.getInfo();
		}
	}
	
	
	
}
