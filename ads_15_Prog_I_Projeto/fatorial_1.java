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
public class fatorial_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número: ");
        int num = entrada.nextInt();

        int fatorial = 1;

        for (int i = num; i >= 1; i--) {
            fatorial = fatorial * i;
            System.out.println(+num + " x " + i );
        }
        
        System.out.println("O fatorial do número" + num + " é " + fatorial);
    }
}

/*
Primeiramente,eu fiz o fatorial para mostrar atráves do out.print.ln. Com o for
eu fiz a repetição decrescente, então logo ele vai mostrar os números desde o
digitado ao 1, como definido no for. Também foi feito uma variável auxiliar
para que fosse possível atualizar o contador com o fatorial dentro do for.
Logo depois para mostrar as multiplicações do fatorial eu coloquei dentro do  for o número e a variável i que é o contador. Sendo assim ele repetiu 
a saída do algoritmo as vezes em que foi defenido pelo número digitado.
*/
