package Exemplo_Lista_Encadeada;

public class ListaEncadeada {
	private Elemento inicio;
	private int tamanho;
	
	public ListaEncadeada() {
		this.tamanho = 0;
	}

	/* Método para adcionar os Elementos*/
	public void adicionar(Pessoa pessoa) {
		if(this.inicio == null) { 
			this.inicio = new Elemento(pessoa);
		}else {
			Elemento elemento = this.inicio;
			while(elemento.getProximo() != null) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(pessoa));
		}
		this.tamanho++;
	}
	
	/* Método para listar os Elementos*/
	public void listar () {
		Elemento elemento = this.inicio;
		System.out.println(elemento);
		while(elemento.getProximo() !=null) {
			elemento = elemento.getProximo();
			System.out.println(elemento);
		}
	}
	 /* Método para remover os Elementos*/
	public void remover(String cpf) {
		Elemento elemento = this.inicio;
		if(elemento.getPessoa().getCpf().equals(cpf)) {
			this.inicio = elemento.getProximo();
			this.tamanho--;
		}else {
			while(elemento.getProximo() !=null) {
				if(elemento.getProximo().getPessoa().getCpf().equals(cpf)) {
					elemento.setProximo(elemento.getProximo().getProximo());
					this.tamanho--;
				}else {
					elemento = elemento.getProximo();
				}
			}
		}
	}
	

}
