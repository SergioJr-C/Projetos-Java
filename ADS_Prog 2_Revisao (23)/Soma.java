package R_23_Polimorfismo_EX2_sobrecargaMetodos_Overload;

public class Soma extends Calculadora {
	double resultado;
	
	public void calcular(double valor1, double valor2) {
		resultado = valor1 + valor2;
	}
	
	public void calcular(double valor1) {
		resultado = valor1 + 50;
	}
	
	public void exibeResultado() {
		System.out.println("O resultado da Soma é: " + resultado);
	}
}

//A classes Soma herda os métodos e atributos da classe
//Calculadora, porém o método calcular pode receber
//parâmetros diferentes e realizar uma operação diferente
//(em tempo de compilação): sobrecarga de método
