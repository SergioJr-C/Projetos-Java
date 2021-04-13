package R_20_Heranca_EX1;

public class Conta {
	protected static String agencia = "0170-8";
	
	public Conta() {
		
	}
	
	public static void abrirConta() {
		System.out.println("Conta Aberta");
	}
	
	public static void encerrarConta () {
		System.out.println("Conta Encerrada");
	}
}
