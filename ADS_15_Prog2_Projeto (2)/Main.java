/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo_2_Aluguel_de_Veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo hilux = new Veiculo();
        
        hilux.setCodigo(1234567890);
        hilux.setModelo("Hilux");
        hilux.setPreco(200);
        
        Cliente joaozinho = new Cliente();
        
        joaozinho.setCnh(01111112351);
        joaozinho.setNome("Joaozinho");
    }
    
}
