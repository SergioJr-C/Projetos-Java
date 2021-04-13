package TrabalhoExercicio5_1_Classes_Abstratas_e_Interfaces_EX1;

import java.util.Scanner;

public class Principal extends Compromisso{
	public static void main (String args[] ) {
		
		Pessoal p = new Pessoal();
		Profissional pf = new Profissional();
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite (pe) Compromisso Pessoal ou\n Digite (pf) para Compromisso Profissional");
		String comp = e.nextLine();
		if(comp.equals("pe")){
			System.out.println("Anote seu Compromisso: ");
			String nomeCompromisso = e.nextLine();
			System.out.print("Data: ");
			String data = e.nextLine();
			System.out.print("Hora: ");
			String hora = e.nextLine();
			
			p.ExibirCompromissoPessoal(nomeCompromisso, data, hora);
		}else if (comp.equals("pf")){
			System.out.println("Anote seu Compromisso: ");
			String nomeCompromisso = e.nextLine();
			System.out.print("Data: ");
			String data = e.nextLine();
			System.out.print("Hora: ");
			String hora = e.nextLine();
			
			pf.ExibirCompromissoProfissonal(nomeCompromisso, data, hora);
		}
		

	}
	

}
