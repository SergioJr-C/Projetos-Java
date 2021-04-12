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
public class exemplo4 {
    public static void main(String[] args) {
        int[] teste = new int [5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < teste.length; i++) {
            System.out.print("Vetor["+i+"]: ");
            teste[i] = entrada.nextInt();
            
        }
        System.out.println("");
        System.out.println("Vetor: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" Posição["+i+"] = "+teste[i]);
        }
    }
    
    /*
    vetor é unidimensional, uma linha
    exemplo int[] = new int[5];
    java orientado a objetos
    
    variávelx.lenght
    */
}
/*
public class SomaVetor{

     public static void main(String[] args){

            int[] vetor = {1,2,3,4,5}; // Vetor já com valores preenchidos.
            int soma = 0; // inicia variavel soma com 0.
 
            for(int i = 0; i < vetor.length; i++){
                   soma = soma +  vetor[i]; // soma a variavel soma com cada valor dos indices do vetor. 
            }

            System.out.println("Total: "+soma); // Total: 15
     }
}
*/

