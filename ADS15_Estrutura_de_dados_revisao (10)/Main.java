package REV_09_Lista_Circular_EX1;

public class Main {

	public static void main(String[] args) {
		
		ListaCircular lista = new ListaCircular();
		lista.adicionar("Gustavo");
		lista.adicionar("José");
		lista.adicionar("Elaine");
		lista.adicionar("Lilica");
		
		//lista.listar();
		System.out.println("\n");
		
		//lista.remover("José");
		
		lista.inserir("Sérgio", 0);
		lista.listar();
	}
}
