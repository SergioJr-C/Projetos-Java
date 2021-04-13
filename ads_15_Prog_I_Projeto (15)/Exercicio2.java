package Resolvidos_pelo_Professor_Lista2;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] nomes = { "LANA", "SERGIO", "LETICIA", "ANDRE",
                           "EDUARDO", "LEONARDO", "PAULO", "CARLOS",
                           "ROMULO", "MARIA" };
        int[] idades = { 24, 25, 21, 18, 18, 19, 18, 21, 19, 25 };
        int menor = 0;
        for (int i = 0; i < idades.length; i++) {
            if (i == 0)
                menor = idades[i];
            else
                if (idades[i] < menor)
                    menor = idades[i];
        }
        System.out.println("Idade da(s) pessoa(s) mais jovem(ns): " 
                + menor);
        System.out.println("Pessoas que tem " + menor + " anos: ");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] == menor){
                System.out.println(nomes[i]);
            }
        }
    }
}
