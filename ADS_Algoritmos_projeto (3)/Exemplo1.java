
package Licao2_Estruturas_de_Selecao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = entrada.nextDouble();
        double media = (n1 + n2)/2;
        if (media >= 7){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }
        System.out.println("FIM");
    }
}
