package Trabalho_Pratico_Resolvido_Pelo_Professor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercicio 1
		/*
		Ponto p1 = new Ponto();
		p1.setX(4);
		p1.setY(6);
		
		Ponto p2 = new Ponto(7, 9);
				
		System.out.println(p1);
		System.out.println(p2);

		double d = p1.getDistancia(p2);
		double d2 = p2.getDistancia(p1);
		System.out.println("Distância de P1 a P2: " + d);
		System.out.println("Distância de P2 a P1: " + d2);
		/**/
		
		// Exercicio 2
		Ponto ps = new Ponto(2, 4);
		Ponto pi = new Ponto(5, 1);
		Quadrado quad = new Quadrado(ps, pi);
		System.out.println("Quadrado:\n" + quad);
		
		double area = quad.getArea();
		System.out.println("área: " + area);
		
		double perimetro = quad.getPerimetro();
		System.out.println("Perímetro: " + perimetro);
		
		double CPdiagonal = quad.getDiagonal();
		System.out.println("Comprimento da Diagonal: " +CPdiagonal);
		
		
		Ponto Vponto = new Ponto();
		Scanner e = new Scanner(System.in); {
		System.out.println("Verifique se está dentro do Quadrado: ");
		System.out.print("x: ");
		Vponto.setX(Double.parseDouble(e.nextLine()));
		System.out.print("y: ");
		Vponto.setY(Double.parseDouble(e.nextLine()));	
		e.close();
			
			if((Vponto.getX() > ps.getX()) && (Vponto.getX() < pi.getX())
					&& (Vponto.getY() < ps.getY()) && (Vponto.getY() == pi.getY())){
				System.out.println("Está dentro do Quadrado!");
			}else {
				System.out.println("Não está dentro do Quadrado!");
			}
		}
	}

}
