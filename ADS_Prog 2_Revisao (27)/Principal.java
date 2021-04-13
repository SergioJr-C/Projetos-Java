package R_27_Classes_Abstratas_EX2;

public class Principal extends Pessoa{
	String nome;
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.atribuiNome();
		p.exibeNome();
	}
	
	@Override
	void atribuiNome() {
	nome = "Gustavo";
	}
	
	@Override
	void exibeNome() {
	System.out.println(nome);
		}
	
}
