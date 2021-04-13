
package Resolvidos_pelo_Professor_Lista3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Idade do estudante 1: ");
        int idade1 = entrada.nextInt();
        System.out.print("Idade do estudante 2: ");
        int idade2 = entrada.nextInt();
        System.out.print("Idade do estudante 3: ");
        int idade3 = entrada.nextInt();
        double media = (idade1 + idade2 + idade3)/3;
        if (media < 25){
            System.out.println("TURMA JOVEM");
        }
        else{
            if (media < 40){
                System.out.println("TURMA ADULTA");
            }
            else{
                System.out.println("TURMA IDOSA");
            }
        }
    }
}
