
package Resolvidos_pelo_Professor_Lista8;

import java.util.Scanner;

public class Exercicio4For {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int num = entrada.nextInt();
        int cont = 0;
        for (int i = 1; num > 0 ; i+=2) {
            num = num - i;
            cont++;
            if (num == 0){
                System.out.println("Raiz Quadrada: " + cont);
            }
            else{
                if (num < 0){
                    System.out.println("Não possui raiz quadrada exata");
                }
            }               
        }
    }
}
