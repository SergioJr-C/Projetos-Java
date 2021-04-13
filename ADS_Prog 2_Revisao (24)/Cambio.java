package R_24_Polimorfismo_EX3_sobrescritaMetodos_Override;

public class Cambio extends Dolar{
	@Override
	public void converterMoeda(double valorEmReais) {
		System.out.println("Total: " + (valorEmReais * 3.12));
	}
	
	public static void main(String[] args) {
		Cambio c = new Cambio();
		c.converterMoeda(100);
	}
}

//A classe Cambio herda e sobrescreve o método converterMoeda(), alterando o fator de conversão.