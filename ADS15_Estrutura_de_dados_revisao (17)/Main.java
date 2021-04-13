package REV_16_Fila_EX1;

public class Main {
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enfileirar(new Paciente("Gustavo", "18/09/1987", "000000-0"));
		fila.enfileirar(new Paciente("José", "18/09/1987", "000000-0"));
		fila.enfileirar(new Paciente("Elaine", "18/09/1987", "000000-0"));
		fila.enfileirar(new Paciente("Lilica", "18/09/1987", "000000-0"));
		
		System.out.println("Lista de Pacientes, atendimento por ordem de chegada: ");
		
		fila.listar();
		
		int tam = fila.getTamanho();
		
		for (int i = 1; i <= tam; i++) {
			Paciente inicio = fila.desenfileirar();
			System.out.println(i+ "° Paciente a ser atendido \" "  + inicio);
		}
		

	}
}
//Implementar um programa que simule uma fila de espera de uma clínica médica para os pacientes 
//serem atendidos em ordem de chegada.