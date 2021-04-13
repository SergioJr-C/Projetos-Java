package Trabalho_4_Lebre_e_Tartaruga;

public class Trabalho_4_Trabalho4_Lebre_e_Tartaruga {

    static String[][] corrida = new String[2][50];
    static int Sorteio;
    static int PosT = 0;
    static int PosL = 0;
    static boolean vencedor = false;

    public static void main(String[] args) {
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
        }
    }

    public static void sorteiaNumero() {
        if ((PosT < 49) && (PosL < 49)) {
            Sorteio = (int) (Math.random() * 10);
        }

    }

    public static void movimentaAnimal() {
        //Tartaruga
        if (Sorteio < 3) { //Se o número sorteado for 0, 1, ou 2, => 3 quadrados à direita
            PosT = PosT + 3;
            System.out.println("Tartaruga caminha Rapidamente");
            if (PosT > 49) {//Se a posição Tartaruga exceder 49, sua posição não passará da última posição que é 49 
                PosT = 49;
            }
        } else if (Sorteio < 6) {//Se o número sorteado for 3, 4 ou 5, => 6 quadrados à esquerda
            PosT = PosT - 6;
            System.out.println("Tartaruga escorregou...");
            if (PosT < 0) {//Se a posição da Tartaruga for menor que 0, a posição inicial será a 0 
                PosT = 0;
            }
        } else if (Sorteio < 10) {//Caso o número sorteado não se encaixe dentro dos valores anteriores 0,1,2,3,4 ou 5 => 1 quadrado à direita
            PosT = PosT + 1;
            System.out.println("Tartaruga caminhou lentamente...");
            if (PosT > 49) {//Se a posição da Tartaruga for menor que 49 será possível continuar a corrida
                PosT = 49;
            }
        }

        //Lebre
        if (Sorteio < 2) {//Se o número sorteado for 0 ou 1, a Lebre  não se movimenta
             //não será feito nada, pois não há necessidade
            System.out.println("Lebre dormiu...");
            
        } else if (Sorteio < 5) {//Se o número sorteado for 2, 3 ou 4 => 8 quadrados à esquerda
            PosL = PosL - 8;
            System.out.println("Lebre escorregou...");
            if (PosL < 0) {//Como anteriormente, se a posição da Lebre for menor que 0, a posição inicial será a 0 
                PosL = 0;
            }
        } else if (Sorteio < 8) { //Se o número sorteado for 5, 6 ou 7 => 2 quadrados à direita
            PosL = PosL + 2;
            System.out.println("Lebre deu um pequeno salto!");
            if (PosL > 49) { //Se a posição da Lebre exceder 49, sua posição não passará da última posição que é 49
                PosL = 49;
            }
        } else if (Sorteio < 10) {//Se o número sorteado não se encaixar nos requistos anteriores, ou seja o Sorteio de 8 ou 9 => 4 quadrados à esquerda
            PosL = PosL - 4;
            System.out.println("Lebre escorregou...");
            if (PosL < 0) {
                PosL = 0;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 50; j++) {
                corrida[i][j] = "-";
            }

        }
        corrida[0][PosT] = "T";
        corrida[1][PosL] = "L";
    }

    public static void verificaVencedor() {
        if ((PosT == 49) && (PosL == 49)) {
            System.out.println("");
            System.out.println("\n HOUVE IMPATE!");
            vencedor = true;
        }
        if (PosT == 49) {
            System.out.println("");
            System.out.println("\nTARTARUGA VENCEU!");
            vencedor = true;
        }
        if (PosL == 49) {
            System.out.println("\nA LEBRE VENCEU!");
            vencedor = true;
        }
    }

    public static void exibePosicao() {
        for (int i = 0; i < corrida.length; i++) {//As 50 colunas
            for (int j = 0; j < corrida[0].length; j++) {//Referente às linhas
                System.out.print(corrida[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
