
package Exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor da posição " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("");
        System.out.print("Vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
