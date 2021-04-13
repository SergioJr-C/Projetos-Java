package R_06_Classes_e_Atributos_6_Ex_4;

import java.util.Scanner;

public class Principal {
	public static void main (String[] args) {
		Carro carro = new Carro();
		System.out.println("Digite as especificação de carro: ");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Marca: ");
		carro.marca = entrada.nextLine();
		
		System.out.println("Ano Fabricação: ");
		carro.anoFabricacao = entrada.nextLine();
		
		System.out.println("Modelo: ");
		carro.modelo = entrada.nextInt();
		

		
		System.out.println(" ");
		
		System.out.println("Modelo: "+carro.modelo);
		System.out.println("Marca: "+carro.marca);
		System.out.println("Ano Fabricação: "+carro.anoFabricacao);
		
	}
}
