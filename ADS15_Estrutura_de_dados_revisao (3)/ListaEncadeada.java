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
		   // Sérgio, aqui, não entendi porque tu percorreu com um FOR, usando a info como tamanho?
		   // Nas listas encadeadas, sempre percorremos com um WHILE, verificando se temos um próximo
		   // elemento. Assim, o que tu deveria fazer, seria percorrer enquanto tiver próximo e procurando
		   // a posição desejada. Vou comentar teu código, e reescrever abaixo. Observe o que modificarei.
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
		 // Significa que vou inserir na posição 0, ou seja, no início.
	    if(pos == 0){
	        Elemento elemento = this.inicio;
	        this.inicio = new Elemento(info);
	        this.inicio.setProximo(elemento);
	    }else{
	        // Aqui é para os casos onde vou inserir em qualquer outra posição que não seja o início.
	        // Assim, tenho que navegar na minha lista, com o WHILE, até chegar na POSIÇÂO que eu quero
	        // adicionar.. assim dentro do WHILE verifico a posição, e também o getPróximo(), pois se eu
	        // tentar adicionar numa posição maior que os elementos, aí eu adiciono então no final..
	        int p = 0;
	        Elemento elemento = this.inicio;
	        // Aqui eu navego até a posição que eu quero, ou até chegar ao final da lista (o que ocorrer
	        // primeiro)...
	        while (p < pos - 1){
	            // Aqui significa que a posição era maior que a lista.. cheguei ao final dela...
	            // Daí parei o laço, para adicionar o elemento no final.
	            if(elemento.getProximo() == null) {
	                break;
	            }
	            elemento = elemento.getProximo();
	            p++;
	        }
	        // Aqui faço a inserção.. guardando quem era o próximo elemento após o elemento que eu procurei...
	        Elemento proximo = elemento.getProximo();
	        elemento.setProximo(new Elemento(info));
	        elemento.getProximo().setProximo(proximo);
	    }
	}
}

