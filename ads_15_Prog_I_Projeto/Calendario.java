package Exemplos;

import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ano: ");
        int ano = entrada.nextInt();
        System.out.print("Dia da Semana (1 - 7): ");
        int diaSem = entrada.nextInt();
        String mes = "";
        int dias = 0;
        //laço para contar os meses  (i)
        for (int i = 1; i <= 12; i++) {
            switch(i){
                case 1: mes = "JAN";    dias = 31;  break;
                case 2: mes = "FEV";
                    if (ano % 4 == 0)
                        dias = 29;
                    else
                        dias = 28;
                    break;
                case 3: mes = "MAR";    dias = 31;  break;
                case 4: mes = "ABR";    dias = 30;  break;
                case 5: mes = "MAI";    dias = 31;  break;
                case 6: mes = "JUN";    dias = 30;  break;
                case 7: mes = "JUL";    dias = 31;  break;
                case 8: mes = "AGO";    dias = 31;  break;
                case 9: mes = "SET";    dias = 30;  break;
                case 10: mes = "OUT";    dias = 31;  break;
                case 11: mes = "NOV";    dias = 30;  break;
                case 12: mes = "DEZ";    dias = 31;  break;
            }
            System.out.println(mes);
            System.out.println("DOM SEG TER QUA QUI SEX SAB");
            int dia = 1;
            boolean fimMes = false;
            //laço para contar a quantidade de semanas (j)
            for (int j = 1; j <= 6; j++) {
                String semana = "";   
                //laço para contar os dias da semana (k)
                for (int k = 1; k <= 7; k++) {
                    if ((j == 1) && (dia == 1)){
                        if (diaSem == k){
                            semana += "  1 ";
                            dia++;
                        }
                        else{
                            semana += "    ";
                        }
                    }else{
                        if (dia <= dias){
                            if (dia < 10)
                                semana += "  " + dia + " ";
                            else
                                semana += " " + dia + " ";
                            dia++;
                        }
                        else{
                            if (k <= 7)
                                diaSem = k;
                            else
                                diaSem = 1;
                            fimMes = true;                            
                        }
                    }
                    if (fimMes)
                        break;
                }
                System.out.println(semana);
                if (fimMes)
                    break;
            }
            System.out.println("");
        }
    }
}
