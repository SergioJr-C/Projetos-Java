
package Licao2_Estruturas_de_Selecao;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = entrada.nextDouble();
        System.out.print("Quant. presenças: ");
        int freq = entrada.nextInt();
        double media = (n1 + n2)/2;
        if ((media >= 7) && (freq >= 54)){
            System.out.println("APROVADO!");
        }
        else{
            if ((media < 7) && (freq >= 54)){
                System.out.println("EXAME");
            }
            else{
                System.out.println("REPROVADO");
            }
        }
    }
}
