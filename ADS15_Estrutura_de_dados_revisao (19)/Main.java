package REV_18_Fila_EX3;



public class Main {
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enfileirar(new Valor(5));
		fila.enfileirar(new Valor(5));
		fila.desenfileirar();
		fila.enfileirar(new Valor(5));
		fila.enfileirar(new Valor(5));
		fila.desenfileirar();
		fila.desenfileirar();
		fila.enfileirar(new Valor(5));
		fila.enfileirar(new Valor(5));
		fila.desenfileirar();
		fila.enfileirar(new Valor(5));
		fila.enfileirar(new Valor(6));
		fila.desenfileirar();
		fila.desenfileirar();
		fila.enfileirar(new Valor(4));
		fila.desenfileirar();
		fila.desenfileirar();
		
		fila.listar();
		


		
	}
}
