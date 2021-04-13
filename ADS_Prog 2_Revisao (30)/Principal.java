package R_30_Classes_Abstratas_E_Interfaces_Jogo_Rapido;

import java.util.Scanner;

public class Principal extends Mensagem{
	
	
	
	public static void main(String[] args) {
		Principal p = new Principal();
		Scanner e = new Scanner(System.in);
		System.out.println("Digite a Mensagem: ");
		String MsgB = e.nextLine();
		System.out.println();
		p.exibeMensagemA();
		p.exibeMensagemB(MsgB);
	}



@Override
 void exibeMensagemA() {
	System.out.println("Cuide bem dos animais");
}

@Override
 void exibeMensagemB(String MsgB) {
	System.out.println(MsgB);
}
}