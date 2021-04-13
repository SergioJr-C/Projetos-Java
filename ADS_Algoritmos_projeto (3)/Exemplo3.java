package Licao2_Estruturas_de_Selecao;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("1 - SALDO");
        System.out.println("2 - SAQUE");
        System.out.println("3 - DEPÓSITO");
        System.out.println("4 - SAIR");
        System.out.print("Escolha: ");
        int op = entrada.nextInt();
        double saldo = 1000;
        switch(op){
            case 1: 
                System.out.println("SALDO: " + 
                        nf.format(saldo));
                break;
            case 2:
                System.out.print("Valor do Saque: ");
                double saque = entrada.nextDouble();
                if (saque <= saldo){
                    saldo -= saque; //saldo = saldo - saque;
                    System.out.println("Saldo Atualizado: " +
                            nf.format(saldo));
                }
                else{
                    System.out.println("Saldo insuficiente!");
                }
                break;
            case 3:
                System.out.print("Valor do Depósito: ");
                double deposito = entrada.nextDouble();
                saldo += deposito;   //saldo = saldo + dep;
                System.out.println("Saldo atualizado: " + 
                        nf.format(saldo));
                break;
            case 4:
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}
