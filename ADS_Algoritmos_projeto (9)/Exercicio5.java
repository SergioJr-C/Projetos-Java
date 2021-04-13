
package Resolvidos_pelo_Professor_Lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Temperatura em ºC: ");
        double tempC = entrada.nextDouble();
        double tempF = ((9 * tempC)/5) + 32;
        System.out.println("Temperatura em ºF: " + tempF);
    }
}
