
package Resolvidos_pelo_Professor_Lista5;

import java.util.Scanner;

public class Exercicio1 {
    static int quantidade;
    static double preco;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade: ");
        quantidade = entrada.nextInt();
        System.out.print("Preço: ");
        preco = entrada.nextDouble();
        System.out.print("Total a pagar: " + calculaTotalFatura());
    }
    public static double calculaTotalFatura(){
        return quantidade * preco;
    }
}
