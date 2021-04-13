package TrabalhoExercicio4_1_Polimorfismo_Jogo_Rapido;

public class Calculadora {
	
	 protected double valor1; 
	 protected double valor2;
	 
	 public Calculadora(double valor1, double valor2) {
		 this.valor1 = valor1;
		 this.valor2 = valor2;
	 }
	 
	 public Calculadora() { }
	
	 public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double calcular() {
		 return 0.0;
	 }
	 
	 public void exibeResultado() {
		 
	 }
	

}
