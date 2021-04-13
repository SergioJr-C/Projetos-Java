/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaExercicios_6;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n = entrada.nextInt();
        System.out.println("Número:");
        
        int soma = 0;
        //soma é uma inconstante
        
        //i é iguL  1, i menor ou igual a variavel n, i++
        //soma é igual a soma + 1
        for(int i=1; i <= n; i++){
            soma = soma + i;
            System.out.println("i: "+i+" - Soma: " + soma);

        }
        System.out.println("Soma :"+soma);
    }
}

//