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
public class exemplo1 {
    public static void main(String[] args) {
        int[][] mat = new int [5] [4];
        for (int i = 0; i < 5; i++) { //colunas
            for (int j = 0; j < 4; j++) { //linhas
                mat [i][j] = (int) (Math.random () * 10);
                System.out.print(mat [i][j] + " ");
            }

        }
    }
}
