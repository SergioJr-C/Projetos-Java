
package Resolvidos_pelo_Professor_Lista2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Prova 1: ");
        double p1 = entrada.nextDouble();
        System.out.print("Prova 2: ");
        double p2 = entrada.nextDouble();
        System.out.print("Prova 3: ");
        double p3 = entrada.nextDouble();
        double media = ((p1 * 2) + (p2 * 3) + (p3 * 5))/10;
        System.out.println("Média: " + media);
    }  
}
