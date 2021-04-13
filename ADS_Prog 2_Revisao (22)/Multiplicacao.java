package R_22_Polimorfismo_EX1_sobrescritaMetodos_Override;

public class Multiplicacao  extends Calculadora{
	double resultado;
	
	public void calcular(double valor1, double valor2) {
		resultado = valor1 * valor2;
	}
	
	public void exibeResultado() {
		System.out.println("O resultado da Multiplicação é: " + resultado);
	}
}
