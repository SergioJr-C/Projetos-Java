package Licao_2_Ordenacao_de_Vetores_Selection_Sort_e_Bublesort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vet = new int[10];
        System.out.println("Vetor: ");
        for (int i = 0; i < 10; i++) {
            vet[i] = (int) (Math.random() * 10);
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 9; i++) {
            int menor = vet[i];
            for (int j = i + 1; j < 10; j++) {
                if (menor > vet[j]){
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
