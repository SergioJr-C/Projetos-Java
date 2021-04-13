
package Resolvidos_pelo_Professor_Lista8;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int num = entrada.nextInt();
        int sub = 1;
        int cont = 0;
        boolean teste = true;
        while (teste){
            num = num - sub;
            cont++;
            sub += 2;
            if (num == 0){
                System.out.println("Raiz quadrada: " + cont);
                teste = false;
            }
            else{
                if (num < 0){
                    System.out.println("Não possui raiz quadrada exata");
                    teste = false;
                }
            }
        }
    }
}
