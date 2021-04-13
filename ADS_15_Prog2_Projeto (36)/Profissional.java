package TrabalhoExercicio5_1_Classes_Abstratas_e_Interfaces_EX1;

public class Profissional extends Compromisso implements InterfaceProfissional{

	@Override
	public void ExibirCompromissoProfissonal(String nomeCompromisso, String data, String hora) {
		System.out.println(nomeCompromisso +"\nData:"  +data+ "\nHora: " +hora);
		
	}
	
	@Override
	public void ExibirCompromisso() {
		// TODO Auto-generated method stub
		
	}
}
