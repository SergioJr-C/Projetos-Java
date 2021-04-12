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
public class exemplo5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor da posição " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("");
        System.out.print("Vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
