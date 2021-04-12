package REV_04_Lista_Encadeada_TRAB_PRATICO_3;

public class ListaCircular {
		
	private Elemento inicio;
	
	public void adicionar(Ponto object) {
		if(this.inicio == null) {
			this.inicio = new Elemento();
			this.inicio.setProximo(this.inicio);
		}else {
			Elemento elemento = this.inicio;
			while (!(elemento.getProximo()==(elemento()))) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento());
			elemento.getProximo().setProximo(this.inicio);
		}
	}
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento.getNum());
		while(!(elemento.getProximo().getNum()==(this.inicio.getNum()))) {
			elemento = elemento.getProximo();
			System.out.println(elemento.getNum());
		}
		System.out.println(elemento.getProximo().getNum());
	}
	
	public void remover(double num) {
		Elemento elemento = this.inicio;
		if(elemento.getNum()==(num)) {
			this.inicio = elemento.getProximo();
			while(!(elemento.getProximo().getNum()==(num))) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(this.inicio);
		}else {
			while(!(elemento.getProximo().getNum()==(this.inicio.getNum()))) {
				if(!(elemento.getProximo().getNum()==(num))) {
					elemento = elemento.getProximo();
				}else {
					elemento.setProximo(elemento.getProximo().getProximo());
					break;
				}
			}
		}
	}
	
	
}
