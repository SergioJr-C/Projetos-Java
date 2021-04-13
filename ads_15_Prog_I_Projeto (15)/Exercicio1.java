
package Resolvidos_pelo_Professor_Lista2;

public class Exercicio1 {
    public static void main(String[] args) {
        double[] vetor = new double[15];
        double soma = 0;
        System.out.println("Vetor: ");
        for (int i = 0; i < 15; i++) {
            vetor[i] = Math.random() * 100;
            System.out.println(vetor[i] + " ");
            soma += vetor[i];
        }
        double media = soma/15;
        System.out.println("");
        System.out.println("Média: " + media);
    }
}
