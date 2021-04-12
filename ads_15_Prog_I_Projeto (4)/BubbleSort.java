
package Licao_2_Ordenacao_de_Vetores_Selection_Sort_e_Bublesort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vet = new int[10];
        System.out.print("Vetor: ");
        for (int i = 0; i < 10; i++) {
            vet[i] = (int) (Math.random() * 10);
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i < vet.length; i++) {
            for (int j = 0; j < vet.length - i; j++) {
                if (vet[j] > vet[j + 1]){
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }  
            }
        }
        System.out.print("Vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
