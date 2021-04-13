
package Resolvidos_pelo_Professor_Lista2;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        System.out.print("A: ");
        for (int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("B: ");
        for (int i = 0; i < 5; i++) {
            b[i] = (int) (Math.random() * 100);
            System.out.print(b[i] + " ");
        }
        System.out.println("");
        System.out.print("C: ");
        for (int i = 0; i < 5; i++) {
            c[i] = a[i] - b[4-i];
            System.out.print(c[i] + " ");
        }
    }
}
