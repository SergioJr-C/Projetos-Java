package TrabalhoExercicio_3;

public class Main {
 public static void main(String[] args) {
	 
	 Data dataInvalida = new Data();
	 dataInvalida.inicializaData(19, 0, 1000);
	 dataInvalida.mostraData();
	 
	 Data dataValida = new Data();
	 dataValida.inicializaData(23, 3, 2020);
	 dataValida.mostraData();
	 
	 Data dataValida2 = new Data();
	 dataValida2.inicializaData(24, 2, 1999);
	 dataValida2.mostraData();
	 
	 Data dataValida3 = new Data();
	 dataValida3.inicializaData(13, 10, 2020);
	 dataValida3.mostraData();
 }
}
