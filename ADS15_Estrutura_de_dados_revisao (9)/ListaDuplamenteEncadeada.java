package REV_08_Lista_Duplamente_Encadeada_EX2;

public class ListaDuplamenteEncadeada {
	
	private Elemento inicio;
	
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
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento.getInfo());
		while(elemento.getProximo() != null) {
			elemento = elemento.getProximo();
			System.out.println(elemento.getInfo());
		}
		while(elemento.getAnterior() !=null) {
			elemento = elemento.getAnterior();
			System.out.println(elemento.getInfo());
		}
	}
	
	public void remover(String info) {
		Elemento elemento = this.inicio;
		if(elemento.getInfo().equals(info)) {
			this.inicio = elemento.getProximo();
			this.inicio.setAnterior(null);
		}else {
			while(elemento != null) {
				if(elemento.getInfo().equals(info)){
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
		
	public void indice(int posicao) {
        if (posicao < 0) {
        	System.out.println("Posição Inválida");
        }else {
        	Elemento elemento = this.inicio;
        	int i = 0;
        	while (i < posicao){
        		if(elemento.getProximo() == null) {
        			break;
        		}
        		i++;
        		
        			elemento = elemento.getProximo();
            		elemento.setProximo(new Elemento(elemento.getInfo()));
            		elemento.getProximo().setAnterior(elemento);
            		
            		elemento.getProximo().setProximo(elemento.getProximo());
                    elemento.getProximo().setAnterior(elemento.getProximo());
        	}
        	
        	System.out.println(elemento.getInfo());
        
     }
	

}
	
}
