
package Resolvidos_pelo_Professor_Lista6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int n = entrada.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma = soma + i;    //soma += i;
            System.out.println("i: " + i + " - Soma: " + soma);
        }        
    }
}
