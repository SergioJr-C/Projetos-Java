package Trabalho_Pratico_2;

public class ListaEncadeada {
	private Elemento inicio;
	private int tam;
	
	public ListaEncadeada() {
		this.tam = 0;
	}
	
	public int getTam() {
		return this.tam;
	}
	
	public void adicionar(Bicicleta bicicleta, int posicao) {
		if(posicao > tam) {
			adicionar(bicicleta);
		} else {
			if(posicao == 0) {
				Elemento elemento = this.inicio;
				this.inicio = new Elemento(bicicleta);
				this.inicio.setProximo(elemento);
			} else {
				int p = 0;
				Elemento elemento = this.inicio;
				while (p < (posicao - 1)) { 
					elemento = elemento.getProximo();
					p++;
				}
				Elemento proximo = elemento.getProximo();
				elemento.setProximo(new Elemento(bicicleta)); 
				elemento.getProximo().setProximo(proximo);			
			}
			this.tam++;
		}
	}
	
	public void adicionar(Bicicleta bicicleta) {
		if (this.inicio == null) {
			this.inicio = new Elemento(bicicleta);
		} else {
			Elemento elemento = this.inicio;
			while (elemento.getProximo() != null) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(bicicleta));
		}
		this.tam++;
	}
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento); 
		while (elemento.getProximo() != null) {
			elemento = elemento.getProximo();
			System.out.println(elemento);
		}
	}

	
	public void buscar(String id) {
		Elemento elemento = this.inicio;
		if (elemento.getBicicleta().getId().equals(id)) { 
			this.inicio = elemento.getProximo();
			listar();
		} else {
			while (elemento.getProximo() != null) {
				if (elemento.getProximo().getBicicleta().getId().equals(id)) {
					elemento.setProximo(elemento.getProximo().getProximo());
			this.tam--;
				} else {
					elemento = elemento.getProximo();
				}
			}
		}
	}
		
	
	public void remover (String id) {
		Elemento elemento = this.inicio;
		if (elemento.getBicicleta().getId().equals(id)) { 
			this.inicio = elemento.getProximo();
			this.tam--;
		} else {
			while (elemento.getProximo() != null) {
				if (elemento.getProximo().getBicicleta().getId().equals(id)) {
					elemento.setProximo(elemento.getProximo().getProximo());
			this.tam--;
				} else {
					elemento = elemento.getProximo();
				}
			}
		}
	}
}
