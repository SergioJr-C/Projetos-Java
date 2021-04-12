
package Licao_4_Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplo2 {
    static int tempAtual = 23;
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean onOff = false; //desligado
        int tempMax = 30;
        int tempMin = 16;        
        String op = "";
        while (!op.equals("!")){
            System.out.println("+ Aumentar Temperatura");
            System.out.println("- Diminuir Temperatura");
            System.out.println("* Liga/Desliga");
            System.out.println("! Sair");
            System.out.print("Escolha: ");
            op = entrada.readLine();
            switch(op){
                case "+":                 
                    aumentarTemp(tempMax);   
                    System.out.println("Temperatura Atual: " + tempAtual);
                    break;
                case "-": 
                    diminiurTemp(tempMin);   
                    System.out.println("Temperatura Atual: " + tempAtual);
                    break;
                case "*": 
                    alterarStatus(onOff);  
                    break;
                case "!": 
                    System.out.println("Encerrando!");
                    break;
                default: System.out.println("Opção Inexistente!");
            }
        }
    }
    public static void aumentarTemp(int tmax){
        if (tempAtual < tmax){
            tempAtual++;
        }
    }
    public static void diminiurTemp(int tmin){
        if (tempAtual > tmin){
            tempAtual--;
        }
    }
    public static void alterarStatus(boolean status){
        if (status == true){
            status = false;
        }
        else{
            status = true;
        }
    }
}
