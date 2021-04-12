/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;

import java.io.*;

/**
 *
 * @author 2017310432
 */
public class buff2 {

    public static void main(String[] args) throws IOException {
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite um número: ");
        String n1 = num.readLine();
        System.out.println("Digite outro número: ");
        String n2 = num.readLine();

        int intn1 = Integer.parseInt(n1);
        int intn2 = Integer.parseInt(n2);

        int maior = 0;
        int menor = 0;

        //Verificar se são diferentes
        if (intn1 == intn2) {
            System.out.println("Digite números diferentes!");
        } else {

            //descobrir qual é o maior e o menor
            if ((intn1 > intn2) && (intn1 != intn2)) {
                maior = intn1;
            } else {
                maior = intn2;
            }

            if ((intn2 < intn1) && (intn1 != intn2)) {
                menor = intn2;
            } else {
                menor = intn1;
            }
            System.out.println("---------------------------------");
            System.out.println("O Número Maior é: " + maior + "\n");
            System.out.println("O Número Menor é: " + menor);
            System.out.println("---------------------------------");

            //descobrir a média
            int media = (maior + menor) / 2;
            System.out.println("A Média é: " + media);
            System.out.println("--------------------------");

            //For que vai do Menor ao Maior
            System.out.println("Valores do Menor ao Maior: ");
            for (int i = menor; i <= maior; i++) {
                System.out.println(+i);
            }

            //For que vai do Maior ao Menor
            System.out.println("---------------------------");
            System.out.println("Valores do Maior ao Menor: ");
            for (int i = maior; i >= menor; i--) {
                System.out.println(+i);
            }
        }

    }

}

/*
Capturar dois valores diferentes e descobrir qual é o maior e menor (checked)
criar for que vai do menor para o maior e vice-versa (checked)
apresentar a média no final do ciclo (checked)
 */
