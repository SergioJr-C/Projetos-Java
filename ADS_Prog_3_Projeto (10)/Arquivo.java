package Exec_2d_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Arquivo {
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo;
	
	public Arquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	public void gravar(String texto) {
		try {
			bw = new BufferedWriter(new FileWriter(this.arquivo + ".txt"));
			bw.write(texto);
			bw.close();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar arquivo para gravação.");
		}
	}
	
	public LinkedList<Pessoa> ler(){
		LinkedList<Pessoa> lista = new LinkedList<Pessoa>();
		String nome = "";
		String cpf = "";
		String email = "";
	try {
		br = new BufferedReader(new FileReader(this.arquivo +".txt"));
		while((nome = br.readLine()) != null) {
			cpf = br.readLine();
			email = br.readLine();
			Pessoa p = new Pessoa(nome, cpf, email);
			lista.add(p);
		}
		br.close();
	}catch (Exception e) {
		System.out.println("Erro na abertura de arquivo para leitura.");
	}
	return lista;
	}
}

