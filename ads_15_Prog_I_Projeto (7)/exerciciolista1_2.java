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
public class exerciciolista1_2 {

    public static void main(String[] args) {
        int[] vet = new int[10];
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vetor [" + i + "]: ");
            vet[i] = entrada.nextInt();
            soma = soma + vet[i];
        }

        System.out.println("---------------------------");
        System.out.println("Total da Soma dos Vetores: ");
        System.out.println(+soma);

    }
}
