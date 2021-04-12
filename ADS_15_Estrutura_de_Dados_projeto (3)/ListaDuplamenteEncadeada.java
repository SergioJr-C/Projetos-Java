package Exemplo_Lista_Duplamente_Encadeada;

public class ListaDuplamenteEncadeada {
	private Elemento inicio;
	
	
	//Adicionar Elementos
	public void adicionar(String info) {
		if(this.inicio == null) {//Se o in�cio for vazio ele cria um novo elemento
			this.inicio = new Elemento(info);//onde guarda a informa��o de Info
		}else {
			Elemento elemento = this.inicio; //Se o in�cio n�o for vazio, cria-se um novo Elemento que armazena o in�cio. Este novo elemento � a refer�ncia do in�cio.Esse Elemento aponta para o in�cio.
			while (elemento.getProximo() != null) {//Enquanto o elemento.getpr�ximo n�o for vazio 
				elemento = elemento.getProximo();//O elemento vai ser o pr�ximo elemento, ou seja o elemento 1 ser� substitu�do e assim por diante. Atualiza o ponteiro, o elemento � o segundo.
			}
			elemento.setProximo(new Elemento(info));//se elemento.getPr�ximo for nulo aqui ele cria o novo elemento
			elemento.getProximo().setAnterior(elemento);//pega o elemento.getProximo e Atribui o valor para o Anterior, estou dizendo que o anterior � o meu elemento
		}	
	}
	
	//M�todo para listar os Elementos
	/*
	 A id�ia basicamente �, A partir do in�cio imprimir o conte�do do elemento, pegar o pr�ximo e imprimir e assim em diante
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
	
	//M�todo para remover elementos
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
