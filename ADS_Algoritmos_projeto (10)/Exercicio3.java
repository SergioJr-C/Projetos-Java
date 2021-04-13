
package Resolvidos_pelo_Professor_Lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor de x: ");
        int x = entrada.nextInt();
        System.out.print("Valor de y: ");
        int y = entrada.nextInt();
        int quoc = x/y;
        int resto = x % y;
        System.out.println("Quociente: " + quoc);
        System.out.println("Resto: " + resto);
    }
}
