/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_2;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class numero4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Salário: ");
        int salario = entrada.nextInt();
        int salarioliquido1 = (salario*10)/100;
        int salarioliquido2 = (salarioliquido1*5)/100;
        
        System.out.println(" Desconto previdência social:" +salarioliquido1);
        System.out.println("  Desconto Contribuição Sindical:" +salarioliquido2);
    }
}
/*algoritmo que leia o salário bruto
imprima o salário líquido

desconto 10%
+desconto 5%

*/