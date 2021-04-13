
package Resolvidos_pelo_Professor_Lista4;

public class Exercicio3 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        System.out.println("Matriz A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = (int) (Math.random() * 10);
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz C: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
