package REV_07_Lista_Duplamente_Encadeada_EX1_Inserir;

public class Main {
	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		lista.adicionar("Gustavo");
		lista.adicionar("Jos�");
		lista.adicionar("Elaine");
		lista.adicionar("Lilica");
		
		lista.listar();
		System.out.println("\n");
		
		//lista.remover("Jos�");
		
		
		lista.inserir("S�rgio", 0);
		lista.listar();
	}
}
