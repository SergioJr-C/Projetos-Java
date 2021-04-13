package TrabalhoExercicio3_2_Heranca;


public class Computador {
	private  String marca;
	protected static String modelo = "Portátil";
	
	
	protected static void exibeModelo() {
		System.out.println("Modelo: " + modelo);
	}

	protected static void exibeMarca(String marca) {
		System.out.println("Marca: " +marca);
	}

	}
	

