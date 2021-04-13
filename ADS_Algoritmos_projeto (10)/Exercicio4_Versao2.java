
package Resolvidos_pelo_Professor_Lista2;

import java.util.Scanner;

public class Exercicio4_Versao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Salário Bruto: ");
        double salBruto = entrada.nextDouble();
        double salLiq = (salBruto - (salBruto * 0.1));
        salLiq = (salLiq - (salLiq * 0.05));
        System.out.println("Salário Líquido: " + salLiq);
    }
}
