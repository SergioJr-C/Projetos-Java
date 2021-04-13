package Resolvidos_pelo_Professor_Lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Base do triângulo: ");
        double base = entrada.nextDouble();
        System.out.print("Altura do triângulo: ");
        double altura = entrada.nextDouble();
        double area = (base * altura)/2;
        System.out.println("Área do triângulo: " + area);
    }
}
