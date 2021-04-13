/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_4;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class num1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite três valores: ");

        System.out.println("Valor 1: ");
        int num1 = entrada.nextInt();

        System.out.println("Valor 2: ");
        int num2 = entrada.nextInt();

        System.out.println("Valor 3: ");
        int num3 = entrada.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("O maior número lido: " + num1);
        }
        if ((num2 > num1) && (num2 > num3)) {
            System.out.println("O maior número lido: " + num2);
        }
        if ((num3 > num1) && (num3 > num2)) {
            System.out.println("O maior número lido: " + num3);
        }

        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("O menor número lido: " + num1);
        }
        if ((num2 < num1) && (num2 < num3)) {
            System.out.println("O menor número lido: " + num2);
        }
        if ((num3 < num1) && (num3 < num2)) {
            System.out.println("O menor número lido: " + num3);
        }
        
              
    }

}

//*ler 3 inteiros
//*informar o maior e menor valor lido
