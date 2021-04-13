package Jogo_rapido_2_Gravacao_de_Dados;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
	
		private BufferedWriter bw;
		
		public void gravar(String frase) {
			try {
				bw = new BufferedWriter(new FileWriter("arquivo.txt"));
				bw.write(frase);
				bw.close();
				System.out.println("A frase: '" +frase+ "' foi gravada no arquivo.");
			} catch (IOException e) {
				System.out.println("Erro ao criar arquivo para gravação.");
				e.printStackTrace();
			}
		}
	}

