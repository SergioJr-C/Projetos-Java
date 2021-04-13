package Resolvidos_pelo_Professor_Lista4;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] a = new int[6][6];
        int[] b = new int[6];
        int[] c = new int[6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Vetor B (soma das linhas): ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                b[i] += a[i][j];                
            }
            System.out.print(b[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Vetor C (soma das colunas): ");
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                c[j] += a[i][j];
            }
            System.out.print(c[j] + " ");
        }
    }
}
