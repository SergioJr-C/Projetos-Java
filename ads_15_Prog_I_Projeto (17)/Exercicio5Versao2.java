
package Resolvidos_pelo_Professor_Lista5;

import java.util.Scanner;

public class Exercicio5Versao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        exibeMedia(media(8, 9));        
        exibeMedia(media(7, 9, 5));       
    }
    public static double media(double n1, double n2){
        double media = (n1 + n2)/2;
        return media;
    }
    public static double media(double n1, double n2, double n3){
        double media = (n1 + n2 + n3)/3;
        return media;
    }
    public static void exibeMedia(double media){
        System.out.println("Média: " + media);
    }
}
