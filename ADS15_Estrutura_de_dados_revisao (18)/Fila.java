package REV_17_Fila_EX2;

public class Fila {
	
	private Elemento inicio;
	
	private int tamanho;
	
	public Fila() {
		this.tamanho = 0;
	}
		
	
	public int getTamanho() {
		return tamanho;
	}


	public void enfileirar(Paciente paciente) {
		if(this.inicio == null) {
			this.inicio = new Elemento(paciente);
		}else {
			Elemento elemento = this.inicio;
			while(elemento.getProximo() != null) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(paciente));
			
		}
		this.tamanho++;
	}
	
	public Paciente desenfileirar() {
		if(this.inicio == null) {
			return null;
		}else {
			Elemento elemento = this.inicio;
			this.inicio = elemento.getProximo();
			this.tamanho--;
			return elemento.getPaciente();
		}
	}
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento.getPaciente());
		while(elemento.getProximo() != null) {
			elemento  = elemento.getProximo();
			System.out.println(elemento.getPaciente());
		}
	}
	
	
	public int verificarPos(String nome) {
	    Elemento elemento = this.inicio;
	    int cont=0;
	    while (this.inicio != null ) {
       if(!elemento.getPaciente().getNome().equals(nome)){ 
	    	   elemento = elemento.getProximo();
    	   cont++;
       }else{
    	   		System.out.println(cont);
	            return cont;
	            
	       }
	
	   }

	  return -1;
  
	}
}

