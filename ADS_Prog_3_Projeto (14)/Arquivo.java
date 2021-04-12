package Exec_2e_ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Arquivo {
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo;
	
	public Arquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	

	public void gravar(String nome, String email, String telefone) {
		try {
			bw = new BufferedWriter(new FileWriter(this.arquivo + ".txt", true));
			bw.write("Nome: "+nome+ "\n");
			bw.write("E-mail: " +email+"\n");
			bw.write("Telefone: " +telefone +"\n");
			bw.close();
			JOptionPane.showMessageDialog( null, "O nome: '" +nome+ "', \no e-mail "+email+" \ne o telefone '" +telefone+ "' foram gravados no arquivo.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar arquivo para gravação.");
			e.printStackTrace();
		}
	}
	
	public void gravar(String texto) {
		try {
			bw = new BufferedWriter(new FileWriter(this.arquivo + ".txt", true));
			bw.write(texto);
			bw.write("\n");
			bw.close();
		}catch (Exception e) {
			System.out.println("Erro na abertura de arquivo para gravação.");		
			}
	}
	
	
	public LinkedList<Pessoa> ler(){
		LinkedList<Pessoa> lista = new LinkedList<Pessoa>();
		String nome = "";
		String email = "";
		String telefone = "";
	try {
		br = new BufferedReader(new FileReader(this.arquivo + ".txt"));
		while((nome = br.readLine()) != null) {
			email = br.readLine();
			telefone= br.readLine();
			Pessoa p = new Pessoa(nome, email, telefone);
			lista.add(p);
		}
		br.close();
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Erro ao criar arquivo para gravação.");
	}
	return lista;
	}
}

