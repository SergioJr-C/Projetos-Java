package Resolvidos_pelo_Professor_Lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Velocidade em Km/h: ");
        double velocKmH = entrada.nextDouble();
        double velocMS = velocKmH/3.6;
        System.out.println("Velocidade em m/s: " + velocMS);
    }
}
