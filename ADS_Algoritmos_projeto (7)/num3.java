/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_5;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class num3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String semana = entrada.nextLine();

        switch (semana)  {
            case "Segunda":
                System.out.println("Dia de Semana!");
                break;
            case "Terça":
                System.out.println("Dia de Semana!");
                break;
            case "Quarta":
                System.out.println("Dia de Semana!");
                break;
            case "Quinta":
                System.out.println("Dia de Semana!");
                break;
            case "Sexta":
                System.out.println("Dia de Semana!");
                break;
            case "Sábado":
                System.out.println("Final de Semana!");
                break;
            case "Domingo":
                System.out.println("Final de semana!");
                break;
            default:
                System.out.println("Opção Inválida!");
        }

    }
}
