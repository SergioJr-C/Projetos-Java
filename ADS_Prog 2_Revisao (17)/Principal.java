package R_17_Contru_e_Destru_Construtor_EX5_Copia_de_Objeto;

public class Principal {
		public static void main (String args[]) {
				Carro carro1 = new Carro ("Fusca");
				Carro carro2 = carro1;
				
				carro2.exibeNome();
			
		}
}
