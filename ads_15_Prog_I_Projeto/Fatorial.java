
package Exemplos;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número: ");
        int num = entrada.nextInt();
        
        int fatorial = 1;
        
        for (int i = num; i >=1; i--) {
            fatorial = fatorial * i;
        }
        System.out.println("O Fatorial do Número " +num+ " é: " +fatorial);
    }   
    }

