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
public class exercicio_3 {
    public static void main(String[] args) {
        int[][]mat = new int [5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = (int) (Math.random() *10);
                
                if(i == j){
                    mat[i][j] = 1;
                }
                else{
                    mat[i][j] = 0;
                }
                System.out.print(mat [i][j] + " ");
            }
            System.out.println("");
        }
    }
}
