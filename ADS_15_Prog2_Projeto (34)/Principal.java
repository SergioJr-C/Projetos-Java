package TrabalhoExercicio4_5_Polimorfismo_EX_4;

import java.util.Scanner;

public class Principal extends Mensagem {

 public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        while (true) {
		            System.out.println("Escolha uma mensagem sobre o meio ambiente \n1, 2 ou 3");
		            
		            Mensagem m = new Mensagem();
		            
		            int esc = input.nextInt(); 
		            
		            switch (esc) {
		                case 1:
		                    m.meioAmbiente();
		                    break;
		                case 2:
		                    m.meioAmbiente(1);
		                    break;
		                case 3:
		                    m.meioAmbiente(1, 1);                    
		                    break;
		                default:
		                    System.out.println("Opção inválida");
		                    input.close();
		            }
		        }
  
		    }
 		
		}
	


	

