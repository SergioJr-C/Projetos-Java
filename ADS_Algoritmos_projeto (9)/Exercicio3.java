
package Resolvidos_pelo_Professor_Lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Distância percorrida: ");
        double distancia = entrada.nextDouble();
        System.out.print("Quantidade de combustível: ");
        double combustivel = entrada.nextDouble();
        double consumo = distancia/combustivel;
        System.out.println("Consumo médio: " + consumo);
    }
}
