package R_08_Constantes_EX2;

public class UsandoConstantes {
	public static void main(String[] args) {
		//Usando atrav�s de objeto...
		Constantes instancia = new Constantes();
		System.out.println(instancia.raizDe3);
		
		//Correto: usando atrav�s da classe
		System.out.println(Constantes.raizDe5);
	}
}
