package R_08_Constantes_EX2;

public class Constantes {
	// A raiz quadrada de 2
	final static public double raizDe2 = 1.4142135623730950488;
	
	//A raiz quadrada de 3
	final static public double raizDe3 = 1.7320508075688772935;
	
	// A raiz quadrada de 5
	final static public double raizDe5 = 2.2360679774997896964;
	
	// A raiz quadrada de 6
	final static public double raizDe6 = raizDe2*raizDe3;

}

//outro uso de campos est�ticos em classes � o de cria��o de constantes, que ser�o
//compartilhadas por todas as inst�ncias da classe e, em geral, imut�veis, como o uso do modificador final.

//Constantes em classes geralmente s�o acessadas atrav�s da classe e n�o de inst�ncias desta classe.
