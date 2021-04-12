
package Licao_1_Ordenação_de_Vetores_FuncoesMatematicas_String;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        double valor = 17.23;
        int proxInteiro = (int) Math.ceil(valor);
        System.out.println("Math.ceil(): " + proxInteiro);
        int intAnterior = (int) Math.floor(valor);
        System.out.println("Math.floor(): " + intAnterior);
        int maior = Math.max(intAnterior, proxInteiro);
        System.out.println("Maior valor: " + maior);
        int menor = Math.min(proxInteiro, intAnterior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Raiz quadra de 16: " + Math.sqrt(16));
        System.out.println("3 elevado a pot. 5: " + Math.pow(3, 5));
    }
}
