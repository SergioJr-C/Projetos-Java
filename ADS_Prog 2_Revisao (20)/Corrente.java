package R_20_Heranca_EX1;

public class Corrente extends Conta {
	
	private static String numeroConta;
	
	public static void main(String[] Args) {
		numeroConta = "18425-3";
		System.out.println("Os dados bancários são: ");
		System.out.println("Ag: " + agencia + " CC: " + numeroConta);
		abrirConta();
	}
}
