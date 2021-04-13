
package Resolvidos_pelo_Professor_Lista3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor do produto: ");
        double valor = entrada.nextDouble();
        double lucro = 0;
        if (valor < 200){
            lucro = valor * 0.45;
        }
        else{
            lucro = valor * 0.30;
        }
        System.out.println("Lucro: R$ " + lucro);
    }
}
