/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Licao_4_Metodos;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exemplo_resolvido {
       public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = entrada.nextDouble();
        verifAprovacao(calculaMedia(n1, n2));
        System.out.println("FIM");
    }
    public static double calculaMedia(double nota1, double nota2){
        double media = (nota1 + nota2)/2;
        imprimeMedia(media);
        return media;
    }
    public static void imprimeMedia(double media){
        System.out.println("Média: " + media);
    }
    public static void verifAprovacao(double media){
        if (media >= 7)
            System.out.println("APROVADO");
        else
            System.out.println("REPROVADO");
    }
}


