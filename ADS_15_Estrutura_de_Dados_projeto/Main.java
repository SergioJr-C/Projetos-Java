package Ex_1_ListaEncadeada;

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
	
//	System.out.println("Tam da ListaEnc: " + lista.getTam());
//	
//	lista.remover("000.000.000-01");
//	lista.listar();
//	System.out.println("Tam da ListaEnc: " + lista.getTam());

	}
}
