package R_28_Interfaces_EX1;

public class Smartphone implements Celular, PDA {
	
	String numTelefone = "190";
	String email = "gustavo@rissetti.com";
	
	
	public static void main (String args[]) {
		Smartphone s = new Smartphone();
		s.realizaChamada();
		s.verificaEmail();
	}
	
	@Override
	public void realizaChamada() {
		System.out.println("Ligando para o número " + numTelefone);
	}
	
	@Override
	public void verificaEmail() {
		System.out.println("Acessando o email " + email);
	}
}

/*
Quais as diferenças entre interfaces e classes abstratas?

◦ Declaração de Métodos
◦ Em uma classe abstrata podem ser definidos métodos abstratos
e não-abstratos.
◦ Todos os métodos de uma interface são implicitamente
abstratos.


◦ Declaração de variáveis
◦ Em uma classe abstrata podem ser definidas variáveis de
instância, de classe e constantes.
◦ Todos os atributos de uma interface são sempre public static
final (constantes) 
 */
