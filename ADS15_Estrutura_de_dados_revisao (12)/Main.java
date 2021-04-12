package REV_11_Pilha;

public class Main {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.empilhar("Gustavo");
		pilha.empilhar("José");
		pilha.empilhar("Elaine");
		pilha.empilhar("Lilica");
		
		String topo = pilha.desempilhar();
		System.out.println("Elemento removido: " + topo);
		
		topo = pilha.desempilhar();
		System.out.println("Elemento removido: " + topo);
		
	}//o último é o primeiro, é o topo
}
