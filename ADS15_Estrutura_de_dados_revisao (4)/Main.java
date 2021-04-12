package REV_03_Lista_Encadeada_EX2;

public class Main {
		public static void main(String[] args) {
			
			ListaEncadeada lista = new ListaEncadeada();
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
		}
}
