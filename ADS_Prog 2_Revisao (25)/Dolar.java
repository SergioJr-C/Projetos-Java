package R_25_Polimorfismo_EX4_sobrecargaMetodos_Overload;

public class Dolar {
	public void converterMoeda(double valorEmReais) {
		System.out.println("Convers�o: " + (valorEmReais * 2.99));
	}
	
	public void converterMoeda(double valorEmReais, double taxaConversao) {
		System.out.println("Convers�o: " + (valorEmReais * taxaConversao));
	}
}
