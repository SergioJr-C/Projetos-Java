/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_2_Vetores;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exerciciolista2_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int [15];
        System.out.println("Utilize um número para continuar... ");
        for (int i = 0; i < 15; i++) {
         vetor[i] = entrada.nextInt();  
         System.out.print("Vetor de número ["+i+"] =  ");
        }
        System.out.println("   ");
        System.out.println("_______________________________________________");
        System.out.print("Valores armazenados no Vetor: ");
        System.out.println("   ");
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Vetor de posição ["+i+"]+1 = \n" +vetor[i] + " = \n");
            
        }
        
    }
}
