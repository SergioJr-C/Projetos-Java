package TrabalhoExercicio4_1_Polimorfismo_Jogo_Rapido;

public class Subtracao extends Calculadora{


	public Subtracao(double valor1, double valor2) {
		super(valor1, valor2);
	
	}

	
	public double calcular() {
		return this.valor1 - this.valor2;
	}
	

}
