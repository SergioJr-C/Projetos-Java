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

//outro uso de campos estáticos em classes é o de criação de constantes, que serão
//compartilhadas por todas as instâncias da classe e, em geral, imutáveis, como o uso do modificador final.

//Constantes em classes geralmente são acessadas através da classe e não de instâncias desta classe.
