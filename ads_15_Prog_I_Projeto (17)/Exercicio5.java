
package Resolvidos_pelo_Professor_Lista5;

import java.util.Scanner;

public class Exercicio5 {
    static double soma;
    static double media;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de avaliações: ");
        int quant = entrada.nextInt();
        for (int i = 1; i <= quant; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = entrada.nextDouble();
            soma(nota);
        }
        media(quant);
    }
    public static void soma(double n){
        soma += n;
    }
    public static void media(int quant){
        media = soma/quant;
        System.out.println("Média: " + media);
    }
}
