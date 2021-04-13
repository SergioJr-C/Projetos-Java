
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
public class exercicio_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Prova 1:");
        int prova1 = entrada.nextInt();
        System.out.print("Prova 2:");
        int prova2 = entrada.nextInt();
        System.out.print("Prova 3:");
        int prova3 = entrada.nextInt();
        double mediafinal = ((prova1*2)+(prova2*3)+(prova3*5))/10;
        System.out.println("Média final do aluno: "+mediafinal);
    }

}
