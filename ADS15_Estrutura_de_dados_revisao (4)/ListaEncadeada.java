package REV_03_Lista_Encadeada_EX2;



public class ListaEncadeada {

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
		}
	}
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento.getInfo());
		while(elemento.getProximo() != null) {
			elemento  = elemento.getProximo();
			System.out.println(elemento.getInfo());
		}
	}
	
	public void remover(String info) {
		Elemento elemento = this.inicio;
		if(elemento.getInfo().equals(info)) {
			this.inicio = elemento.getProximo();
		}else {
			while(elemento.getProximo() != null) {
				if(elemento.getProximo().getInfo().equals(info)) {
					elemento.setProximo(elemento.getProximo().getProximo());
				}else {
					elemento = elemento.getProximo();
				}
			}
		}
	}
	
	public void indice(int posicao) {
	      // Se eu passar uma posi��o negativa, � inv�lido...
	      if(posicao < 0){
	         System.out.println("Posi��o Inv�lida.");
	      }else{
	         // Agora aqui, eu percorro a lista, at� chegar na posi��o que eu queria, ou no final dela,
	         // o que ocorrer primeiro... se a posi��o que eu passei for maior que o tamanho da lista,
	         // vou mostrar o �ltimo elemento dela...
	         // Inicio percorrendo a lista:
	         Elemento elemento = this.inicio;
	         int i = 0;
	         // Enquanto n�o chegar no elemento que eu quero, pego o pr�ximo.
	         while (i < posicao){
	            // Aqui significa que a posi��o era maior que a lista.. cheguei ao final dela...
	            // Da� parei o la�o, para mostrar o elemento no final.
	            if(elemento.getProximo() == null) {
	               break;
	            }
	            i++;
	            elemento = elemento.getProximo();
	         }
	         // Aqui imprimo o elemento que eu queria (ou o �ltimo da lista_
	         System.out.println(elemento.getInfo());
	      }
	   }

}


