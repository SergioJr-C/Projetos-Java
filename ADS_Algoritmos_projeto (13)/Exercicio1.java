package Resolvidos_pelo_Professor_Lista7;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menor = 0;
        int maior = 0;
        boolean teste = true;
        while (teste) {
            System.out.print("1º Valor: ");
            int x = entrada.nextInt();
            System.out.print("2º Valor: ");
            int y = entrada.nextInt();
            if ((x > 0) && (y > 0)) {
                if (x > y) {
                    maior = x;
                    menor = y;
                    teste = false;
                } else 
                    if (y > x) {
                        maior = y;
                        menor = x;
                        teste = false;
                    } else {
                        System.out.println("Valores não podem ser iguais!");
                    }            
            } else {
                System.out.println("Valores precisam ser positivos!");
            }
            if (!teste){
                while (menor <= maior){
                    if (menor % 11 == 5){
                        System.out.println(menor + " % 11 == 5");
                    }
                    menor++;
                }
            }
        }
    }
}
