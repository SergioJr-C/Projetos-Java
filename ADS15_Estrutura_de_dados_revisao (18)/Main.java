package REV_17_Fila_EX2;



public class Main {
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enfileirar(new Paciente("Gustavo", "18/09/1987", "000000-0"));
		fila.enfileirar(new Paciente("Jos�", "18/09/1987", "000000-0"));
		fila.enfileirar(new Paciente("Elaine", "18/09/1987", "000000-0"));
		fila.enfileirar(new Paciente("Lilica", "18/09/1987", "000000-0"));
		
		System.out.println("Lista de Pacientes, atendimento por ordem de chegada: ");
		
		fila.listar();
		
		fila.verificarPos("Gustavo");
		fila.verificarPos("Jos�");
		fila.verificarPos("Elaine");
		fila.verificarPos("Lilica");
		
		//int tam = fila.getTamanho();


		
	}
}
//Melhorar o programa desenvolvido na quest�o 1 para permitir verificar a posi��o de um paciente na fila
//apartir de seu nome.