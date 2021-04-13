package R_18_Contru_e_Destru_Construtor_EX6_Clone;

public class Principal {
		public static void main (String args[]) {
				Carro carro1 = new Carro ("Fusca");
				Carro carro2 = carro1.clone();
				
				carro2.exibeNome();
			
		}
}
