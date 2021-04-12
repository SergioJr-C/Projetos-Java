package Trabalho_Pratico_2_Resolvido_Pelo_Professor;


public class ListaEncadeada {

	private Elemento inicio;
	private int tamanho;
	
	public ListaEncadeada() {
		this.tamanho = 0;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void adicionar(Bicicleta bicicleta){
		if (this.inicio == null){
			this.inicio = new Elemento(bicicleta);			
		}else{
			Elemento elemento = this.inicio;
			while (elemento.getProximo() != null){
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(bicicleta));
		}
		this.tamanho++;
	}

	public void listar(){
		Elemento elemento = this.inicio;
		System.out.println(elemento);
		while(elemento.getProximo() != null){
			elemento = elemento.getProximo();
			System.out.println(elemento);
		}
	}
	
	public void remover(String id){
		Elemento elemento = this.inicio;
		if (elemento.getBicicleta().getId().equals(id)){
			this.inicio = elemento.getProximo();
			this.tamanho--;
		}else{
			while(elemento.getProximo() != null){
				if(elemento.getProximo().getBicicleta().getId().equals(id)){
					elemento.setProximo(elemento.getProximo().getProximo());
					this.tamanho--;
				}else{
					elemento = elemento.getProximo();
				}
			}
		}
	}		
	
	public Bicicleta buscar(String id){
		Elemento elemento = this.inicio;
		if (elemento.getBicicleta().getId().equals(id)){
			return elemento.getBicicleta();
		}else{
			while(elemento.getProximo() != null){
				if(elemento.getProximo().getBicicleta().getId().equals(id)){
					Bicicleta bike = elemento.getProximo().getBicicleta(); 
					return bike;
				}else{
					elemento = elemento.getProximo();
				}
			}
		}
		return null;
	}
}

