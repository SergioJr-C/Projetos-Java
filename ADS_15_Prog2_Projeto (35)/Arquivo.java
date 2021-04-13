package TrabalhoExercicio4_6_Polimorfismo_EX_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
	protected String nome;
	protected String email;
	
	private BufferedWriter bw;
	private BufferedReader br;
	
	
	public void gravar() {
	
	}
		
	public void gravar(String nome, String email) {
		try {
			bw = new BufferedWriter(new FileWriter(nome.concat(".txt")));
			bw.write("Nome: "+nome+ "\n");
			bw.write("E-mail: " +email);
			bw.close();
			System.out.println("O nome: '" +nome+ "' \ne o E-mail '" +email+ "' foram gravados no arquivo.");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo para gravação.");
			e.printStackTrace();
		}
	}
	
	public void gravar(String nome) {
		try {
			bw = new BufferedWriter(new FileWriter(nome.concat(".txt")));
			bw.write("Nome: "+nome);
			bw.close();
			System.out.println("O nome: '" +nome+ "' foi gravado no arquivo.");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo para gravação.");
			e.printStackTrace();
		}
	}
	
	public void ler(String nome) {
		try {
			br = new BufferedReader(new FileReader(nome.concat(".txt")));
			String linha = null;
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Erro ao abrir arquivo para leitura.");
			e.printStackTrace();
		}
	}
	
}


//Crie uma classe para armazenar os atributos nome e
//email do usuário em um arquivo texto, em que o nome do
//arquivo é o mesmo nome do usuário que foi digitado. Essa
//classe deverá permitir a sobrecarga de métodos, em que o
//usuário poderá gravar o nome e o email no arquivo, ou
//somente o nome.
