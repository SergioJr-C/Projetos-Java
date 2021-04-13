package Exec_2c_ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Arquivo {
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo;
	
	public Arquivo(String arquivo) {
		this.arquivo = arquivo;
	}


	public void gravar() {
		
	}
	

	
	public void gravar(String nome, String email, String telefone, String ocupacao) {
		try {
			bw = new BufferedWriter(new FileWriter(nome.concat(".txt")));
			bw.write("Nome: "+nome+ "\n");
			bw.write("E-mail: " +email+"\n");
			bw.write("Telefone: " +telefone+"\n");
			bw.write("Ocupação: " +ocupacao);
			bw.close();
			JOptionPane.showMessageDialog( null, "O nome: '" +nome+ "', \no e-mail: "+email+", \no telefone: '" +telefone+ "' "
					+ "\ne Ocupação: '" +ocupacao+ "'  foram gravados no arquivo.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar arquivo para gravação.");
			e.printStackTrace();
		}
	}
	
	
	public void gravar(String nome) {
		try {
			bw = new BufferedWriter(new FileWriter(nome.concat(".txt")));
			bw.write("Nome: "+nome);
			bw.close();
			JOptionPane.showMessageDialog(null, "O nome: '" +nome+ "' foi gravado no arquivo.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Erro ao criar arquivo para gravação.");
			e.printStackTrace();
		}
	}
	
	public String ler(){
		String conteudo = "";
		String texto = "";
		try{
			br = new BufferedReader(new FileReader(this.arquivo + ".txt"));
			while((conteudo = br.readLine()) != null){
				texto = texto + conteudo + "\n";
			}
			br.close();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Arquivo Carregado com Sucesso!");
		}
		return texto;
	}



}

