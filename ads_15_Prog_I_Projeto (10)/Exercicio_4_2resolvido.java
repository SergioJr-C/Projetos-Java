package ListaExercicios_4_Matrizes;



public class Exercicio_4_2resolvido {

    public static void main(String[] args) {
        int[][] matrizA = new int[6][6];
        int[] vetorB = new int[6];
        int[] vetorC = new int[6];

        System.out.println("Matriz: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //soma de cada linha
        System.out.print("Vetor com a soma das linhas: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                     vetorB[i] += matrizA[i][j];
            }
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");

    }
}

//2.Escreva uma classe em Java que lê uma 
//matriz A (6 x 6) e cria 2 vetores B e C de 6 elementos. 
//Os vetores B e C devem conter, respectivamente, 
//a soma das linhas (B) e a soma das colunas (C) da matriz. 
//Ao final, imprimir os vetores B e C.
