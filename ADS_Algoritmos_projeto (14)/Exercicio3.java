
package Resolvidos_pelo_Professor_Lista8;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int num = entrada.nextInt();
        int soma = 0;
        /**
        int div = 1;        
        while (div <= (num/2)){
            int resto = num % div;
            if (resto == 0){
                soma = soma + div;
            }
            div++;
        }
        * **/
        for (int i = 1; i <= (num/2); i++) {
            int resto = num % i;
            if (resto == 0){
                soma = soma + i;
            }
        }
        System.out.println("Soma: " + soma);
        if (soma > num){
            System.out.println("NÚMERO ABUNDANTE");
        }
        else{
            System.out.println("NÃO É UM NÚMERO ABUNDANTE");
        }
    }
}
