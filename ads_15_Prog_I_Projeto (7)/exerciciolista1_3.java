/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_1_Vetores;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class exerciciolista1_3 {

    public static void main(String[] args) {
        int[] vet = new int[10];
        Scanner entrada = new Scanner(System.in);

        int menor = 0;
        int maior = 0;
        
        for (int i = 1; i < vet.length-1; i++) {
            System.out.println("Vetor [" + i + "]: ");
            vet[i] = entrada.nextInt();
            if (vet[i] < maior) {
                menor = vet[i];
            }
            if (vet[i] > menor) {
                maior = vet[i];
            }
        }

        System.out.println("--------------------------");
        System.out.println("O Maior Número é o: " + maior);
        System.out.println("O Menor Número é o: " + menor);

    }
}

/*
numero_max = vetor[0];
    for (i = 0;i < n;++i)
        if (vetor[i] > numero_max)
            numero_max = vetor[i];
            
 */
