
package ListaExercicios_3_Matrizes;

//c[0][0] = (a[0][0] * b[0][0]) + (a[0][1] * b[1][0]);
//c[0][1] = (a[0][0] * b[0][1]) + (a[0][1] * b[1][1]);
//c[1][0] = (a[1][0] * b[0][0]) + (a[1][1] * b[1][0]);
//c[1][1] = (a[1][0] * b[0][1]) + (a[1][1] * b[1][1]);

public class MultMatrizes {
    public static void main(String[] args) {
        int[][] a = { {0, 1}, {2, 3} };
        int[][] b = { {3, 2}, {1, 0} };
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                //Existem duas possibilidade de resolução:
                /*
                    c[i][j] = (a[i][0] * b[0][j]) +
                              (a[i][1] * b[1][j]);
                
                  ou a solução apresentada a seguir
                */
                for (int k = 0; k < 2; k++) {
                    c[i][j] += (a[i][k] * b[k][j]);
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
