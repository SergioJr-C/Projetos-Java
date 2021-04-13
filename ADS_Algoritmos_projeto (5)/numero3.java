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
public class numero3 {
    public static void main (String[] Args){
        Scanner entrada = new Scanner (System.in);
        System.out.print("valor 1: ");
        int valor1 = entrada.nextInt();
        System.out.print("Valor 2: ");
        int valor2 = entrada.nextInt();
        int quociente = valor1 / valor2;
        int resto = valor1 % valor2;
        System.out.println("Quociente da divisão: " + quociente);
        System.out.println("Resto da divisão: " + resto);
        
        
        
    }
}
