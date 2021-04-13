package Resolvidos_pelo_Professor_Lista6;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int n = entrada.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0){
                soma += i;  //soma = soma + i;
                System.out.println(i);
            }
        }
        System.out.println("Soma dos múltiplo de 3: " + soma);
    }
}
