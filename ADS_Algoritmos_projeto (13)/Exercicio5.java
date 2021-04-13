
package Resolvidos_pelo_Professor_Lista7;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor: ");
        double n = entrada.nextDouble();
        double soma = 0;
        if (n > 0){
            double i = 1;
            while (i <= n){
                soma = soma + (1/i);
                i++;
            }
            System.out.println("Soma: " + soma);
        }
        else{
            System.out.println("Valor inválido!");
        }
    }
}
