/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_4_Forca;

import java.io.*;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Sérgio Almeida
 */
public class trabalho_forca {

    static int tentativas = 0;

    static String[] Animais = {"JACARE", "JIBOIA", "TUCANO", "GALINHA", "JABUTI", "MACACO", "LEAO", "SURICATO", "RATO", "CACHORRO"};

    static String[] Veiculos = {"ONIBUS", "CARRUAGEM", "MERCEDES", "CAMINHAO", "FIAT", "BICICLETA",
        "TREM", "NAVIO", "MOTOCICLETA", "BONDE"};

    static String[] Frutas = {"BANANA", "ABACAXI", "MORANGO", "LARANJA", "LIMAO", "ACAI",
        "ABACATE", "AMORA", "UVA", "GOIABA"};

    static String[] Objetos = {"CANETA", "PAPEL", "CUIA", "TENIS", "TECLADO", "COPO",
        "LAPIS", "MOUSE", "CAIXA", "CADEIRA"};

    static String[] Profissoes = {"CARPINTEIRO", "COZINHEIRO", "DESENHISTA", "ARTISTA", "ATLETA", "MUSICO",
        "POLICIAL", "METALURGICO", "PINTOR", "SAPATEIRO"};

    static Scanner entrada = new Scanner(System.in);
    static BufferedReader entrada2 = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int op = 0;
        System.out.println("JOGO DA FORCA");
        System.out.println("VOCÊ TEM 5 TENTATIVAS! Não as desperdice! ");
        System.out.println("");
        System.out.println("Digite 1 para escolher Animais: ");
        System.out.println("Digite 2 para escolher Veículos: ");
        System.out.println("Digite 3 para escolher Frutas: ");
        System.out.println("Digite 4 para escolher Objetos: ");
        System.out.println("Digite 5 para escolher Profissionais: ");
        System.out.println("Escolha: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                Animais();
                break;
            case 2:
                Veiculos();
                break;
            case 3:
                Frutas();
                break;
            case 4:
                Objetos();
                break;
            case 5:
                Profissionais();
                break;
            default:
                System.out.println("Opção Inválida! Por favor digite novamente.");
        }
    }

    public static void Animais() throws IOException {
 System.out.println("Escolha um número de 0 a 9: ");
        int palavra = entrada.nextInt();
        for (int i = 0; i < Animais.length; i++) {
            if (palavra == i) {
                System.out.println(Animais[i]);
                System.out.println("Tente Advinhar a Palavra:");
                String letra = entrada2.readLine();
                char animal = Animais[i].charAt(i);
                System.out.println(animal);
//                System.out.println(letra);
                System.out.println("i");
                System.out.println(Animais[i].substring(i));
                System.out.println(Animais[i].charAt(i));
            }
        }

    }

    /*
     não deu certo;
     for (int i = 0; i < Animais.length; i++) {
     String []AnimaisSplit= Animais[i].split(" ");
     if(AnimaisSplit[i] letra){
     System.out.println(AnimaisSplit[i]);  
     }
    
    
     string[] retornoSplit = texto.Split('-');
 
     int numeroElementos = retornoSplit.Length;
    
    
     for - para percorrer os caracteres
     length() - para saber o comprimento da string
     charAt() - para pegar um caracter de cada vez
     == - para testar um determinado caracter
     if - para criar a condição
     ++ - para ir incrementando o contador de vezes em que o caracter for repetido.
     return - para retornar o valor contado.
    
     Para achar palavras, procure o método “split” da classe String, 
     para quebrar a string em palavras, e o método “equals” (ou “equalsIgnoreCase” para comparar Strings.
     */
    /*
     toCharArray transforma a string em array
     O método charAt() retorna o caractere especificado a partir de uma string.
     .equals retorna o que for igual
     */
//      System.out.println("Tente advinhar a palavra: ");
//                String forca = entrada.next();
//                if (Animais[i].toCharArray().equals(entrada.next())) {
//                    System.out.println();
    public static void Veiculos() {
    }

    public static void Frutas() {
    }

    public static void Objetos() {
    }

    public static void Profissionais() {
    }
}
