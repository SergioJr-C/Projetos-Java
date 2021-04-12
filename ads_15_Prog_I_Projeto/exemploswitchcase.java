package Exemplos;


import java.text.NumberFormat;
import java.util.Scanner;


public class exemploswitchcase {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.print("1 - Saldo");
        System.out.print("2 - Saque");
        System.out.print("3 - Depósito");
        System.out.print("4 - Sair");
        System.out.print("ESCOLHA: ");
        int op = entrada.nextInt();
        double saldo = 1000;
        switch (op) {
            case 1:
                System.out.println("SALDO " + nf.format(saldo));
                break;
            case 2:
                System.out.print("valor do saque: ");
                double saque = entrada.nextDouble();
                if (saque <= saldo) {
                    saldo -= saque; // saldo = saldo - saque;
                    System.out.println("Saldo Atualizado: " + nf.format(saldo));
                } else {
                    System.out.println("Saldo Iknsuficiente!");
                }
                break;
            case 3:
                System.out.println("Valor do depósito: ");
                double deposito = entrada.nextDouble();
                saldo += deposito; // saldo= saldo + deposito;
                System.out.println("Saldo Atualizado: " + nf.format(saldo));
                break;
            case 4:
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }

}
