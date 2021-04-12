/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos_2;

import java.io.*;

/**
 *
 * @author 2017310432
 */
public class buff {

    public static void main(String[] args) throws IOException {
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite um número: ");
        String primeiro = num.readLine();
        System.out.println("Digite outro número: ");
        String segundo = num.readLine();

        int intprimeiro = Integer.parseInt(primeiro);
        int intsegundo = Integer.parseInt(segundo);

        int maior = 0;
        int menor = 0;
        int media = (intprimeiro + intsegundo) / 2;

        if (intprimeiro > intsegundo) {
            maior = intprimeiro;
            menor = intsegundo;
        } else {
            menor = intprimeiro;
            maior = intsegundo;
        }

//        for (int i = menor; i <= maior; i++) {
//            System.out.println("Do menor ao maior: " + i + " ao " + maior  );
//        }
//        System.out.println("__________________________________________________""\n");
//        
//        for (int i = maior; i >= menor; i--) {
//            System.out.println("Do maior ao menor: " + i + " ao " + menor);
//        }
        System.out.println("Do menor ao maior: " + menor + " ao " + maior);

        for (int i = menor; i <= maior; i++) {
            System.out.print(i+ " - ");
        }
        System.out.println("\n__________________________________________________"+   "\n");
        System.out.println("Do maior ao menor: " + maior + " ao " + menor);
        for (int i = maior; i >= menor; i--) {
            System.out.print(i + " - ");
        }

        System.out.println("\nO maior número é: " + maior + "\n");
        System.out.println("O menor número é: " + menor + "\n");
        System.out.println("Média dos números: " + media + "\n");
    }

}
/*
maior e menor
for que vai do maior ao menor
for que vai do menor ao maior
a média
 */
 
 
