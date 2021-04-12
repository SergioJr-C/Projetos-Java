package REV_02_Lista_Encadeada_EX1;

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
	
	
	public void inserir(String info, int pos ) {
		   // S�rgio, aqui, n�o entendi porque tu percorreu com um FOR, usando a info como tamanho?
		   // Nas listas encadeadas, sempre percorremos com um WHILE, verificando se temos um pr�ximo
		   // elemento. Assim, o que tu deveria fazer, seria percorrer enquanto tiver pr�ximo e procurando
		   // a posi��o desejada. Vou comentar teu c�digo, e reescrever abaixo. Observe o que modificarei.
	//	Elemento elemento = this.inicio;
	 //for (int i = 0; i < info.length(); i++) {
		//if((i>=0)&&(elemento.getProximo() !=null)) {
		//elemento = elemento.getProximo();
		//}else {
		//this.inicio = new Elemento(info);
		//this.inicio = elemento.getProximo();
		//elemento.setProximo(new Elemento(info));
		//}
		// }
		 // Significa que vou inserir na posi��o 0, ou seja, no in�cio.
	    if(pos == 0){
	        Elemento elemento = this.inicio;
	        this.inicio = new Elemento(info);
	        this.inicio.setProximo(elemento);
	    }else{
	        // Aqui � para os casos onde vou inserir em qualquer outra posi��o que n�o seja o in�cio.
	        // Assim, tenho que navegar na minha lista, com o WHILE, at� chegar na POSI��O que eu quero
	        // adicionar.. assim dentro do WHILE verifico a posi��o, e tamb�m o getPr�ximo(), pois se eu
	        // tentar adicionar numa posi��o maior que os elementos, a� eu adiciono ent�o no final..
	        int p = 0;
	        Elemento elemento = this.inicio;
	        // Aqui eu navego at� a posi��o que eu quero, ou at� chegar ao final da lista (o que ocorrer
	        // primeiro)...
	        while (p < pos - 1){
	            // Aqui significa que a posi��o era maior que a lista.. cheguei ao final dela...
	            // Da� parei o la�o, para adicionar o elemento no final.
	            if(elemento.getProximo() == null) {
	                break;
	            }
	            elemento = elemento.getProximo();
	            p++;
	        }
	        // Aqui fa�o a inser��o.. guardando quem era o pr�ximo elemento ap�s o elemento que eu procurei...
	        Elemento proximo = elemento.getProximo();
	        elemento.setProximo(new Elemento(info));
	        elemento.getProximo().setProximo(proximo);
	    }
	}
}

