/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Licao_3_Arrays_Bidimensionais_Matrizes;

/**
 *
 * @author 2017310432
 */
public class exercicio_1 {
    public static void main(String[] args) {
        int[][] mat = new int [4][4];
        int cont = 0;
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <5-1; j++) {
                mat [i][j] = (int) (Math.random () * 20);
                System.out.print(mat [i][j] + " | ");
                if(mat[i][j] >= 10){
                   cont++;
                }
            }
            System.out.println("");
        }
        System.out.println("_____________________________");
        System.out.println("Valores maiores que 10: "+cont);
    }
}
//matriz quadrada, quando i=j, quantidade de linhas e colunas