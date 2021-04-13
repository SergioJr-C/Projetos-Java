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
public class exerciciolista1_5_2 {

    public static void main(String[] args) {
        
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[] vet3 = new int[5];
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o Vetor 1 [Posição "+i+"]: ");
            vet1[i] = entrada.nextInt();    
        }

        System.out.println("---------------------");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o Vetor 2 [Posição "+i+"]: ");
            vet2[i] = entrada.nextInt(); 
        }
        
        System.out.println("----------------------");
        System.out.println("Resultado: ");
        for (int i = 0; i < 5; i++) {
            vet3[i] = vet1[i] * vet2[i];
            System.out.println("" + vet1[i] + "*" + vet2[i] + " = " + vet3[i]);
        }
        
    }

}

//int[] vet = new int[5];
// vet[i] = entrada.nextInt();
//Scanner entrada = new Scanner(System.in);
