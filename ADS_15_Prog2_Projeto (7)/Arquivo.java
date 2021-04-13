package Jogo_rapido_3_Gravacao_de_Dados_e_Leitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
	
		private BufferedWriter bw;
		private BufferedReader br;
		
		public void ler() {
			try {
				br = new BufferedReader(new FileReader("arquivo.txt"));
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

