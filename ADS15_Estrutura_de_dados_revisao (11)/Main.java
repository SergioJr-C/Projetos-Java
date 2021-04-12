package REV_10_Lista_Circular_EX2;

public class Main {

	public static void main(String[] args) {
		
		ListaCircular lista = new ListaCircular();
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
		lista.indice(4);
		lista.indice(5);
	}
}
