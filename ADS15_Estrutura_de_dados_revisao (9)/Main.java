package REV_08_Lista_Duplamente_Encadeada_EX2;

public class Main {
	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		lista.adicionar("Gustavo");
		lista.adicionar("José");
		lista.adicionar("Elaine");
		lista.adicionar("Lilica");
		
		lista.listar();
		System.out.println("\n");
		
		//lista.remover("José");
		//lista.listar();
		lista.indice(0);
		lista.indice(1);
		lista.indice(2);
		lista.indice(3);
		
		System.out.println("\n");
		lista.indice(4);
		lista.indice(5);
		lista.indice(6);
		lista.indice(7);
	
	}
}
