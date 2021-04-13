
package Resolvidos_pelo_Professor_Lista2;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] sorteio = new int[10];
        int[] diferentes = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        System.out.println("Vetor Sorteio: ");
        for (int i = 0; i < 10; i++) {
            sorteio[i] = (int) (Math.random() * 10);
            System.out.print(sorteio[i] + " ");
        }
        System.out.println("\n\n");
        int posDif = 0;
        
        for (int i = 0; i < 10; i++) {
            int num = sorteio[i];
            boolean existe = false;
            for (int j = 0; j < 10; j++) {
                if (num == diferentes[j]){
                    existe = true;
                    break;
                }
            }
            if (existe == false){
                diferentes[posDif] = num;
                posDif++;
            }
        }
        System.out.println("Vetor Diferentes: ");
        for (int i = 0; i < 10; i++) {
            if (diferentes[i] >= 0)
                System.out.print(diferentes[i] + " ");
            else
                System.out.println(" ");
        }
    }
}
