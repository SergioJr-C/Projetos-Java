
package Resolvidos_pelo_Professor_Lista5;

import java.util.Scanner;

public class Exercicio4 {
    static int andar = 0;
    static int quantAtual = 0;
    static int capac;
    static int quantAnd;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        inicializa();
        int op = 0;
        while (op != 5){
            System.out.println("1 - Entra");
            System.out.println("2 - Sai");
            System.out.println("3 - Sobe");
            System.out.println("4 - Desce");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            op = entrada.nextInt();
            switch(op){
                case 1: entra();    break;
                case 2: sai();      break;
                case 3: sobe();     break;
                case 4: desce();    break;                    
                case 5: break;
                default: System.out.println("Opção Inválida!");
            }
        }
    }
    public static void inicializa(){        
        System.out.print("Capacidade do Elevador: ");
        capac = entrada.nextInt();
        System.out.print("Quantidade de Andares: ");
        quantAnd = entrada.nextInt();
    }
    public static void entra(){
        if (quantAtual < capac)
            quantAtual++;
        else
            System.out.println("Elevador lotado!");
        visualizaStatus();
    }
    public static void sai(){
        if (quantAtual > 0)
            quantAtual--;
        else
            System.out.println("Elevador Vazio!");
        visualizaStatus();
    }
    public static void sobe(){
        if (andar < (quantAnd - 1))
            andar++;
        else
            System.out.println("Elevador no último andar!");
        visualizaStatus();
    }
    public static void desce(){
        if (andar > 0)
            andar--;
        else
            System.out.println("Elevador no térreo!");
        visualizaStatus();
    }
    public static void visualizaStatus(){
        System.out.println("Andar atual: " + andar);
        System.out.println("Quant. Pessoas: " + quantAtual);
        System.out.println("");
    }
}
