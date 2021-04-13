
package Resolvidos_pelo_Professor_Lista6;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número: ");
            int num = entrada.nextInt();
            if (i == 1){
                maior = num;
                menor = num;
            }
            else{
                if (num > maior){
                    maior = num;
                }
                if (num < menor){
                    menor = num;
                }
            }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        }
        
    }
}
