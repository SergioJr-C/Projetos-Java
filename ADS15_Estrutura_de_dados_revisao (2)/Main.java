package REV_01_Lista_Encadeada;

public class Main {
		public static void main(String[] args) {
			
			ListaEncadeada lista = new ListaEncadeada();
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
