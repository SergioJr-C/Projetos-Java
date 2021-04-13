
package Resolvidos_pelo_Professor_Lista1;

public class Exercicio7 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        System.out.println("Vetor: ");
        for (int i = 0; i < 10; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");
        int j = vetor.length - 1;
        for (int i = 0; i < vetor.length/2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            j--;
        }
        System.out.println("Vetor invertido: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
