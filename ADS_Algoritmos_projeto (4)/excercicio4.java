/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaExercicios;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class excercicio4 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Base do triângulo: ");
        double base = entrada.nextDouble ();
        System.out.print("Altura do triângulo: ");
        double altura = entrada.nextDouble ();
        double area = (base * altura)/2;
        System.out.println(
                              "Área do triângulo: " + area);
    }
}