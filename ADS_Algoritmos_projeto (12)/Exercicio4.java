
package Resolvidos_pelo_Professor_Lista6;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "º Número: ");
            double numero = entrada.nextDouble();
            soma += numero;
        }
        double media = soma/5;
        System.out.println("Média: " + media);
    }
}
