package Exercício_1_Lista_Encadeada;

public class Main {
	public static void main (String args[]) {
	
	ListaEncadeada lista = new ListaEncadeada();
	lista.adicionar(new Pessoa("Letícia", "10/01/1998", "000.000.000-00"));
	lista.adicionar(new Pessoa("Sérgio", "29/10/1993", "000.000.000-01"));
	lista.adicionar(new Pessoa("Lulu", "01.01.2020", "000.000.000-02"));
	
	lista.adicionar(new Pessoa("Jujuba", "02.02.2020", "000.000.000-02"), 2);
	//lista.adicionar(new Pessoa());
	
	lista.listar();
	

//	System.out.println("\n");
	
	
	//usar no auxilio para exibir a posição
//	System.out.println("Tamanho da Lista Encadeada: " + lista.getTam());
//	
//	lista.remover("000.000.000-01");
//	lista.listar();
//	System.out.println("Tam da ListaEnc: " + lista.getTam());

	}
}
