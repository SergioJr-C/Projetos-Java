package R_22_Polimorfismo_EX1_sobrescritaMetodos_Override;

//A classe Principal utiliza, então, as classes para somar e
//multiplicar dois valores:

public class Principal {
	public static void main (String args[]) {
		Soma s = new Soma();
		s.calcular(5,5);
		s.exibeResultado();
		Multiplicacao m = new Multiplicacao();
		m.calcular(5, 5);
		m.exibeResultado();
	}
}
