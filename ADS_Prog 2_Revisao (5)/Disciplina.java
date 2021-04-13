package R_05_Classes_e_Atributos_5_Jogo_Rapido_2;

public class Disciplina {
	public static void main (String[] args) {
		Professor prof = new Professor();
		prof.nome = "Gustavo Rissetti";
		
		Laboratorio lab = new Laboratorio();
		lab.local = "Laboratório 5";
		
		System.out.println("O nome do professor é: " + prof.nome);
		System.out.println("O nome do professor é: " + lab.local);
	}

}
