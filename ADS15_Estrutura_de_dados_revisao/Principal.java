package Exercicios;

import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
	Scanner e = new Scanner(System.in);
	int op;
	Fila consultorio = new Fila();
	
	consultorio.enfileirar(new Paciente("Nana"));
	consultorio.enfileirar(new Paciente("Masha"));
	consultorio.enfileirar(new Paciente("Pharsa"));
	consultorio.enfileirar(new Paciente("Guinevere"));
	System.out.println("Pacientes na fila a serem atendidos: ");
	consultorio.listar();
	
	menu();
	op = e.nextInt();
	while (true) {
	switch (op) {
	case 1:
		String p = e.nextLine();
		System.out.print("Informe o nome do paciente que deseja inserir.");
		p = e.nextLine();
		consultorio.enfileirar(new Paciente(p));
		System.out.println("\nNovo paciente inserido na fila com sucesso!");
		System.out.println("Fila: ");
		consultorio.listar();
		menu();
		op = e.nextInt();
		
		break;
		
	case 2:	
		System.out.print("Chamando o paciente " + consultorio.desenfileirar() + "\n");
		menu();
		op = e.nextInt();
		
		break;		
		
	case 3:		
		System.out.println("\nPosição dos pacientes na fila: ");
	
		System.out.print("Nana: ");
		consultorio.posicao("Nana");
		System.out.print("Masha: ");
		consultorio.posicao("Masha");
		System.out.print("Pharsa: ");
		consultorio.posicao("Pharsa");
		System.out.print("Guinevere: ");
		consultorio.posicao("Guinevere");
		menu();
		op = e.nextInt();
		
		break;
		
	case 4:
		System.out.print("Saindo...");
		System.exit(1);
				
		break;
		default:
			menu();
			op = e.nextInt();
		
		}
	
	
	}
	
}
	
	public static void menu() {
		System.out.println("\nQual operação deseja realizar? ");
		System.out.println("1 - Inserir Paciente.");
		System.out.println("2 - Chamar próximo Paciente.");
		System.out.println("3 - Consultar posição do paciente.");
		System.out.println("4 - Sair.");
	}
}
