
package Resolvidos_pelo_Professor_Lista5;

public class Exercicio7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(verifNumPerfeito(i))
                System.out.println(i + " é um número perfeito");
        }
    }
    public static boolean verifNumPerfeito(int num){
        int soma = 0;
        for (int i = 1; i <= (num/2); i++) {
            if (num % i == 0){
                soma += i;
            }
        }
        if (soma == num)
            return true;
        else
            return false;
    }
}
