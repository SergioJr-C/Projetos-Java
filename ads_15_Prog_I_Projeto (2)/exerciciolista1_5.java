/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos_2;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exerciciolista1_5 {

    public static void main(String[] args) {
        int[] vet = new int[5];
        Scanner entrada = new Scanner(System.in);

        int calc = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < vet.length; j++) {
                System.out.println("Vetor[" + j + "]: ");
                vet[j] = entrada.nextInt();
                calc = vet[j] * vet[j];
            }
        }
        System.out.println("---------------------");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(+calc);
        }

        System.out.println("---------------------");
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite...");
//            vet[i] = entrada.nextInt();
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite os multiplicadores...");
//            vet[i] = vet[i] * entrada.nextInt();
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("resultados");
//            System.out.println(vet[i]);
//        }
    }
}
