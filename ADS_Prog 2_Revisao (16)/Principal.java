package R_16_Contru_e_Destru_Construtor_EX4;

public class Principal {
		public static void main (String args[]) {
				Carro carro1 = new Carro ("Fusca");
				carro1.exibeNome();
				Carro carro2 = new Carro ("Celta", "Cinza");
				
				carro2.exibeNome();
				carro1.exibeNome();
		}
}
