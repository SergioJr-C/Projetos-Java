
package Resolvidos_pelo_Professor_Lista5;

import java.text.DecimalFormat;

public class Exercicio6 {
    static int quantRep;
    static double maior;
    static DecimalFormat df = new DecimalFormat("#.#");
    public static void main(String[] args) {
        double soma = 0;        
        for (int i = 1; i <= 5; i++) {            
            double nota = (Math.random() * 10);
            soma += nota;
            contaReprovados(nota);
            encontraMaior(nota);
            System.out.println("Aluno " + i + ": " + df.format(nota));            
        }
        calculaMedia(soma, 5);
        System.out.println("Quantidade de reprovados: " + quantRep);
        System.out.println("Maior média: "  + maior);
    }
    public static void calculaMedia(
            double somaNotas, double quant){
        System.out.println("Média: " + df.format(somaNotas/quant));
    }
    public static void contaReprovados(double nota){
        if (nota < 7)
            quantRep++;
    }
    public static void encontraMaior(double nota){
        if (nota > maior)
            maior = nota;
    }
}
