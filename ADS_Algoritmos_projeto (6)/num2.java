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
public class num2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a variável a: ");
        int a = entrada.nextInt();
        
        System.out.println("Digite a variável b: ");
        int b = entrada.nextInt();
        
        int c = a;
        
        a = b;
        
        b = c;
        
        System.out.println("Variável a: "+a);
        System.out.println("Variável b: "+b);
    }
}

//ler dois valores inteiros
//armazenar nas variáveis a e b os números inteiros
//substituir o valor de a pelo de b, e o valor de b pelo de a
