
package Resolvidos_pelo_Professor_Lista8;

public class Exercicio2 {
    public static void main(String[] args) {
        int ant = 0;
        int atual = 1;
        for (int i = 1; i <= 50; i++) {
            System.out.println(atual + " ");
            int aux = atual;
            atual = atual + ant;
            ant = aux;
        }
    }
}
