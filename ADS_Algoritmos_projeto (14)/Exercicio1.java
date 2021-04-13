
package Resolvidos_pelo_Professor_Lista8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double maiorAlt = 0;
        double menorAlt = 0;
        String sexoMaiorAlt = "";
        String sexoMenorAlt = "";
        int contHomens = 0;
        int contMulheres = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Altura: ");
            double alt = Double.parseDouble(entrada.readLine());
            System.out.print("Sexo (M ou F): ");
            String sexo = entrada.readLine().toUpperCase();
            if (i == 1){
                maiorAlt = alt; sexoMaiorAlt = sexo;
                menorAlt = alt; sexoMenorAlt = sexo;
            }
            else{
                if (alt > maiorAlt){
                    maiorAlt = alt;
                    sexoMaiorAlt = sexo;
                }
                if (alt < menorAlt){
                    menorAlt = alt;
                    sexoMenorAlt = sexo;
                }
            }
            if (sexo.equals("F")){
                contMulheres++;
            }
            else{
                contHomens++;
            }
        }
        System.out.println("Maior altura: " + maiorAlt);
        System.out.println("Sexo pessoa mais alta: " + sexoMaiorAlt);
        System.out.println("Menor altura: " + menorAlt);
        System.out.println("Sexo pessoa mais baixa: " + sexoMenorAlt);
        System.out.println("Quant. Homens: " + contHomens);
        System.out.println("Quant. Mulheres: " + contMulheres);
    }
}
