/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;

/**
 *
 * @author 2017310432
 */
public class exemplo2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            int numero = (int) ((Math.random()*10)+1);
            System.out.println(numero);
        }
        
        System.out.println("----------");
        
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
          vetor[i] = (int) (Math.random()*9)+2;
            System.out.println(vetor[i]);
            /*
            Multiplicar por 2 = 0 e 1 exemplo:
            vetor[i] = (int) (Math.random()*2)
            */
        }
    }
}
