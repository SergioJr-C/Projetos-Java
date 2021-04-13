/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_1_Vetores;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exerciciolista1_6 {

    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Armazene os valores no Vetor 1: ");
            vet1[i] = entrada.nextInt();
            if (vet1[i] % 2 == 1) {
//                vet1[i] = true;
            }

            for (int j = 0; j < 5; i++) {
                System.out.println("Armazene os valores no Vetor 2: ");
                vet2[j] = entrada.nextInt();
            }
        }

    }

}

//int[] vet = new int[5];
// vet[i] = entrada.nextInt();
//Scanner entrada = new Scanner(System.in);
//fazer dois vetores
//armazenar em um dos vetores se for ímpar em um se for par em outro
//se estiver cheio, avisar e indicar o outro
//se for maior que 0 armazena do contrário não
//
