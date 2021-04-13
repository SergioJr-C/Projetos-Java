/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_5_Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lista5_3_controle_remoto {

    static int volumeAtual = 0;
    static int canalAtual = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean onOff = false;
        int volumeMin = 0;
        int volumeMax = 100;
        int canalMin = 0;
        int canalMax = 200;
        System.out.println("Vol = Volume, c = Canal");
        System.out.println("Aumentar Volume ou Mudar Canal? ");
        String escolha = entrada.readLine();
        if (escolha.equals("vol")) {
            String vol = "";
            while (!vol.equals("!")) {
                System.out.println("+ Aumentar Volume");
                System.out.println("- Diminuir Volume");
                System.out.println("* Liga/Desligar ");
                System.out.println("Volume: ");
                vol = entrada.readLine();
                switch (vol) {
                    case "+":
                        AumentarVolume(volumeMax);
                        System.out.println("Volume Atual: " + volumeAtual);
                        break;
                    case "-":
                        DiminuirVolume(volumeMin);
                        System.out.println("Volume Atual: " + volumeAtual);
                        break;
                    case "*":
                        alterarStatus(onOff);
                        break;
                    case "!":
                        System.out.println("Encerrando!");
                        break;
                    default:
                        System.out.println("Opção Inexistente!");
                }
            }
        } else if(escolha.equals("c")) {
            String canal = "";
            while (!canal.equals("!")) {
                System.out.println("+ Canal Próximo");
                System.out.println("- Canal Anterior");
                System.out.println("Canal: ");
                canal = entrada.readLine();
                switch (canal) {
                    case "+":
                        AumentarCanal(canalMax);
                        System.out.println("Canal Atual: " + canalAtual);
                        break;
                    case "-":
                        DiminuirCanal(canalMin);
                        System.out.println("Canal Atual: " + canalAtual);
                        break;
                    case "*":
                        alterarStatus(onOff);
                        break;
                    case "!":
                        System.out.println("Encerrando!");
                        break;
                    default:
                        System.out.println("Opção Inexistente!");
                }
            }
        }

    }

    public static void AumentarVolume(int volumeMax) {
        if (volumeAtual < volumeMax) {
            volumeAtual++;
        }
    }

    public static void DiminuirVolume(int volumeMin) {
        if (volumeAtual > volumeMin) {
            volumeAtual--;
        }
    }

    public static void AumentarCanal(int canalMax) {
        if (canalAtual < canalMax) {
            canalAtual++;
        }
    }

    public static void DiminuirCanal(int canalMin) {
        if (canalAtual > canalMin) {
            canalAtual--;
        }
    }

    public static void alterarStatus(boolean status) {
        if (status == true) {
            status = false;
        } else {
            status = true;
        }
    }

}
