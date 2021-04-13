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
public class exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número: ");
        int n = entrada.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) {
                soma = soma + i;
                System.out.println("Números múltiplos de 3: " + i);
            }

        }
        System.out.println("Soma :" + soma);
    }
}
