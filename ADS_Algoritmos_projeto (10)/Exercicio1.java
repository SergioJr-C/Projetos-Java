
package Resolvidos_pelo_Professor_Lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num = entrada.nextInt();
        int quad = num * num;
        int cubo = num * num * num;
        System.out.println("Quadrado de " + num + ": " + quad);
        System.out.println("Cubo de " + num + ": " + cubo);
    }
}
