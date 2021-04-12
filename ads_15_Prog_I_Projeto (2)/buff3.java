/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos_2;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class buff3 {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        int media = 0;
        int maior = 0;
        int menor = 0;
        for (int i = 0; i < 10; i++) {
            String ent = JOptionPane.showInputDialog(null, "Digite um número:");
            int num = Integer.parseInt(ent);
            vetor[i] = num;
        }
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, vetor[i]);
        }
        System.out.println("A média é :" + media);
        while(true){
            JOptionPane.showMessageDialog(null, JOptionPane.showInputDialog(null, "Digite ai..."));
        }
    }

}
