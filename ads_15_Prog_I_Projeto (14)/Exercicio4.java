package Resolvidos_pelo_Professor_Lista1;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int contPares = 0;
        System.out.print("Vetor: ");
        for (int i = 0; i < 10; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.print(vetor[i] + " ");
            if ((vetor[i] % 2 == 0) && (vetor[i] != 0)){
                contPares++;
            }
        }
        System.out.println("Quant. Pares: " + contPares);
    }
}
