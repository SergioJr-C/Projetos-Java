
package Resolvido_pelo_Professor_Trabalho_2_Verificar_Digitos_CPF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cpf {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("CPF: ");
        String cpf = entrada.readLine();
        if ((cpf.length() == 11)){
            int[] digCpf = new int[cpf.length()];
            for (int i = 0; i < cpf.length(); i++) {
                digCpf[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
            }
            int primeiro = digCpf[0];
            for (int i = 1; i < 10; i++) {
                if (digCpf[i-1] == digCpf[i]){
                    
                }
            }
            boolean dig1 = true;    boolean dig2 = true;
            int soma = 0;
            int mult = 10;
            for (int i = 0; i <= 8; i++) {
                soma += digCpf[i] * mult;
                mult--;
            }
            int resto = soma % 11;
            if (resto < 2){
                if (digCpf[9] != 0)
                    dig1 = false;
            }
            else{
                int sub = 11 - resto;
                if (digCpf[9] != sub)
                    dig1 = false;
            }
            soma = 0;
            mult = 11;
            for (int i = 0; i < 10; i++) {
                soma += digCpf[i] * mult;
                mult--;
            }
            resto = soma % 11;
            if (resto < 2){
                if (digCpf[10] != 0)
                    dig2 = false;
            }
            else{
                int sub = 11 - resto;
                if (digCpf[10] != sub)
                    dig2 = false;
            }
            if ((dig1 == true) && (dig2 == true)){
                System.out.println("CPF válido!");
            }
            else{
                System.out.println("CPF inválido!");
            }
        }
        else{
            System.out.println("CPF inválido!");
        }
    }
}
