package Trabalho_Pratico_1_b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		
		Scanner e = new Scanner(System.in); {
			System.out.print("x: ");
			p1.setX(Double.parseDouble(e.nextLine()));
			System.out.print("y: ");
			p1.setY(Double.parseDouble(e.nextLine()));
			System.out.print("x: ");
			p2.setX(Double.parseDouble(e.nextLine()));
			System.out.print("y: ");
			p2.setY(Double.parseDouble(e.nextLine()));
			
			System.out.println("P1: " + p1);
			System.out.println("P2: " + p2);
			
			System.out.println("Distância entre P1 e P2: " + p1.getDistancia(p2));
		}
		
	}
}
