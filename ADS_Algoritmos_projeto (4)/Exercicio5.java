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
public class Exercicio5 {
    public static void main (String Args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Distância percorrida: ");
        double distancia = entrada.nextDouble();
        System.out.println("Quantidade de combustível: ");
        double combustivel = entrada.nextDouble();
        double consumo = distancia/combustivel;
        System.out.println("Consumo médio: "+ consumo);
    }
}
