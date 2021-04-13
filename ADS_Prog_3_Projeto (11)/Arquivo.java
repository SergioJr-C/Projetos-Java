package Exec_2d_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;

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
			System.out.println("Erro na abertura de arquivo para gravação.");
		}
	}
	
	public LinkedList<Pessoa> ler(){
		LinkedList<Pessoa> lista = new LinkedList<Pessoa>();
		String nome = "";
		String email = "";
		String sobrenome = "";
		String turma = "";
	try {
		br = new BufferedReader(new FileReader(this.arquivo + ".txt"));
		while((nome = br.readLine()) != null) {
			sobrenome = br.readLine();
			email = br.readLine();
			turma = br.readLine();
			Pessoa p = new Pessoa(nome, sobrenome, email, turma);
			lista.add(p);
		}
		br.close();
	}catch (Exception e) {
		System.out.println("Erro na abertura de arquivo para leitura.");
	}
	return lista;
	}
}

