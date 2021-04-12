package Exercicios;

public class Fila {
	private Elemento inicio;
	private int tam;
	
	public Fila() {
		this.tam = 0;
	}
	
	public int getTam() {
		return this.tam;
	}
	
	public void enfileirar(Paciente pessoa) {
		if(this.inicio == null) {
			this.inicio = new Elemento(pessoa);
		} else {
			Elemento elemento = this.inicio;
			while(elemento.getProx() != null) {
				elemento = elemento.getProx();
			}
			elemento.setProx(new Elemento(pessoa));
		}
		this.tam++;
	}
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento);
		while(elemento.getProx() != null) {
			elemento = elemento.getProx();
			System.out.println(elemento);
		}
	}
	
	public Paciente desenfileirar() {
		if(this.inicio == null) {
			return null;
		} else { 
			Elemento elemento = this.inicio;
			this.inicio = elemento.getProx();
			this.tam--;
			return elemento.getPessoa();
		}
	}
	
	public int posicao(String nome) {
		Elemento elemento = this.inicio;
		int cont = 1;
		while(this.inicio != null) {
	if(!elemento.getPessoa().getNome().equals(nome)) {
			elemento = elemento.getProx();
			cont++;
	} else {
		System.out.println(cont);
			return cont;
	}
		}
		return -1;
	}
}
