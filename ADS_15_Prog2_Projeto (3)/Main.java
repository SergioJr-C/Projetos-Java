/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo_3_Triangulo;

public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(2, 2, 2);

        System.out.println("Perímetro: " + t.getPerimetro());
        System.out.println("Triângulo: " + t.getTipo());
        
        System.out.println(t);
    }
}
