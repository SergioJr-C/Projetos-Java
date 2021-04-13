package TrabalhoExercicio_2;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
	realizaConta Valores = new realizaConta();
	Scanner e = new Scanner(System.in);{
		System.out.print("Valor 1: ");
		Valores.setVa1(e.nextInt());
		e.close();
		System.out.print("Valor 2: ");
		Valores.setVa2(e.nextInt());
		
		//int somaValores = Valores.getSoma();
		System.out.println("\n" + Valores);
		
		/*int subtraiValores = Valores.getSubtracao();
		System.out.println("Subtração: " + subtraiValores);
		
		int divideValores = Valores.getDivisao();
		System.out.println("Divisão: " + divideValores);
		
		int multiplicaValores = Valores.getMultiplicacao();
		System.out.println("Multiplicação: " + multiplicaValores);*/
	}

	}
	
}
