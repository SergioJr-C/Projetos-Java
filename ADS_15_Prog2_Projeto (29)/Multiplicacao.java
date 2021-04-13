package TrabalhoExercicio4_1_Polimorfismo_Jogo_Rapido;

public class Multiplicacao extends Calculadora {
	
	
	public Multiplicacao(double valor1, double valor2) {
		super(valor1, valor2);
	}

		public Multiplicacao() {
			
		}

	
	public double calcular() {
		return this.valor1 * this.valor2;
	}

}
