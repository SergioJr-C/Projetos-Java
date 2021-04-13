/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_6;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número: ");
            int n = entrada.nextInt();
            if (i == 1) {
                maior = n;
                menor = n;
            } else {
                if (n > maior) {
                    maior = n;
                }
                if (n < menor) {
                    menor = n;
                }
            }

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
    }
}
