package ListaExercicios_4_Matrizes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class Exercicio_4_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os números que compõem as dimensões Matriz Quadrada: ");
        System.out.println("Digite o número de colunas: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o número de Linhas: ");
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            int[][] matriz = new int[num1][num2];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = (int) (Math.random() * 10);
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }
            
            int somaCL = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (i+ j == (matriz.length - 1)) {
                      somaCL += matriz[i][matriz.length-1];      
                    }
                     
                }

            }
            System.out.print(somaCL + " ");
        } else {
            System.out.println("Por favor, digite as dimensões corretamente "
                    + "(Uma matriz quadrada possui dimensões da coluna e linhas iguais.)");
        }

    }
}
