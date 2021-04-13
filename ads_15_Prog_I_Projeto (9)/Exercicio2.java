
package ListaExercicios_3_Matrizes;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] mat = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mat[i][j] = (int) (Math.random() * 10);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mat[i][j] % 2 == 0){
                    mat[i][j] = 1;
                }
                else{
                    mat[i][j] = 0;
                }
                if (mat[i][j] == 1)
                    System.out.print(" " + mat[i][j] + " ");
                else
                    System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
