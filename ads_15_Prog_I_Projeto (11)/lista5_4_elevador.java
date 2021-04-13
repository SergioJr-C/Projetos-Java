/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios_5_Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 2017310432
 */
public class lista5_4_elevador {

    static int cargapessoasAtual = 0;
    static int andarAtual = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int capacidadeMax = 5;
        int capacidadeMin = 0;
        int ultimoAndar = 5;
        int terreo = 0;

        System.out.println("Capacidade do Elevador é de 5 pessoas");
        System.out.println("");
        System.out.print(" Elevador : Térreo - 1 - 2 - 3 - 4 - 5");
        System.out.println("");
        System.out.println(" ");
        System.out.println("Ac = acrescentar pessoas, elev = subir/descer elevador: ");
        System.out.println(" ");
        System.out.println("Para digitar o andar = andar, qtd = quantidade de pessoas: ");
        String eleva = entrada.readLine();
        if (eleva.equals("ac")) {
            String qtdPessoas = "";

            while (!qtdPessoas.equals("!")) {
                System.out.println("+ Entrar no Pessoas");
                System.out.println("- Sair do Elevador");
                System.out.println("");
                System.out.println("Entrar/Sair Pessoas: ");
                qtdPessoas = entrada.readLine();

                switch (qtdPessoas) {
                    case "+":
                        Entra(capacidadeMax);
                        System.out.println("Quantidade Pessoas no Elevador: " + cargapessoasAtual);
                        break;
                    case "-":
                        Sai(capacidadeMin);
                        System.out.println("Quantidade Pessoas no Elevador: " + cargapessoasAtual);
                        break;
                    default:
                        System.out.println("Opção Inválida");
                }
            }
        } else if (eleva.equals("elev")) {
            String Andar = "";

            while (!Andar.equals("!")) {
                System.out.println("+ Subir");
                System.out.println("- Descer");
                Andar = entrada.readLine();

                switch (Andar) {
                    case "+":
                        Sobe(ultimoAndar);
                        System.out.println("Andar Atual: " + andarAtual);
                        break;
                    case "-":
                        Desce(terreo);
                        System.out.println("Andar Atual: " + andarAtual);
                        break;
                    default:
                        System.out.println("Opção Inválida");

                }

            }
        }

    }

    public static void Entra(int capacidadeMax) {
        if (cargapessoasAtual < capacidadeMax) {
            cargapessoasAtual++;
        } else if (cargapessoasAtual == 5) {
            System.out.println("Limite Máximo Alcançado");
        }
    }

    public static void Sai(int capacidadeMin) {
        if (cargapessoasAtual > capacidadeMin) {
            cargapessoasAtual--;
        } else if (cargapessoasAtual == 0) {
            System.out.println("Limite Mínimo Alcançado");
        }
    }

    public static void Sobe(int ultimoAndar) {
        if (andarAtual < ultimoAndar) {
            andarAtual++;
        } else if (andarAtual == 5) {
            System.out.println("Limite Máximo Alcançado");
        }
    }

    public static void Desce(int terreo) {
        if (andarAtual > terreo) {
            andarAtual--;
        } else if (andarAtual == 0) {
            System.out.println("Limite Mínimo Alcançado");
        }
    }
}

// System.out.print(" Escolha o Andar: 1 - 2 - 3 - 4 - 5");

//if (eleva.equals("andar")) {
//            System.out.println("Escolha o Andar: 1 - 2 - 3 - 4 - 5");
//            String digitarAndar = entrada.readLine();
//
//            int count = 0;
//            for (int i = 0; i < 5; i++) {
//                if (digitarAndar.equals(i)) {
//                   count = i++; 
//                }
//                
//            }
//            System.out.println(count);
//        } else if (eleva.equals("qtd")) {
//            System.out.println("Digite a quantidade de pessoas: ");
//            String digitarQtdPessoas = entrada.readLine();
//
//            for (int i = 0; i < 5; i++) {
//                if (digitarQtdPessoas.equals(i)) {
//                    System.out.println("Quantidade de pessoas: " + i);
//                }
//            }
//        }
