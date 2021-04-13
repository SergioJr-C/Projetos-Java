package TrabalhoExercicio_4;

import TrabalhoExercicio_4.Data;

public class Main {
	 public static void main(String[] args) {
		 
		 Data dataInvalida = new Data();
		 dataInvalida.inicializaData(19, 0, 1000);
		 dataInvalida.mostraData();
		 
		 Data dataValida = new Data();
		 dataValida.inicializaData(23, 3, 1998);
		 dataValida.mostraData();
		 
		 Data dataValida2 = new Data();
		 dataValida2.inicializaData(24, 2, 1999);
		 dataValida2.mostraData();
		 
		 Data dataValida3 = new Data();
		 dataValida3.inicializaData(13, 10, 2000);
		 dataValida3.mostraData();
	 	
		 
		 if(dataValida.dataAnteriores(dataValida2, dataValida3)) {
			 System.out.println("As primeiras Datas Vem antes ou são iguais!");
		 }else {
			 System.out.println("A Última Data Vem antes!");
		 }
	 
	 }
}