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
public class num1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o mês: ");
        String mes = entrada.nextLine();
        System.out.println("Digite o ano: ");
        int ano = entrada.nextInt();

        switch (mes) {
            case "Janeiro":
                System.out.println("Janeiro:31 dias");
                break;
            case "Fevereiro":
                if (ano % 4 == 0) {
                    System.out.println("ANO BISEXTO!Fevereiro:29 dias");
                } else {
                    System.out.println("Fevereiro:28 dias");
                }
                break;
            case "Março":
                System.out.println("Março:31 dias");
                break;
            case "Abril":
                System.out.println("Abril:30 dias");
                break;
            case "Maio":
                System.out.println("Maio:31 dias");
                break;
            case "Junho":
                System.out.println("Junho:30 dias");
                break;
            case "Julho":
                System.out.println("Julho:31 dias");
                break;
            case "Agosto":
                System.out.println("Agosto:31 dias");
                break;
            case "Setembro":
                System.out.println("Setembro:30 dias");
                break;
            case "Novembro":
                System.out.println("Novembro:30 dias");
                break;
            case "Dezembro":
                System.out.println("Dezembro:31 dias");
                break;
        }
    }
}

//mostrar quantos dias há em um m
//digitando mês e o anoês
//1 a 12
//um case para cada mês
//case 2 ano bisexto /4==%0
