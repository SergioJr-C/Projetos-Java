package ListaExercicios_2_Vetores;

import java.io.*;

public class exerciciolista2_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome e sua respectiva idade para saber a maior idade:  ");

        String[] nome = new String[10];
        int[] intidade = new int[10];

        int maior = 0;
        int menor = 99999999;

        for (int i = 0; i < 10; i++) {
            System.out.print("Nome: ");
            nome[i] = buf.readLine();
            System.out.print("Idade: ");
            intidade[i] = Integer.parseInt(buf.readLine());
            if (intidade[i] < maior) {
                menor = intidade[i];
            } else {
                maior = intidade[i];
            }
            if (intidade[i] > menor) {
                maior = intidade[i];
            }
        } 
        
        System.out.println("_____________________");
        for (int i = 0; i < 10; i++) {
            System.out.println(nome[i] + " Idade: " + intidade[i]);
        }

        System.out.println("_____________________");
        System.out.println("A maior idade é de " + maior + " anos");
        System.out.println("A menor idade é de " + menor + " anos");
        
    }

}
