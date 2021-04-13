package ListaExercicios_2_Vetores;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2017310432
 */
public class exerciciolista2_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vpar = new int[5];
        int[] vimpar = new int[5];
        int p = 0;
        int imp = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite: Vetor Posição ["+i+"]");
            int num = entrada.nextInt();
            if(i < 5){
               for (int j = 0; j < 5; j++) {
                if(num %2 == 0){
                    vpar[p] = num;
                    p++;
                }else{
                    System.out.println("NÃo é possível armazenar mais que 5!");
                }
                for (int k = 0; k < 5; k++) {
                   if(num != 0){
                      vimpar[imp] = num;
                      imp++;  
                   }
                
            }
           
                
                    for (int l = 0; l < 5; l++) {
                 System.out.println(+vpar[l]);
                    }
                    
                    for (int l = 0; l < 5; l++) {
                        System.out.println(+vimpar[l]);
                    }
                   
                }
                
            }
        }
    }
}

