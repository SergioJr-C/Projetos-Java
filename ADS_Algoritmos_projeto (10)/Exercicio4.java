
package Resolvidos_pelo_Professor_Lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Salário Bruto: ");
        double salBruto = entrada.nextDouble();
        double prevSocial = salBruto * 0.1;
        salBruto = salBruto - prevSocial;
        double contSind = salBruto * 0.05;
        salBruto = salBruto - contSind;
        System.out.println("Salário Líquido: " + salBruto);
    }
}
