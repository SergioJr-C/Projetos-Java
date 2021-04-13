/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaExercicios_4;

import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class num3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = entrada.nextDouble();
        System.out.println("Digite o tempo de serviço: ");
        double tempservico = entrada.nextDouble();
        
        double salariobonus = (salario*1.20);
        double salariobonus2 = (salario*1.10);
        
        if(tempservico >=5){
            System.out.println("Recebe bônus de 20%: "+salariobonus);
        }else{
            System.out.println("Recebe bônus de 20%: "+salariobonus2);
        }
    }
}


//tempo de serviço igual ou maior a 5 20% do valor do salário
//10% aos demais
//digitar o salário e o tempo de serviço do funcionário
//calcular e mostrar o valor do bônus recebido por ele