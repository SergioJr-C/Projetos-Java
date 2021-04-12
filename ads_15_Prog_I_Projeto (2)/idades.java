/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos_2;

import java.io.*;

public class idades {

    public static void main(String[] args) throws IOException {
        BufferedReader idades = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masculino: ");
        String m = idades.readLine();
        System.out.println("Feminino: ");
        String f = idades.readLine();

        int intm = Integer.parseInt(m);
        int intf = Integer.parseInt(f);

        int maior = 0;
        int menor = 0;

        //Verificar se é maior que 0
        if (((intm <= 0) && (intf <= 0) || (intm == intf))) {
            System.out.println("Dados Incorretos, Digite Novamente.");
        } else {

            //Verificar o maior e o menor
            if ((intm > intf)) {
                maior = intm;
            } else {
                maior = intf;
            }

            if ((intf < intm)) {
                menor = intf;
            } else {
                menor = intm;
            }

            //For que capture as idades
            System.out.println("---------------------------------");
            System.out.println("Maior e Menor idade lido: \n o Maior é: " + maior + " e o Menor: " + menor);

            for (int i = menor; i <= maior; i++) {
                System.out.println(i);
            }

            //descobrir a média
            int media = ((maior + menor) / 2);
            System.out.println("---------------------------------");
            System.out.println("A média das idades é: " + media);
        }
    }
}
