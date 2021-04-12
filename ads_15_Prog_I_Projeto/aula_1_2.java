/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;

/**
 *
 * @author 2017310432
 */
public class aula_1_2 {

    public static void main(String[] args) {
        int[] jogadores = {1, 3, 4, 5, 7, 8, 9, 10, 11, 15, 21};
        String[] nomeJog = {"Sergio", "Eduardo", "Leonardo", "André", "Uellinton", "Carlos", "Paulo", "Rurick", "Cristian", "Romulo", "Guilherme"};
        System.out.println("Camisa \t  Jogador \n");

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println("  " + jogadores[i]
                    + "  \t  " + nomeJog[i]);

        }  
}
}