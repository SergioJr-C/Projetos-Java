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
public class numero1 {
    public static void main(String[]Args){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Valor:");
    int valor = entrada.nextInt();
    int quadrado = valor*valor;
    int cubo = valor*valor*valor;
        System.out.println("Valor do quadrado de " + valor +": " +quadrado);
        System.out.println("Valor do cubo de " + valor +":" +cubo);
}
    
}
