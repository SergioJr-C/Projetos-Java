package TrabalhoExercicio_1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Disciplina InfoDisc = new Disciplina();
		Scanner e = new Scanner(System.in);{
			
			System.out.println(InfoDisc);
			
			System.out.println("\nInforme os Dados: \n");
			
			System.out.println("Nome: ");
			InfoDisc.setNome(e.nextLine());
			
			System.out.println("Carga Hor�ria: ");
			InfoDisc.setCargaH(e.nextLine());
		
			System.out.println("Nome do Professor: ");
			InfoDisc.setNomeProf(e.nextLine());
			
			System.out.println(InfoDisc);
			e.close();
			}
		
		}
		
	}

