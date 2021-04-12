package Exemplo_Lista_Duplamente_Encadeada_ListaCircular;

public class ListaDuplamenteEncadeada {
	private Elemento inicio;
	
	
	//Adicionar Elementos
	public void adicionar(String info) {
		if(this.inicio == null) {
			this.inicio = new Elemento(info);
		}else {
			Elemento elemento = this.inicio;
			while (elemento.getProximo() != null) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(info));
			elemento.getProximo().setAnterior(elemento);
		}	
	}
	
	//Método para listar os Elementos
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento.getInfo());
		while (elemento.getProximo() != null) {
			elemento = elemento.getProximo();
			System.out.println(elemento.getInfo());
		}
		while(elemento.getAnterior() != null) {
			elemento = elemento.getAnterior();
			System.out.println(elemento.getInfo());
		}
	}
	
	//Método para remover elementos
	public void remover(String info) {
		Elemento elemento = this.inicio;
		if(elemento.getInfo().equals(info)) {
			this.inicio = elemento.getProximo();
			this.inicio.setAnterior(null);
		}else {
			while(elemento != null) {
				if (elemento.getInfo().equals(info)) {
					if(elemento.getProximo() !=null) {
						elemento.getAnterior().setProximo(elemento.getProximo());
						elemento.getProximo().setAnterior(elemento.getAnterior());
					}else {
						elemento.getAnterior().setProximo(null);
					}
				}
				elemento = elemento.getProximo();
			}
		}
	}
	
}
