package R_11_Vetores_e_Arquivos_gravarArquivo;

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
			System.out.println("A frase: '" + frase + "' foi gravada no arquivo.");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo para gravação.");
			e.printStackTrace();
		}
	}
}
