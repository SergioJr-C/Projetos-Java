package R_23_Polimorfismo_EX2_sobrecargaMetodos_Overload;


//Logo, em tempo de compila��o, � escolhido qual o m�todo ir� receber a sobrecarga:
public class Principal {
	public static void main (String args[]) {
		Soma s = new Soma();
		s.calcular(5);
		s.exibeResultado();
		s.calcular(5, 3);
		s.exibeResultado();
	}
}
