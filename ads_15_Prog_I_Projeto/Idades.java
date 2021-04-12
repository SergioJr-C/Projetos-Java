package Exemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author 2017310432
 */
public class Idades {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite um número: ");
        int num2 = entrada.nextInt();

        int somaidade = 0;
        int cont = 0;

        if (num1 != num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println("Digite uma idade: ");
                int idade = entrada.nextInt();
                cont++;
                somaidade = somaidade + idade;

            }
            System.out.println("A média das idades é de: " + somaidade / cont);
       }

    }

}


	
/*

[11:34, 8/7/2019] Wezer: maior = 7;
menor = 3;

for ( i = menor; i < maior; i++){ 
    Aqui dentro daí tu pede Idades as Idades, ao final desse for tu apresenta a média do total de Idades que tu precisou informar.
}

Aqui tu apresenta a média de Idades
[11:40, 8/7/2019] Wezer: Então seria um algoritmo que tu começa pedindo por 2 números, 
que serão os determinantes de quantos ciclos terá o for, se será 1 ciclo, 2, 3, ... n ciclos, e dentro do for tu vai colocar uma mensagem, 
falando para o usuário digitar uma idade e capturar essa idade. 
--Essa idade tu armazena em uma variável 

e vai precisar também de uma variável que vá somando o total de Idades e ao final, 
quando sair do for, tu vai usar essa variável com a soma total das Idades e dividir pela quantidade de ciclos que o for teve, 
se o for teve 2 ciclos, tu vai ter que dividir por 2, se foi 3, aí divide por 3, só que tu nunca vai saber ao certo quantas vezes o for vai repetir, 
aí tem que fazer um cálculo ou um contador pra ao final da execução do for tu saber por quanto precisa dividir

 */
