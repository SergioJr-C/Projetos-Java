package Exec_2c_ex1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Arquivo {
	
	private BufferedWriter bw;
	private BufferedReader br;

	
	
	public String ler() {
		try {
			br = new BufferedReader(new FileReader("Arquivo.txt"));
			String linha = null;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			br.close();
		}catch (IOException e) {
			System.out.println("Erro ao abrir arquivo para leitura.");
			e.printStackTrace();
		}
		return null;
	}

	
	public void gravar(String frase) {
		try {
			bw = new BufferedWriter(new FileWriter("arquivo.txt"));
			bw.write(frase);
			bw.close();
			System.out.println("A frase: '" + frase + "' foi gravada no arquivo.");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo para gravação.");
		 e.printStackTrace();
		}
	}
	
	
	public void gravarArq(String frase) {
		try {
			bw = new BufferedWriter(new FileWriter(frase.concat(".txt")));
			bw.write("Nome do Arquivo: "+frase);
			bw.close();
			System.out.println("O nome do Arquivo: '" +frase+ "' foi gravado no arquivo.");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo para gravação.");
			e.printStackTrace();
		}
	}


	
}
	
	
