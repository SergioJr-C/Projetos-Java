
package Licao1_Estrutura_de_Repeticao;

import java.io.*;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader leitura  = new BufferedReader(
            new InputStreamReader(System.in));
        Scanner entrada = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
            System.out.print("Nome: ");
            String nome = leitura.readLine();
            System.out.print("Nota 1: ");
            double nota1 = entrada.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = entrada.nextDouble();
            double media = (nota1 + nota2)/2;
            System.out.println(nome + " - Média: " + media);
            if (media >= 7)
                System.out.println("APROVADO");
            else
                if (media > 1.7)
                    System.out.println("EXAME");
                else
                    System.out.println("REPROVADO");
        }
    }
}
