package Exemplo_Lista_Encadeada;

public class Main {
		public static void main(String[] args) {
			
			ListaEncadeada lista = new ListaEncadeada();
			lista.adicionar(new Pessoa( "Gustavo","18/02/1987", "000000-0"));
			lista.adicionar(new Pessoa( "Lilica","18/02/1987", "000000-1"));
			
			
			lista.listar();
			System.out.println("\n");
			
			lista.remover("000000-0");
			lista.listar();
		}
}
