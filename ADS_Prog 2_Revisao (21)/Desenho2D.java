package R_21_Heranca_EX2;

public class Desenho2D extends Desenho{
		protected static int largura;
		protected static int altura;
		
		public static void exibeDimensoes () {
			System.out.println("Dimensões: " + largura + "x" + altura);
		}
}
