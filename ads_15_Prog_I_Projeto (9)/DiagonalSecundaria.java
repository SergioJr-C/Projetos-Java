
package ListaExercicios_3_Matrizes;

public class DiagonalSecundaria {
    public static void main(String[] args) {
        int[][] mat = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j) == (mat.length - 1))
                    mat[i][j] = 0;
                else
                    mat[i][j] = 1;                
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
