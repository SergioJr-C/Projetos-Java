package Licao_2_Ordenacao_de_Vetores_Selection_Sort_e_Bublesort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2017310432
 */
public class Aula_selection_sort {

    public static void main(String[] args) {
        int[] vet = new int[10];
        System.out.println("Vetor: ");
        for (int i = 0; i < 10; i++) {
            vet[i] = (int) (Math.random() * 10);
            System.out.print("" + vet[i]);
        }
        for (int i = 0; i < 9; i++) {
            int menor = vet[i];
            for (int j = i + 1; j < 10; j++) {
                if (menor > vet[j]) {
                    int aux = menor;
                    menor = vet[j];
                    vet[j] = aux;
                }
            }
            vet[i] = menor;
        }
        System.out.println("");
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
