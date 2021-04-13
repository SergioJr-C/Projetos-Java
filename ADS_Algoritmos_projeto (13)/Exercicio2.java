
package Resolvidos_pelo_Professor_Lista7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader entrada = new BufferedReader(new 
            InputStreamReader(System.in));
        String opcao = "";
        double saldo = 0;
        while (!opcao.equals("d")){
            System.out.println("(a) Saldo");
            System.out.println("(b) Saque");
            System.out.println("(c) Depósito");
            System.out.println("(d) Sair");
            System.out.print("Escolha: ");
            opcao = entrada.readLine();
            switch(opcao){
                case "a": 
                    System.out.println("Saldo: " + saldo);
                    break;
                case "b":
                    System.out.print("Valor do saque: ");
                    double saque = Double.parseDouble(entrada.readLine());
                    if (saque <= saldo){
                        saldo -= saque;
                        System.out.println("Saldo: " + saldo);
                    } 
                    else{
                        System.out.println("Danou-se! Saldo insuficiente!");
                    }
                    break;
                case "c":
                    System.out.print("Valor do depósito: ");
                    double dep = Double.parseDouble(entrada.readLine());
                    saldo += dep;
                    System.out.println("Saldo: " + saldo);
                    break;
                case "d": System.out.print("Encerrando");
                    for (int i = 1; i <= 3; i++) {
                        Thread.sleep(1000);
                        System.out.print(".");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
