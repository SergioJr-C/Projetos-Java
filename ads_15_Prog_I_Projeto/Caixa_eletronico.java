package Exemplos;

import java.util.Scanner;

public class Caixa_eletronico {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor mínimo de saque: R$ 10,00");
        System.out.println("Cédulas disponíveis: 2, 5, 10, 20, 50, 100");
        System.out.print("Qual o valor do saque?: ");
        int saque = entrada.nextInt();
        if (saque >= 10) {
            int resto = saque % 5;
            int sobra = 0;
            int sobra2 = 0;
            if ((resto == 1) || (resto == 3)){
                sobra = (5 + resto) / 2;
                saque = saque - 2;
                saque = saque - sobra;
                sobra2 = sobra / 2;
        }          
            int notas100 = saque/100;
            resto = saque%100;
            System.out.println ("Notas de R$ 100,00: " + notas100);
            int notas50 = resto/50;
            resto = resto%50;
            System.out.println ("Notas de R$ 50,00: " + notas50);
            int notas20 = resto/20;
            resto = resto%20;
            System.out.println ("Notas de R$ 20,00: " + notas20);
            int notas10 = resto/10;
            resto = resto%10;
            System.out.println ("Notas de R$ 10,00: " + notas10);
            int notas5 = resto/5;
            resto = resto%5;
            System.out.println ("Notas de R$ 5,00: " + notas5);
            
            if ((resto == 2) || (resto == 4)){
            sobra2 = resto/2;
                }
            
            System.out.println ("Nota de R$ 2,00: " + sobra2);
        }
        else {
            System.out.println("Não é possível efutuar o saque!");
        }
    }
    }
    
        
