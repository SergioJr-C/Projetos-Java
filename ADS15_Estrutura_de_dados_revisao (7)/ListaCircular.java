package REV_06_Lista_Circular;

public class ListaCircular {
		
	private Elemento inicio;
	
	public void adicionar(String info) {
		if(this.inicio == null) {
			this.inicio = new Elemento(info);
			this.inicio.setProximo(this.inicio);
		}else {
			Elemento elemento = this.inicio;
			while (!elemento.getProximo().getInfo().equals(this.inicio.getInfo())) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(info));
			elemento.getProximo().setProximo(this.inicio);
		}
	}
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento.getInfo());
		while(!elemento.getProximo().getInfo().equals(this.inicio.getInfo())) {
			elemento = elemento.getProximo();
			System.out.println(elemento.getInfo());
		}
		System.out.println(elemento.getProximo().getInfo());
	}
	
	public void remover(String info) {
		Elemento elemento = this.inicio;
		if(elemento.getInfo().equals(info)) {
			this.inicio = elemento.getProximo();
			while(!elemento.getProximo().getInfo().equals(info)) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(this.inicio);
		}else {
			while(!elemento.getProximo().getInfo().equals(this.inicio.getInfo())) {
				if(!elemento.getProximo().getInfo().equals(info)) {
					elemento = elemento.getProximo();
				}else {
					elemento.setProximo(elemento.getProximo().getProximo());
					break;
				}
			}
		}
	}
	
	
}
