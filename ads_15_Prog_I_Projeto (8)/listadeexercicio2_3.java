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
public class listadeexercicio2_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite um número para continuar: ");

        int par = 0;
        int impar = 0;
        
        for (int i = 0; i < 10; i++) {
            vetor[i] = entrada.nextInt();
            System.out.print("Vetor [posição "+i+"]: ");
            if (vetor[i] % 2 == 0) {
              par++;
            }else {
              impar++;
            }
        }
        
        System.out.println("_________________________");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("números pares:" +par);
            System.out.println("números ímpares:" +impar);
        }
        
    }
}
