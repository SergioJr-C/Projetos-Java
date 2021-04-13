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
public class exerciciolista1_1 {

    public static void main(String[] args) {
        int[] vet = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vetor[" + i + "]: ");
            vet[i] = entrada.nextInt();
        }
        System.out.println("-------");
        System.out.println("Vetor: ");
        
        int i = vet.length;
        
        while( i >= 1){
            System.out.println(i--);
        }        
    }
}
