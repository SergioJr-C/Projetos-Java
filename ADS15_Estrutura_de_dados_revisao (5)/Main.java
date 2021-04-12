package REV_04_Lista_Encadeada_TRAB_PRATICO_3;

public class Main {
	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();

		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		
		p1.setX(new Double(1));
		p2.setY(new Double(3));
		
		lista.adicionar(p1);
		lista.adicionar(p2);
	
		lista.listar();
		//lista.remover();

	}
}
