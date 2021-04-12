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
public class Gasolina {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de litros vendida: ");

        System.out.println("1-√?lcool: ");
        double v1 = entrada.nextDouble();

        System.out.println("2-Gasolina: ");
        double v2 = entrada.nextDouble();
       
        double alcool = v1*3.90;
        double gasolina = v2*4.50;

        if ((alcool <= 20)) {
            System.out.println("O desconto do √?lcool ser√° de: " + (alcool * 0.03));
        }
        if ((alcool > 20)) {
            System.out.println("O desconto do √?lcool ser√° de: " + (alcool * 0.05));
        }
        if ((gasolina <= 20)) {
            System.out.println("O desconto da gasolina ser√° de: " + (gasolina * 0.04));
        }
        if ((gasolina > 20)) {
            System.out.println("O desconto da gasolina ser√° de: " + (gasolina * 0.06));
        }

    }
}
