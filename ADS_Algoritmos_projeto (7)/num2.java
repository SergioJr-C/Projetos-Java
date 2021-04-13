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
public class num2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o mês: ");
        String mes = entrada.nextLine();

        switch (mes) {
            case "Janeiro":
                System.out.println("Baixa Temporada");
                break;
            case "Fevereiro":
                System.out.println("Alta Temporada");
                break;
            case "Março":
                System.out.println("Baixa Temporada");
                break;
            case "Abril":
                System.out.println("Baixa Temporada");
                break;
            case "Maio":
                System.out.println("Baixa Temporada");
                break;
            case "Junho":
                System.out.println("Alta Temporada");
                break;
            case "Julho":
                System.out.println("Alta Temporada");
                break;
            case "Agosto":
                System.out.println("Baixa Temporada");
                break;
            case "Setembro":
                System.out.println("Baixa Temporada");
                break;
            case "Novembro":
                System.out.println("Baixa Temporada");
                break;
            case "Dezembro":
                System.out.println("Alta Temporada");
                break;
        }
    }
}
//identificar se um mês digitado é de alta ou baixa temporada
//alta temporada:dezembro a fevereiro, junho e julho
