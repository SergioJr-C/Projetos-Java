package Resolvidos_pelo_Professor_Lista2;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] valores = new int[10];
        int[] posPares = new int[5];
        int[] posImpares = new int[5];
        System.out.println("Vetor Valores:");
        for (int i = 0; i < 10; i++) {
            valores[i] = (int) (Math.random() * 100);
            System.out.println(i + "\t" + valores[i]);
        }
        System.out.println("");
        int par = 0;
        int imp = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                posPares[par] = valores[i];
                par++;
            }
            else{
                posImpares[imp] = valores[i];
                imp++;
            }
        }
        System.out.println("Vetor Posições Pares:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "\t" + posPares[i]);
        }
        System.out.println("");
        System.out.println("Vetor Posições �?mpares:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "\t" + posImpares[i]);
        }
    }
}
