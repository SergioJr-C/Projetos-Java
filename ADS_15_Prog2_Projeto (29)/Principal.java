package TrabalhoExercicio4_1_Polimorfismo_Jogo_Rapido;

import java.util.Scanner;

public class Principal {
	public static void main (String args[]) {
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite dois Valores: ");
		double v1 = e.nextDouble();
		double v2 = e.nextDouble();
		
		Soma s = new Soma(v1,v2);
		Multiplicacao m = new Multiplicacao(v1,v2);
		Subtracao sb = new Subtracao(v1,v2);
		Divisao d = new Divisao(v1,v2);
	 
		System.out.println("Soma: " + s.calcular());
		System.out.println("Multiplição: " + m.calcular());
		System.out.println("Subtração: " + sb.calcular());
		System.out.println("Divisão: " + d.calcular());
		e.close();
	}

}
