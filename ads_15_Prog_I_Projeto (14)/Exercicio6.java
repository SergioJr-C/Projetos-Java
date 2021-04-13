
package Resolvidos_pelo_Professor_Lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vPar = new int[5];
        int[] vImp = new int[5];
        int p = 0;
        int i = 0;
        while ((i < 5) || (p < 5)){
            int num = (int) (Math.random() * 10);
            System.out.println("Número sorteado: " + num);
            if (num != 0){
                if (num % 2 == 0){
                    if (p < 5){
                        vPar[p] = num;
                        p++;
                    }
                    else
                        System.out.println("Vetor de pares cheio!");
                }
                else{
                    if (i < 5){
                        vImp[i] = num;
                        i++;
                    }
                    else
                        System.out.println("Vetor de ímpares cheio!");
                }
            }
            System.out.println("Pressione uma tecla para continuar...");
            entrada.nextInt();
        }
        System.out.print("Vetor de Pares: ");
        for (int j = 0; j < 5; j++) {
            System.out.print(vPar[j] + " ");
        }
        System.out.println("");
        System.out.print("Vetor de Ímpares: ");
        for (int j = 0; j < 5; j++) {
            System.out.print(vImp[j] + " ");
        }
    }
}
