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
public class Fatura {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a quantidade: ");
        int quantidade = entrada.nextInt();
        System.out.print("Informe o Valor unitário: ");
        double preco = entrada.nextDouble();
        calculaTotalFatura(quantidade, preco);
    }
    public static void calculaTotalFatura (int quantidade, double preco){
        double result = (quantidade * preco);
        imprimirFatura(result);
         
    }
    
    public static void imprimirFatura (double result){
        System.out.println("Valor total da fatura: " + result);
    } 
}

