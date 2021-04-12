package REV_12_Pilha;

public class Main {
		
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.empilhar(new Pessoa("Gustavo","18/12/1987","000000-0"));
		pilha.empilhar(new Pessoa("Pauline","18/12/1988","000000-1"));
		pilha.empilhar(new Pessoa("Lilica","18/12/1987","000000-2"));
		pilha.empilhar(new Pessoa("Nescau","18/12/00","000000-3"));
		
		System.out.println("Toda a Pilha: ");
		pilha.listar();
		
		System.out.println("Removendo o topo: ");
		Pessoa p = pilha.desempilhar();
		System.out.println("Removido da pilha:\n" + p);
		
		System.out.println("Toda a Pilha: ");
		pilha.listar();
		
		System.out.println("Adicionando outro Elemento (novo topo): ");
		pilha.empilhar(new Pessoa("Anita", "18/12/00","000000-4"));
		pilha.listar();
		
		//1
		pilha.vazia();
		//2
		pilha.listar();
		//3
		pilha.tamanho();
	}
}
