
package Resolvidos_pelo_Professor_Lista3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Nota 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = entrada.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = entrada.nextDouble();
        System.out.print("Falta: ");
        int faltas = entrada.nextInt();
        double media = (n1 + n2 + n3)/3;
        double freqMin = 80 * 0.25;
        if ((media >= 7) && (faltas <= freqMin)){
            System.out.println("APROVADO!");
        }
        else{
            if ((media < 7) && (faltas > freqMin)){
                System.out.println("REPROVADO POR MEDIA E POR FALTAS!");
            }
            else{
                if (media < 7){
                    System.out.println("REPROVADO POR MÉDIA");
                }
                else{
                    System.out.println("REPROVADO POR FALTAS");
                }
            }
        }
    }
}
