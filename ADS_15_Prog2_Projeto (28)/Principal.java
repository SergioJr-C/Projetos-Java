package TrabalhoExercicio3_2_Heranca;

import java.util.Scanner;

public class Principal extends Computador {

		public static void main(String args[]) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Computador/marca: ");
			String marca = entrada.nextLine();
			System.out.println("\n ----- ");
			System.out.println("");
			exibeModelo();
			exibeMarca(marca);
		}
		

		}
		

