package R_22_Polimorfismo_EX1_sobrescritaMetodos_Override;

public class Soma extends Calculadora {
	double resultado;
	
	public void calcular(double valor1, double valor2) {
		resultado = valor1 + valor2;
	}
	
	public void exibeResultado() {
		System.out.println("O resultado da Soma é: " + resultado);
	}
}

//As classes Soma e Multiplicacao herdam os métodos da
//classe Calculadora, e os implementam de modo diferente,
//cada um com suas características: sobrescrita de métodos