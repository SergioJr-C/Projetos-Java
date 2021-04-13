
package Resolvidos_pelo_Professor_Lista5;

import java.text.NumberFormat;

public class Exercicio2 {
    static double salario;
    public static void main(String[] args) {
        while (salario < 998){
            salario = Math.random() * 10000;
        }        
        exibeSalario("Salário Atual: ");
        aumentaSalario(10);
    }
    public static void exibeSalario(String mensagem){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(mensagem + nf.format(salario));
    }
    public static void aumentaSalario(double perc){
        salario += (salario * (perc/100));
        exibeSalario("Salário após aumento: ");
    }
}
