//DUPLA: SÉRGIO E LETÍCIA

package Trabalho_2_Verificar_Digitos_CPF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trabalho {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Informe o CPF: ");
        String cpf = entrada.readLine();
        cpf = cpf.replace(".","");
        cpf = cpf.replace("-","");
        System.out.println(cpf);
        int tamanho = cpf.length();
        int[] cpfdig = new int[tamanho];
        int soma = 0;
        
        if (tamanho == 11)
        
        for (int i = 0; i < tamanho; i++) {
        cpfdig[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }if((cpfdig[0]==cpfdig[1])&&(cpfdig[1]==cpfdig[2])&&
        (cpfdig[2]==cpfdig[3])&&(cpfdig[3]==cpfdig[4])
        &&(cpfdig[4]==cpfdig[5])&&(cpfdig[5]==cpfdig[6])&&
        (cpfdig[6]==cpfdig[7])&&(cpfdig[7]==cpfdig[8])&&
        (cpfdig[8]==cpfdig[9])&&(cpfdig[9]==cpfdig[10])){
        System.out.println("CPF INVÁLIDO!");
        }else{
        soma += cpfdig[0] * 10;
        soma += cpfdig[1] * 9;
        soma += cpfdig[2] * 8;
        soma += cpfdig[3] * 7;
        soma += cpfdig[4] * 6;
        soma += cpfdig[5] * 5;
        soma += cpfdig[6] * 4;
        soma += cpfdig[7] * 3;
        soma += cpfdig[8] * 2;

        int resto1 = soma % 11;

        if (resto1 < 2) {
            resto1 = 0;
        } else {
            resto1 = 11 - resto1;
        }

        if (cpfdig[9] == resto1) {
            soma = 0;
            
            soma += cpfdig[0] * 11;
            soma += cpfdig[1] * 10;
            soma += cpfdig[2] * 9;
            soma += cpfdig[3] * 8;
            soma += cpfdig[4] * 7;
            soma += cpfdig[5] * 6;
            soma += cpfdig[6] * 5;
            soma += cpfdig[7] * 4;
            soma += cpfdig[8] * 3;
            soma += cpfdig[9] * 2;
            
            int resto2 = soma % 11;
            if (resto2 < 2) {
                resto2 = 0;
            } else {
                resto2 = 11 - resto2;
            }
            
            if (cpfdig[10] == resto2) {
                System.out.println("CPF VÁLIDO!");
            }else{
                System.out.println("CPF INVÁLIDO!");
            }
            
        } else {
            System.out.println("CPF INVÁLIDO!");
        }
        }
        
    }
}


