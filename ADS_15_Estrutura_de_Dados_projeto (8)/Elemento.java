package Trabalho_Pratico_2;

public class Elemento {
	private Bicicleta bicicleta;
	private Elemento proximo;
	
	public Elemento(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

/*

Desenvolva um programa em Java que simule um gerenciador de estoque de bicicletas para aluguel, utilizando listas
encadeadas para armazenar as informações sobre as bicicletas. O sistema deverá armazenar as seguintes
informações sobre cada bicicleta: id, marca, tipo, valor, e estado, permitindo as operações de:

(a) Cadastro ilimitado de bicicletas
(b) Exclusão de bicicleta a partir do id
(c) Recuperar o total de elementos da lista
(d) Listar todos os elementos da lista
(e) Procurar por uma determinada bicicleta na lista a partir do id, e permitir alterá-la caso seja encontrada***.
(f) Gravar a lista de Bicicletas em Arquivo de texto
(g) Recuperar a lista a partir de um arquivo de texto

*** A alteração é uma operação de bônus neste trabalho. Quem realizar, terá bonificação na nota.
Para tanto, o projeto a ser criado deve seguir um padrão. As seguintes classes serão necessárias: Arquivo.java
(fornecida pelo professor), Bicicleta.java, Elemento.java, ListaEncadeada.java, e Main.java.
É imprescindível que seja sobrescrito o método toString() das classes Bicicleta e Elemento, para que essas
classes saibam escrever os atributos já formatados na saída padrão do sistema, para que a classe Arquivo
fornecida funcione corretamente.

A classe Bicicleta deverá armazenar uma bicicleta (id, marca, tipo, valor, e estado). Para isso crie essa classe com
esses atributos (todos do tipo String) e os métodos getters e setters e construtores necessários, e sobrescreva o
método toString() da seguinte forma:

public String toString() {
return "ID: " + this.id + "\nMarca: " + this.marca + "\nTipo: " + this.tipo + "\nValor: " +
this.valor + "\nEstado: " + this.estado + "\n";
}
A classe Elemento deverá armazenar uma Bicicleta e uma referência para o próximo Elemento da Lista Encadeada.
Para isso crie essa classe com esses atributos e os métodos getters e setters e construtores necessários, e sobrescreva
o método toString() da seguinte forma:
public String toString() {
return bicicleta.toString();
}
A classe ListaEncadeada deverá ter um atributo Elemento (inicio), e deverá conter os métodos:
void adicionar(Bicicleta bicicleta)  Esse método adiciona um objeto Bicicleta na lista encadeada.
void remover(String id)  Esse método remove um objeto Bicicleta da lista encadeada.
void listar()  Esse método mostra na tela todos os elementos da lista encadeada.
Bicicleta buscar(String id)  Esse método busca uma Bicicleta pelo ID e retorna uma referência para a mesma.
int tamanho()  Esse método retorna o tamanho total da lista encadeada.
Codifique esses métodos.
2
A classe Arquivo, fornecida pelo professor, sabe como gravar uma ListaEncadeada em um arquivo, e sabe como ler uma ListaEncadeada de um arquivo, simplesmente utilizando os métodos gravar(ListaEncadeada bicicletas) e ler().
Para utilizar a classe Arquivo, simplesmente instancie um objeto da mesma em sua classe Main, passando como parâmetro do construtor o nome do arquivo onde as bicicletas serão gravadas. O nome do arquivo de texto pode ser estático, sempre o mesmo.
A classe Main deverá instanciar uma ListaEncadeada e oferecer as opções de menu para o usuário, de acordo com a descrição dos itens (a) a (g).
O TRABALHO DEVE SER ENTREGUE E APRESENTADO AO FINAL DA AULA 
  
 */
