package REV_02_Lista_Encadeada_EX1;

public class Main {
		public static void main(String[] args) {
			
			ListaEncadeada lista = new ListaEncadeada();
			lista.adicionar("Gustavo");
			lista.adicionar("Jos�");
			lista.adicionar("Elaine");
			lista.adicionar("Lilica");
			
			//lista.listar();
			System.out.println("\n");
			
		//	lista.remover("Jos�");
		//	lista.listar();
			
			lista.inserir("S�rgio", 0);
			lista.listar();
		}
}
