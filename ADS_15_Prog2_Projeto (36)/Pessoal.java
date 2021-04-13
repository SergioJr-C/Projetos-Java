package TrabalhoExercicio5_1_Classes_Abstratas_e_Interfaces_EX1;

public class Pessoal  extends Compromisso implements InterfacePessoal{

	@Override
	public void ExibirCompromissoPessoal(String nomeCompromisso, String data, String hora) {
		System.out.println(nomeCompromisso +"\nData:"  +data+ "\nHora: " +hora);
		
	}
	
	@Override
	public void ExibirCompromisso() {
		// TODO Auto-generated method stub
		
	}

}
