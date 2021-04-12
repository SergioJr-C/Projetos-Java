package Exemplos;

import java.util.Scanner;

public class aula_1_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int quantNeg = 0;
        int quantPos = 0;
        double somaPos = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": ");
            numeros[i] = entrada.nextInt();
        
            if (numeros[i] < 0) {
                quantNeg++;
            }
                if (numeros[i] > 0) {
                    quantPos++;
                    somaPos += numeros[i];
                }
            
        }
            double media = somaPos/quantPos;
            System.out.println("Quantidade de " + "números negativos: " +quantNeg);
            System.out.println("Média dos números positivos: " +media);
        
    }
}
