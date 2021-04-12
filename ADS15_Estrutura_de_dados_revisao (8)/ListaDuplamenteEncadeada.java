package REV_07_Lista_Duplamente_Encadeada_EX1_Inserir;


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
		
	public void inserir(String info, int posicao ) {
        if(posicao == 0){
                Elemento elemento = this.inicio;
                this.inicio = new Elemento(info);
                this.inicio.setProximo(elemento);
                this.inicio.setAnterior(null);
                elemento.setAnterior(this.inicio);
        }else{
                int pos = 0;
                Elemento elemento = this.inicio;
                while (pos < posicao - 1){
                        if(elemento.getProximo().getProximo() == null) {
                                break;
                       }
                        elemento = elemento.getProximo();
                        pos++;
                }
                Elemento proximo = elemento.getProximo();
                elemento.setProximo(new Elemento(info));
                elemento.getProximo().setAnterior(elemento);

                elemento.getProximo().setProximo(proximo);
                proximo.setAnterior(elemento.getProximo());

        }
}

}


//Buenas Sérgio. A ideia do código está ok, porém, tu duplicou algumas partes que estavam no
//código da lista simplesmente encadeada. Na verdade tem que ajustar alguns ponteiros, não basta
//duplicar para o anterior e próximo.
//Vou comentar teu código e colocar uma versão funcional abaixo para que tu verifique.
/*public void inserir(String info, int pos ) {
if(pos == 0){
    Elemento elemento = this.inicio;
    this.inicio = new Elemento(info);
    this.inicio.setProximo(elemento);
    
}else if(pos == 0){
    Elemento elemento = this.inicio;
    this.inicio = new Elemento(info);
    this.inicio.setAnterior(elemento);

}else {
    int p = 0;
    Elemento elemento = this.inicio;
    
    while (p < pos - 1){
        
        if(elemento.getProximo() == null) {
            break;
        }else if(elemento.getAnterior() == null){
         break;
        }
        elemento = elemento.getProximo(); // Aqui, um comando, anula o outro...
        elemento = elemento.getAnterior();
        p++;
    }
    
    // Aqui está duplicando...
    Elemento proximo = elemento.getProximo();
    elemento.setProximo(new Elemento(info));
    elemento.getProximo().setProximo(proximo);
    
    Elemento anterior = elemento.getAnterior();
    elemento.setAnterior(new Elemento(info));
    elemento.getAnterior().setAnterior(anterior);
}
}*/