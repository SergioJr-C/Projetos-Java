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
public class Fatorial2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int num = entrada.nextInt();
        int fatorial = 0;
        for (int i = 1; i <= num; i++) {
            fatorial = num * i;
            fatorial = fatorial * num;
            System.out.println(+num + " x " + i);
        }
        
        
        System.out.println("O fatorial de " + num + " é = " + fatorial);

    }
}
