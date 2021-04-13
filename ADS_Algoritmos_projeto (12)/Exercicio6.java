
package Resolvidos_pelo_Professor_Lista6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int num = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + 
                    " = " + (num * i));
        }
    }
}
