package Exercício_1_Lista_Encadeada;

public class ListaEncadeada {
	private Elemento inicio;
	private int tam;
	

	
	
	public ListaEncadeada() {
		this.tam = 0;
	}
	
	public int getTam() {
		return this.tam;
	}
	

	public void adicionar(Pessoa pessoa, int posicao) {
		if(posicao > tam) {
			adicionar(pessoa);
		} else {
			if(posicao == 0) {
				Elemento elemento = this.inicio;
				this.inicio = new Elemento(pessoa);
				this.inicio.setProximo(elemento);
			} else {
				int p = 0;
				Elemento elemento = this.inicio;
				while (p < (posicao - 1)) { //tem q encontrar o elemento anterior ao que está sendo indicado
					elemento = elemento.getProximo();
					p++;
				}
				Elemento proximo = elemento.getProximo();//guarda na memória quem era o próximo elemento
				elemento.setProximo(new Elemento(pessoa));//depois set o nome elemento q está selecionando, o próximo elemento do novo elemento era o próximo q  tinha antes 
				elemento.getProximo().setProximo(proximo);//			
			}
			this.tam++;
		}
	}
	
	//esse método é o exercicio 2, o restante é o 1
//	public void mostraPos(Pessoa pessoa, int pos) { //mostrar o elemento de uma posição específa
//		if (pessoa.getPessoa().equals(pos)) {
//			System.out.println(this.pos());
//		}	
//	}
	
	public void adicionar(Pessoa pessoa) {
		if (this.inicio == null) {
			this.inicio = new Elemento(pessoa);
		} else {
			Elemento elemento = this.inicio;
			while (elemento.getProximo() != null) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(pessoa));
		}
		this.tam++;
	}
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento); //n prscisa colocar 'elemento.getPessoa', pois vai imprimir o elemento e dentro do elemento já está o toString q contem o elemento 
		while (elemento.getProximo() != null) {
			elemento = elemento.getProximo();
			System.out.println(elemento);
		}
	}
	
	public void remover (String cpf) {//cpf que identifica a pessoa, nesse caso
		Elemento elemento = this.inicio;
		if (elemento.getPessoa().getCpf().equals(cpf)) { //Se a pessoa q vai ser removida é igual ao cpf
			this.inicio = elemento.getProximo();
			this.tam--;
		} else {
			while (elemento.getProximo() != null) {
				if (elemento.getProximo().getPessoa().getCpf().equals(cpf)) {
					elemento.setProximo(elemento.getProximo().getProximo());
			this.tam--;
				} else {
					elemento = elemento.getProximo();
				}
			}
		}
	}
	

	

	
}

