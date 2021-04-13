package R_25_Polimorfismo_EX4_sobrecargaMetodos_Overload;

public class Cambio extends Dolar{
	@Override
	public void converterMoeda(double valorEmReais) {
		System.out.println("Total: " + (valorEmReais * 3.12));
	}
	
	public void converterMoeda(double valorEmReais, double taxaConversao) {
		System.out.println("Total: " + (valorEmReais * taxaConversao) +10 );
	}
	
	public static void main(String[] args) {
		Cambio c = new Cambio();
		c.converterMoeda(100);
		c.converterMoeda(100, 2.85);
	}
}

//A classe Cambio herda, sobrescreve e ainda faz sobrecarga (em tempo de compilação) dos métodos converterMoeda().