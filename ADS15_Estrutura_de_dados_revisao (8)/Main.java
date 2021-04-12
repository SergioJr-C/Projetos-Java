package REV_07_Lista_Duplamente_Encadeada_EX1_Inserir;

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
		
		
		lista.inserir("Sérgio", 0);
		lista.listar();
	}
}
