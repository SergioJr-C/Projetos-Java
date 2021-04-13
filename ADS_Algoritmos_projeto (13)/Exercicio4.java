
package Resolvidos_pelo_Professor_Lista7;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor: ");
        int num = entrada.nextInt();
        int div = 1;
        int cont = 0;
        while (div <= num){
            if (num % div == 0){
                System.out.println(num + " é múltiplo de " + div);
                cont++;
            }
            div++;
        }
        if (cont == 2){
            System.out.println(num + " é PRIMO");
        }
        else{
            System.out.println(num + " não é PRIMO");
        }
    }
}
