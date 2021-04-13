/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_2;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class numero2 {

    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("valor: ");
        double valor = entrada.nextDouble();
        double velocidade = valor/3.6;
        System.out.println("A Velocidade será:" + velocidade);

    }
}
