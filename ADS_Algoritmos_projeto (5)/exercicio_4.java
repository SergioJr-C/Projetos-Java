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
public class exercicio_4 {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite seu Salário: ");
        double salario = entrada.nextDouble();
        double prev = salario*0.1;
        salario = salario - prev;
        double sind = salario*0.05;        
        double salarioliquid = salario - sind;
        
        System.out.println("Salario Bruto: "+salario);
        System.out.println("Desconto da Previdência Social: "+prev);
        System.out.println("Desconto da Contribuição Sindical: " +sind);
        System.out.println("Desconto total/Salário Líquido: " +salarioliquid);
        
    }
    
}
