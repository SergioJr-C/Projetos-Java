package TrabalhoExercicio4_1_Polimorfismo_Jogo_Rapido;

public class Soma extends Calculadora {
	
	public Soma(double valor1, double valor2) {
		super(valor1, valor2);
	}

		public Soma() {
			
		}

	
	public double calcular() {
		return this.valor1 + this.valor2;
	}
	
}
