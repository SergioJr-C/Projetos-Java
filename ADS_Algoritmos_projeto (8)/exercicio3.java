/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaExercicios_6;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número: ");
        int n = entrada.nextInt();
        
        n = 0;
        
        for (int i = 1; i >=n; i++) {
            if((i%5==0)&&(i>1)&&(i<=100)){
                System.out.println("Múltíplos de 5 entre 1 e 100: "+i);
            }
        }
    }
}
