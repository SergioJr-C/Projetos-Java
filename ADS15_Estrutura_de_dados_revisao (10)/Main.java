package REV_09_Lista_Circular_EX1;

public class Main {

	public static void main(String[] args) {
		
		ListaCircular lista = new ListaCircular();
		lista.adicionar("Gustavo");
		lista.adicionar("Jos�");
		lista.adicionar("Elaine");
		lista.adicionar("Lilica");
		
		//lista.listar();
		System.out.println("\n");
		
		//lista.remover("Jos�");
		
		lista.inserir("S�rgio", 0);
		lista.listar();
	}
}
