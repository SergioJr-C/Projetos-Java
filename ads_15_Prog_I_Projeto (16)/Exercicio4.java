
package Resolvidos_pelo_Professor_Lista4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dimensão da Matriz: ");
        int dim = entrada.nextInt();
        int[][] mat = new int[dim][dim];
        System.out.println("Matriz: ");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                mat[i][j] = (int) (Math.random() * 10);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Diagonal Secundária:");
        int soma = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if ((i + j) >= dim){
                    System.out.print(mat[i][j] + " ");
                    soma += mat[i][j];
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
        System.out.println("Soma: " + soma);
    }
}
