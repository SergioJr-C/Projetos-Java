package REV_06_Lista_Circular;

public class Main {

	public static void main(String[] args) {
		
		ListaCircular lista = new ListaCircular();
		lista.adicionar("Gustavo");
		lista.adicionar("Jos�");
		lista.adicionar("Elaine");
		lista.adicionar("Lilica");
		
		lista.listar();
		System.out.println("\n");
		
		lista.remover("Jos�");
		lista.listar();
	}
}
