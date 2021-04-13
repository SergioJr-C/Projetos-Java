package TrabalhoExercicio_3_Resolvido_pelo_Professor;

public class Main {
    public static void main(String[] args) {
    	
    	Data dataInvalida = new Data();
    	dataInvalida.inicializaData(19, 0, 1000);
    	dataInvalida.mostraData();
    	
    	Data data = new Data();
        data.inicializaData(23, 3, 2020);
        data.mostraData();
        
        Data data2 = new Data();
        data2.inicializaData(20, 3, 2020);
        data2.mostraData();
        
        // Aqui eu verifico se as data e data1 são iguais!
        if(data.vemAntes(data2)){
        	System.out.println("A primeira Data Vem antes ou são iguais!");
        }else{
        	System.out.println("A Segunda Data Vem antes!");
        }
        
        
    }
}
