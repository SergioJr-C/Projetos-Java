package Exemplo_1_Objeto_Pessoa;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	private double altura;
	
	//obter o nome
	public String getNome() {
		return this.nome;
	}
	
	//informar o nome
	public void setNome(String nome) {//não precisa retornar
		this.nome = nome; //retornar o que está passando por parâmetro
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//CONSTRUTOR VAZIO
	public Pessoa() {
		
	}

	//CONSTRUTOR
public Pessoa(String nome, String sobrenome, int idade, double altura) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.idade = idade;
	this.altura = altura;	
}
	public void imprimir () { //método da classe Pessoa
		System.out.println("Nome: "+this.nome);
		System.out.println("Sobrenome: "+ this.sobrenome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Altura: "+this.altura + "\n");
	}
}
