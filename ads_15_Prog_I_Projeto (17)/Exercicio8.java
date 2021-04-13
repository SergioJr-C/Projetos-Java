
package Resolvidos_pelo_Professor_Lista5;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quant. horas: ");
        double quantHoras = entrada.nextDouble();
        quantHoras = Math.ceil(quantHoras);
        calcTotalPg(quantHoras);
    }
    public static void calcTotalPg(double horas){
        if (horas <= 3)
            System.out.println("Total a pagar: R$ 5,00");
        else{
            double total = 5 + (1.5 * (horas - 3));
            if (total < 15)
                System.out.println("Total a pagar: R$ " + total);
            else
                System.out.println("Total a pagar: R$ 15,00");
        }            
    }
}
