package REV_15_Fila;

public class Main {
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enfileirar("Gustavo");
		fila.enfileirar("José");
		fila.enfileirar("Elaine");
		fila.enfileirar("Lilica");
		
		String inicio = fila.desenfileirar();
		System.out.println("Elemento removido " + inicio);
		
		inicio = fila.desenfileirar();
		System.out.println("Elemento removido: " + inicio);
	}
}
