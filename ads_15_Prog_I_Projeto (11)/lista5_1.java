
package ListaExercicios_5_Metodos;

import java.text.NumberFormat;
import java.util.Scanner;

public class lista5_1 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Calcule o Valor Total dos Produtos!");
        System.out.println("Digite a Quantidade do produto solicitado: ");
        int qtd = entrada.nextInt();
        System.out.println("Digite o Preço do Produto acima: ");
        double preco = entrada.nextDouble();
        calculaTotalFatura(qtd, preco);
    }
    
    public static double calculaTotalFatura (int qtd, double preco) {
        double total = qtd * preco;
        System.out.println("Total dos Valores dos Produtos Solicitados: ");
        System.out.println(NumberFormat.getCurrencyInstance().format(total));
        return (total);
    }
}

    
