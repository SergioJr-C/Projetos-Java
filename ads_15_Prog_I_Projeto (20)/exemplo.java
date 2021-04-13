/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_4_Lebre_e_Tartaruga;

/**
 *
 * @author 2019013473
 */
public class exemplo {
    
static int L = 0;
    static int T = 0;
    static String[][] corrida = new String[2][50]; //falta informar o valor 
    static int sorteio;
    static boolean vencedor = false;
    static String CSI = "\u001B[";

    public static void main(String args[]) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 50; j++) {
                corrida[i][j] = "-";
            }

        }
        while (!vencedor) {
            verificaVencedor();
            exibePosicao();
            sorteiaNumero();
            movimentaAnimal();
//            if ((T >= 49) || (L >= 49)){
//            break;
//        }
        }

    }

    public static void sorteiaNumero() {
        if ((T < 49) && (L < 49)) {
            sorteio = (int) (Math.random() * 10);
            System.out.println("");
            System.out.print(CSI + "34" + "m");
            System.out.print("Número Sorteado: " + sorteio);
            System.out.println(CSI + "m");
        }
    }

    public static void movimentaAnimal() {
        //Tartaruga
        if (sorteio < 3) {
            T = T + 3;
            System.out.println("Tartaruga caminhou rapidamente e avançou 3 casas à direita!");
            if (T > 49) {
                T = 49;
            }
        } else if (sorteio < 6) {
            T = T - 6;
            System.out.println("Tartaruga escorregou e voltou 6 casas à esquerda!");
            if (T < 0) {
                T = 0;
            }
        } else if (sorteio < 10) {
            T = T + 1;
            System.out.println("Tartaruga caminhou lentamente e avançou apenas 1 casa à direita!");
            if (T > 49) {
                T = 49;
            }
        }

        //Lebre
        if (sorteio < 2) {
            System.out.println("Lebre dormiu no caminho e perdeu de avançar uma casa!");

        } else if (sorteio < 5) {
            L = L - 8;
            System.out.println("Lebre escorregou e voltou 8 casas à esquerda!");
            if (L < 0) {
                L = 0;
            }
        } else if (sorteio < 8) {
            L = L + 2;
            System.out.println("Lebre deu um pequeno salto, avançando 2 casas à direita!");
            if (L > 49) {
                L = 49;
            }
        } else if (sorteio < 10) {
            L = L - 4;
            System.out.println("Lebre escorregou e acabou voltando 4 casas à esquerda!");
            if (L < 0) {
                L = 0;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 50; j++) {
                corrida[i][j] = "-";
            }

        }
        corrida[0][T] = "T";
        corrida[1][L] = "L";
    }

    public static void verificaVencedor() {
        //se chegar na posição 49 do vetor, venceu!
        //exibePosição envia informação da posição pra verificar se alguem venceu
        if ((T == 49) && (L == 49)) {
            System.out.print(CSI + "32" + "m");
            System.out.print("EMPATE \\Õ/");
            System.out.println(CSI + "m");

            vencedor = true;
        }
        if (T == 49) {
            System.out.print(CSI + "32" + "m");
            //System.out.println(" \t (o*v*)o Tartaruga Vence a Corrida! õ/");
            System.out.println(" /)");
            System.out.println("O( )~");
            System.out.println(" \\)  Tartaruga Vence a Corrida! õ/");
            System.out.println("");
            System.out.print(CSI + "m");
            System.out.print(CSI + "31" + "m");
            System.out.println("(\\ (\\");
            System.out.println("( x.x)");
            System.out.println("O_('')('') Enquanto a Lebre ficou para trás! =(");
            System.out.print(CSI + "m");
            vencedor = true;
        }
        if (L == 49) {
            System.out.print(CSI + "32" + "m");
            System.out.println("(\\_/)");
            System.out.println("(^_^)");
            System.out.println("(___)0 Lebre Vence a Corrida! õ/");
            System.out.print(CSI + "m");
            System.out.print(CSI + "31" + "m");
            System.out.println(" /)");
            System.out.println("O( )~");
            System.out.println(" \\) Enquanto a Tartaruga fica no caminho! =(");
            System.out.print(CSI + "m");
            vencedor = true;
        }
    }

    public static void exibePosicao() {
        //movimentaAnimal envia informação
        for (int i = 0; i < corrida.length; i++) {
            for (int j = 0; j < corrida[0].length; j++) {
                System.out.print(corrida[i][j] + " ");
            }
            System.out.println("");
        }
    }
}