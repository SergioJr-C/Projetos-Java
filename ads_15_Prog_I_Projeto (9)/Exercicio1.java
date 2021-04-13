
package ListaExercicios_3_Matrizes;

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        System.out.println("Matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = (int) (Math.random() * 20);
                if (mat[i][j] < 10){
                    System.out.print(" " + mat[i][j] + " ");
                }
                else{
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println("");
        }
        int cont = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (mat[i][j] > 10)
                    cont++;
            }
        }
        System.out.println("Quant. valores > 10: " + cont);
    }
}
