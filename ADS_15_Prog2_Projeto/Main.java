package Exemplo_1_Objeto_Pessoa;

public class Main {
	
	public static void main(String[] args) {
		Pessoa sergio = new Pessoa();//inst�ncia do Objeto apartir da classe Pessoa.
		
		sergio.setNome("Sérgio");//set informar
		sergio.setSobrenome("Almeida");
		sergio.setAltura(1.80);
		sergio.setIdade(26);
		sergio.imprimir();
		
		System.out.println(sergio.getNome());//get pegar
		
		
		System.out.println("");
		
		Pessoa negrinho = new Pessoa();//CONSTRUTOR VAZIO
		
		negrinho.setNome("Negrinho");
		negrinho.setSobrenome ( "Da Silva");
		negrinho.setIdade(20);
		negrinho.setAltura (1.00);
		negrinho.imprimir();				
	}
}


//MET�DO BRUTUS		
//sergio.idade = 32;
//sergio.sobrenome = "Almeida";
//sergio.altura = 1.80;
//sergio.imprimir();

//M�TODO BRUTUS
//System.out.println("Nome "+sergio.nome);
//System.out.println("Sobrenome "+ sergio.sobrenome);
//System.out.println("Idade "+sergio.idade);
//System.out.println("Altura "+sergio.altura);

//M�TODO BRUTUS
//System.out.println("Nome "+negrinho.nome);
//System.out.println("Sobrenome "+negrinho.sobrenome);
//System.out.println("Idade "+negrinho.idade);
//System.out.println("Altura "+negrinho.altura);

//M�TODO BRUTUS	
//String nome = "S�rgio";
//String sobrenome = "Almeida";
//int idade = 26;
//double altura = 1.80;
//
//System.out.println("Nome: "+ nome);
//System.out.println("Sobrenome: "+ sobrenome);
//System.out.println("Idade: "+ idade);
//System.out.println("Altura: "+ altura);
//
//String nome2 = "Negrinho";
//String sobrenome2 = "Almeida";
//int idade2 = 10;
//double altura2 = 1.80;
//
//System.out.println("Nome: "+ nome2);
//System.out.println("Sobrenome: "+ sobrenome2);
//System.out.println("Idade: "+ idade2);
//System.out.println("Altura: "+ altura2);
//
//
//String nome3 = "Cristal";
//String sobrenome3 = "Almeida";
//int idade3 = 3;
//double altura3 = 1.00;
//
//System.out.println("Nome: "+ nome3);
//System.out.println("Sobrenome: "+ sobrenome3);
//System.out.println("Idade: "+ idade3);
//System.out.println("Altura: "+ altura3);

//per�odos dispon�veis Gustavo
//2 ultm na ter�a de noite
//tarde quarta feira
//2 p tarde quinta
//segunda e ter�a 17:00/19:00