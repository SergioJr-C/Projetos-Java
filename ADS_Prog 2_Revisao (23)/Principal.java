package R_23_Polimorfismo_EX2_sobrecargaMetodos_Overload;


//Logo, em tempo de compilação, é escolhido qual o método irá receber a sobrecarga:
public class Principal {
	public static void main (String args[]) {
		Soma s = new Soma();
		s.calcular(5);
		s.exibeResultado();
		s.calcular(5, 3);
		s.exibeResultado();
	}
}
