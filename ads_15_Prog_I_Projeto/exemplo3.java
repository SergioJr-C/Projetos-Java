/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exemplo3 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int quantNeg = 0;
        int quantPos = 0;
        double somaPos = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": ");
            numeros[i] = entrada.nextInt();
        
            if (numeros[i] < 0) {
                quantNeg++;
            }
                if (numeros[i] > 0) {
                    quantPos++;
                    somaPos += numeros[i];
                }
            
        }
            double media = somaPos/quantPos;
            System.out.println("Quantidade de " + "números negativos: " +quantNeg);
            System.out.println("Média dos números positivos: " +media);
        
    }
}