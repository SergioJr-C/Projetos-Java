
package Resolvidos_pelo_Professor_Lista1;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[5];
        System.out.println("\tV1\tV2\tV3 ");
        for (int i = 0; i < 5; i++) {
            v1[i] = (int) (Math.random() * 10);
            v2[i] = (int) (Math.random() * 10);
            v3[i] = v1[i] * v2[i];
            System.out.println(i + "\t" + v1[i] + "\t" + 
                    v2[i] + "\t" + v3[i]);
        }
    }
}
