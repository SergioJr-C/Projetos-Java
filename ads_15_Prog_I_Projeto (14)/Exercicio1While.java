
package Resolvidos_pelo_Professor_Lista1;

public class Exercicio1While {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int pos = 0;
        System.out.println("Vetor:");
        while (pos < vetor.length){
            vetor[pos] = (int) (Math.random() * 10);
            System.out.print(vetor[pos] + " ");
            pos++;
        }
        System.out.println("");
        System.out.println("Vetor na ordem inversa: ");
        pos = vetor.length - 1;
        while (pos >= 0){
            System.out.print(vetor[pos] + " ");
            pos--;
        }
    }
}
