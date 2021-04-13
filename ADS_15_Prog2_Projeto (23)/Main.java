package TrabalhoExercicio2_5;

import java.util.Scanner;
import TrabalhoExercicio2_5.Usuario;

public class Main {
	public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
		Usuario usuario = new Usuario();
		Usuario senha = new Usuario();
        
        System.out.print("Nome do arquivo: ");
        String nome = e.nextLine();
        
        System.out.print("Extens�o do arquivo: ");
        String extensao = e.nextLine();
        
        Arquivo saida = new Arquivo(nome, extensao);

        String diretorio = "";
        System.out.println("Informar Diret�rio de grava��o/abertura do arquivo? (s/n)");
        String r = e.nextLine().toLowerCase();
        if(r.equals("s")) {
        	System.out.print("Diret�rio: ");
        	diretorio = e.nextLine();
        	saida.setDiretorio(diretorio);
        }
        
        // Pra saber onde ser� gravado/aberto o arquivo...
        System.out.println(saida.getCaminhoCompleto());
        
        
        System.out.println("Ler Conte�do do Arquivo ou Gravar Conte�do no Arquivo? (ler/gravar)");
        r = e.nextLine().toLowerCase();
        if(r.equals("ler")) {
        	System.out.println("Conte�do do Arquivo: ");
        	System.out.println(saida.ler());        	
        }else {
        	if(r.equals("gravar")) {
        		System.out.print("Usu�rio: ");
        		usuario.setUsername(e.nextLine());
        		saida.gravar(usuario.getUsername());
        		System.out.print("Senha: ");
        		 senha.setSenha(e.nextLine());
        		saida.gravar(senha.getSenha());
        	}else {
        		System.out.println("Resposta Inv�lida..");
        	}
        }
        

		
    	System.out.println("\nInsira os dados novamente..");
		System.out.print("Nome: ");
		usuario.setUsername(e.nextLine());
		
		System.out.print("Senha: ");
		senha.setSenha(e.nextLine());
		
		if (usuario.getUsername().equals(usuario.getUsername()) && (senha.getSenha().equals(senha.getSenha()))) {
			System.out.println("\nDados Corretos!");
		} else {
			System.err.println("\nDados Incorretos!");
		}	
	
    }
}


