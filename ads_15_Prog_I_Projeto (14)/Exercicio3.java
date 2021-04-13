
package Resolvidos_pelo_Professor_Lista1;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int menor = 0;
        int maior = 0;
        System.out.print("Vetor: ");        
        for (int i = 0; i < 10; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.print(vetor[i] + " ");
            if (i == 0){
                menor = vetor[i];
                maior = vetor[i];
            }
            else{
                if (vetor[i] < menor)
                    menor = vetor[i];
                if (vetor[i] > maior)
                    maior = vetor[i];
            }
        }
        System.out.println("");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
