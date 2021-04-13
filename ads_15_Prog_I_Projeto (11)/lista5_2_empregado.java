/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_5_Metodos;

import java.text.NumberFormat;

/**
 *
 * @author 2017310432
 */
public class lista5_2_empregado {

    public static void main(String[] args) {
        System.out.println("Aumento de 10% Salário: ");
        System.out.println("");
        double salario = Math.random() * 800;
        double aumentaSal = 0;
        aumentaSalario(salario, aumentaSal);

    }

    public static double aumentaSalario(double salario, double aumentaSal) {
        double porcentagem = salario * 0.1;
        aumentaSal = porcentagem + salario;
        exibeSalario(salario, aumentaSal);
        return (aumentaSal);

    }

    public static void exibeSalario(double salario, double aumentaSal) {
        System.out.println("Salário Bruto: ");
        System.out.println(NumberFormat.getCurrencyInstance().format(salario));
        System.out.println("");
        System.out.println("Salário com 10% de Aumento: ");
        System.out.println(NumberFormat.getCurrencyInstance().format(aumentaSal));

    }

}
