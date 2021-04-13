package Resolvidos_pelo_Professor_Lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor do saque: ");
        int saque = entrada.nextInt();
        if (saque >= 10){
            int resto = saque % 5;       
            int merreca = 0;
            int n2 = 0;
            if ((resto == 1) || (resto == 3)){
                merreca = resto + 5;
                saque = saque - merreca;
                n2 = merreca/2;
            }
            int n100 = saque/100;
            resto = saque % 100;
            System.out.println("Notas de R$ 100: " + n100);
            int n50 = resto/50;
            resto = resto % 50;
            System.out.println("Notas de R$ 50: " + n50);
            int n20 = resto/20;
            resto = resto % 20;
            System.out.println("Notas de R$ 20: " + n20);
            int n10 = resto/10;
            resto = resto % 10;
            System.out.println("Notas de R$ 10: " + n10);
            int n5 = resto/5;
            resto = resto % 5;
            System.out.println("Notas de R$ 5: " + n5);            
            if ((resto == 2) || (resto == 4)){
                n2 = resto/2;
            }            
            System.out.println("Notas de R$ 2: " + n2);
        }
        else{
            System.out.println("Valor mínimo do saque: R$ 10");
        }
    }
}
