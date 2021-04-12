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
public class aula_bublesort {

    public static void main(String[] args) {
        int[] vet = new int[10];
        System.out.println("Vetor: ");
        for (int i = 0; i < 10; i++) {
            vet[i] = (int) (Math.random() * 10);
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i < vet.length; i++) {
//            System.out.println(i + " ° iteração");
            for (int j = 0; j < vet.length - 2; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;

                }
            }
        }
        System.out.println("Vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
