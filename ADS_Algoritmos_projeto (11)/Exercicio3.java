
package Resolvidos_pelo_Professor_Lista3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumberFormat nb = NumberFormat.getCurrencyInstance();
        System.out.print("Quant. litros: ");
        double qtLitros = entrada.nextDouble();
        System.out.println("Tipo de Combustível");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.print("Escolha: ");        
        int tipoComb = entrada.nextInt();
        System.out.println("");
        double totalPg = 0;
        if (tipoComb == 1){
            System.out.println("ÁLCOOL");
            if (qtLitros <= 20){
                totalPg = (3.9 * 0.97) * qtLitros;
            }
            else{
                totalPg = (3.9 * 0.95) * qtLitros;
            }
        }
        else{
            if (tipoComb == 2){
                System.out.println("GASOLINA");
                if (qtLitros <= 20){
                    totalPg = (4.5 * 0.96) * qtLitros;
                }
                else{
                    totalPg = (4.5 * 0.94) * qtLitros;
                }
            }else{
                System.out.println("Combustível inexistente!");
            }
        }
        System.out.println("Total a Pagar: " + nb.format(totalPg));
    }
}
