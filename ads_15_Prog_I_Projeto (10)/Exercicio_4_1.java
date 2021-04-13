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
public class Exercicio_4_1 {

    public static void main(String[] args) {
        int[] mat1 = new int[5];
        int[] mat2 = new int[5];
        int[][] mat3 = new int[5][2];

        System.out.println("Matriz: ");
        for (int i = 0; i < 5; i++) {
            mat1[i] = (int) (Math.random() * 10);
            mat2[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    mat3[i][j] = mat1[i];
                    
                } else {
                    mat3[i][j] = mat2[i];
                    
                }
                System.out.print(mat3[i][j] + " ");
                
            }
            System.out.println("");
        }
    }
}

//1.Elabore uma classe Java que leia dois 
//vetores de 5 posições de inteiros. 
//A seguir, deve-se criar uma matriz 
//com cinco linhas e duas colunas.
//Na primeira coluna da matriz deve-se armazenar 
//os elementos do primeiro vetor, e na segunda 
//coluna, os elementos do segundo vetor. 
//colocar as linhas nas colunas
//associar o número do vetor com o num da linha
