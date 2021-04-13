
package Resolvidos_pelo_Professor_Lista5;

import java.util.Scanner;

public class Exercicio3 {
    static int canal = 200;
    static int volume = 1;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {    
        int op = 0;
        while(op != 7){
            System.out.println("1 - Consultar Canal/Volume");
            System.out.println("2 - Selecionar Canal");
            System.out.println("3 - Aumentar Volume");
            System.out.println("4 - Diminuir Volume");
            System.out.println("5 - Aumentar Canal");
            System.out.println("6 - Diminiur Canal");
            System.out.println("7 - Sair");
            System.out.print("Escolha: ");
            op = entrada.nextInt();
            switch(op){
                case 1:     consCanVol();    break;
                case 2:     selecCanal();    break;
                case 3:     aumVol();        break;
                case 4:     dimVol();        break;
                case 5:     aumCanal();      break;
                case 6:     dimCanal();      break;
                case 7:     break;
                default:    System.out.println("Opção inválida!");
            }
        }
    }
    public static void consCanVol(){
        System.out.println("Canal Selecionado: " + canal);
        System.out.println("Volume atual: " + volume);
        System.out.println("");
    }
    public static void selecCanal(){
        System.out.print("Digite um canal: ");
        int cn = entrada.nextInt();
        if ((canal >= 1) || (canal <= 200)){
            canal = cn;
            consCanVol();
        }
        else{
            System.out.println("Canal inválido!");
        }
    }
    public static void aumVol(){
        if (volume < 100){
            volume++;
            consCanVol();
        }
    }
    public static void dimVol(){
        if (volume > 0){
            volume--;
            consCanVol();
        }
    }
    public static void aumCanal(){
        if (canal == 200)
            canal = 1;        
        else
            canal++;
        consCanVol();
    }
    public static void dimCanal(){
        if (canal == 1)
            canal = 200;
        else
            canal--;
        consCanVol();
    }
}
