package Exemplo_Lista_Duplamente_Encadeada;

public class ListaDuplamenteEncadeada {
	private Elemento inicio;
	
	
	//Adicionar Elementos
	public void adicionar(String info) {
		if(this.inicio == null) {//Se o início for vazio ele cria um novo elemento
			this.inicio = new Elemento(info);//onde guarda a informação de Info
		}else {
			Elemento elemento = this.inicio; //Se o início não for vazio, cria-se um novo Elemento que armazena o início. Este novo elemento é a referência do início.Esse Elemento aponta para o início.
			while (elemento.getProximo() != null) {//Enquanto o elemento.getpróximo não for vazio 
				elemento = elemento.getProximo();//O elemento vai ser o próximo elemento, ou seja o elemento 1 será substituído e assim por diante. Atualiza o ponteiro, o elemento é o segundo.
			}
			elemento.setProximo(new Elemento(info));//se elemento.getPróximo for nulo aqui ele cria o novo elemento
			elemento.getProximo().setAnterior(elemento);//pega o elemento.getProximo e Atribui o valor para o Anterior, estou dizendo que o anterior é o meu elemento
		}	
	}
	
	//Método para listar os Elementos
	/*
	 A idéia basicamente é, A partir do início imprimir o conteúdo do elemento, pegar o próximo e imprimir e assim em diante
	 */
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento.getInfo());
		while (elemento.getProximo() != null) {
			elemento = elemento.getProximo();
			System.out.println(elemento.getInfo());
		}
		while(elemento.getAnterior() != null) {
			elemento = elemento.getAnterior();
			System.out.println(elemento.getInfo());
		}
	}
	
	//Método para remover elementos
	public void remover(String info) {
		Elemento elemento = this.inicio;
		if(elemento.getInfo().equals(info)) {
			this.inicio = elemento.getProximo();
			this.inicio.setAnterior(null);
		}else {
			while(elemento != null) {
				if (elemento.getInfo().equals(info)) {
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
	
}
