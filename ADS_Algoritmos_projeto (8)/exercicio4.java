/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_6;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            int n = entrada.nextInt();
            soma = soma + n;
        }
        int media = soma / 5;
        System.out.println("O Cálculo desses números é :" + media);
    }
}
