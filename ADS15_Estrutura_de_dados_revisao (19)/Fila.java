package REV_18_Fila_EX3;

public class Fila {
	
	private Elemento inicio;
	
	private int tamanho;
	
	public Fila() {
		this.tamanho = 0;
	}
		
	
	public int getTamanho() {
		return tamanho;
	}


	public void enfileirar(Valor valor) {
		if(this.inicio == null) {
			this.inicio = new Elemento(valor);
		}else {
			Elemento elemento = this.inicio;
			while(elemento.getProximo() != null) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(valor));
			
		}
		this.tamanho++;
	}
	
	public Valor desenfileirar() {
		if(this.inicio == null) {
			return null;
		}else {
			Elemento elemento = this.inicio;
			this.inicio = elemento.getProximo();
			this.tamanho--;
			return elemento.getValor();
		}
	}
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento.getValor());
		while(elemento.getProximo() != null) {
			elemento  = elemento.getProximo();
			System.out.println(elemento.getValor());
		}
	}
	
	
//	public int verificarPos(String nome) {
//	    Elemento elemento = this.inicio;
//	    int cont=0;
//	    while (this.inicio != null ) {
//       if(!elemento.getValor().getNum().equals(valor)){ 
//	    	   elemento = elemento.getProximo();
//    	   cont++;
//       }else{
//    	   		System.out.println(cont);
//	            return cont;
//	            
//	       }
//	
//	   }
//
//	  return -1;
//  
//	}
}

