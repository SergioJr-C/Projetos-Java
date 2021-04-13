
package Licao1_Estrutura_de_Repeticao;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean resp = true;
        while(resp == true){
            System.out.print("Nota 1: ");
            double n1 = entrada.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = entrada.nextDouble();
            double media = (n1 + n2)/2;
            System.out.println("Média: " + media);
            System.out.print("Calcular novamente? (1 - Sim | 2 - NÃ£o)? ");
            if (entrada.nextInt() != 1){
                resp = false;
            }
        }
    }
}
