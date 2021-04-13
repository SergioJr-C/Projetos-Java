/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_4_Matrizes;

/**
 *
 * @author 2017310432
 */
public class Exercicio_4_3 {

    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizC = new int[4][4];
        
        System.out.println("Matriz A : ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Matriz B : ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
       
        System.out.println("Soma das matrizes: ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizC [i][j] = (matrizA[i][j] + matrizB[i][j]);
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
