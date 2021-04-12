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
public class dez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int calc = 0;
        int media = 0;
        int mult = 1;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número: ");
            int num = entrada.nextInt();
            calc = calc + num;
                mult = mult*num;
        }
        media = calc/10;
        System.out.println("Soma: " + calc);
        System.out.println("Média: " + media);
        System.out.println("Multiplicação: "+ mult);
    }

}
