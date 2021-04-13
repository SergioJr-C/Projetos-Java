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
public class Segundosemestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vet = new int[5];
        int[] vet2 = new int[5];
        int[] vet3 = new int[5];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o Vetor 1[Posição " + i + "]: ");
            vet[i] = entrada.nextInt();
            System.out.println("--------------------------------------------");
            System.out.print("Digite o Vetor 2[Posição " + i + "]: ");
            vet2[i] = entrada.nextInt();
            System.out.println("--------------------------------------------");
            vet3[i] = vet[i] * vet2[i];

            System.out.print("Resultado armazenado no Vetor 3[Posição "+i+"]: " + vet3[i]);
            System.out.println("<--");
            System.out.println("--------------------------------------------");

        }

    }

}

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite...");
//            vet[i] = entrada.nextInt();
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite os multiplicadores...");
//            vet[i] = vet[i] * entrada.nextInt();
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("resultados");
//            System.out.println(vet[i]);
//        }

