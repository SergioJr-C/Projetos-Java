package Resolvidos_pelo_Professor_Lista7;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Base: ");
        int base = entrada.nextInt();
        System.out.print("Expoente: ");
        int exp = entrada.nextInt();
        if ((base >= 2) && (exp > 1)){
            int mult = base;    //multi = 1
            int cont = 1;
            while (cont < exp){     //while (cont <= exp)
                mult = mult * base;
                cont++;
            }
            System.out.println("Resultado: " + mult);
        }
        else{
            System.out.println("Valores inválidos!");
        }
    }
}
