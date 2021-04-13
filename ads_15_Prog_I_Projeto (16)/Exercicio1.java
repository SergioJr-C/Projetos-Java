
package Resolvidos_pelo_Professor_Lista4;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[][] c = new int[5][2];
        System.out.print("A: ");
        for (int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("B: ");
        for (int i = 0; i < 5; i++) {
            b[i] = (int) (Math.random() * 10);
            System.out.print(b[i] + " ");
        }
        System.out.println("");
        System.out.println("C: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0)
                    c[i][j] = a[i];
                else
                    c[i][j] = b[i];
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
