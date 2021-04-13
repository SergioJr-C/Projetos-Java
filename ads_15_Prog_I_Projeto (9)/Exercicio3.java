
package ListaExercicios_3_Matrizes;

public class Exercicio3 {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j)
                    mat[i][j] = 1;
                else
                    mat[i][j] = 0;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
