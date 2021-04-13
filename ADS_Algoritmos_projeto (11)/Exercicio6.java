package Resolvidos_pelo_Professor_Lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Lado A: ");
        int ladoA = entrada.nextInt();
        System.out.print("Lado B: ");
        int ladoB = entrada.nextInt();
        System.out.print("Lado C: ");
        int ladoC = entrada.nextInt();
        if ((ladoA > 0) && (ladoB > 0) && (ladoC > 0)){
            if (((ladoA + ladoB) > ladoC) &&
                ((ladoA + ladoC) > ladoB) &&
                ((ladoB + ladoC) > ladoA)){
                if ((ladoA == ladoB) && (ladoB == ladoC)){
                    System.out.println("EQUILÁTERO");
                }
                else{
                    if ((ladoA == ladoB) || 
                        (ladoA == ladoC) || 
                        (ladoB == ladoC)){
                        System.out.println("ISÓSCELES");
                    }
                    else{
                        System.out.println("ESCALENO");
                    }
                }
            }
            else{
                System.out.println("Valores não formam um triângulo");
            }
        }
        else{
            System.out.println("Valores não representam um triângulo");
        }
    }
}
