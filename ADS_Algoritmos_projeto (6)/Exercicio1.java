package ListaExercicios_4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("A: ");
        int a = entrada.nextInt();
        System.out.print("B: ");
        int b = entrada.nextInt();
        System.out.print("C: ");
        int c = entrada.nextInt();
        if ((a > b) && (a > c)){
            System.out.println("Maior: " + a);
            if (b > c){
                System.out.println("Menor: " + c);
            }
            else{
                System.out.println("Menor: " + b);
            }
        }
        else{
            if ((b > a) && (b > c)){
                System.out.println("Maior: " + b);
                if (a > c){
                    System.out.println("Menor: " + c);
                }
                else{
                    System.out.println("Menor: " + b);
                }
            }
        }
    }
}
