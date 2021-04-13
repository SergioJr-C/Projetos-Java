package ListaExercicios_4_Matrizes;

public class Exercicio_4_2 {

    public static void main(String[] args) {
        int[][] matrizA = new int[6][6];
        int[] vetorB = new int[6];
        int[] vetorC = new int[6];

        System.out.println("Matriz: \n");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Soma do Vetor B: ");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                vetorB[i] += matrizA[i][j];
            }
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");
    
        
        System.out.println("Soma do Vetor C: ");
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
               vetorC[j] += matrizA[i][j];
            }
            System.out.print(vetorC[j] + " ");
        }
        System.out.println("");
    }
   
}
