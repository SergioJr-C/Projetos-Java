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
public class exerciociolista1_4 {

    public static void main(String[] args) {
        int[] vet = new int[10];
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int impar = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vetor [" + i + "]: ");
            vet[i] = entrada.nextInt();
            if (vet[i] % 2 == 0) {
                contador++;
            }else{
                impar++;
            }
        }
        
        System.out.println("--------------------------------------");
        System.out.println("Quantidade de números pares: " + contador);
        System.out.println("ímpares: " +impar);
    }
}
