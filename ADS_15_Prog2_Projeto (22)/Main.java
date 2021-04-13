package TrabalhoExercicio2_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        System.out.print("Nome do arquivo: ");
        String nome = e.nextLine();
        
        System.out.print("Extensão do arquivo: ");
        String extensao = e.nextLine();
        
        Arquivo saida = new Arquivo(nome, extensao);

        String diretorio = "";
        System.out.println("Informar Diretório de gravação/abertura do arquivo? (s/n)");
        String r = e.nextLine().toLowerCase();
        if(r.equals("s")) {
        	System.out.print("Diretório: ");
        	diretorio = e.nextLine();
        	saida.setDiretorio(diretorio);
        }
        
        // Pra saber onde será gravado/aberto o arquivo...
        System.out.println(saida.getCaminhoCompleto());
        
        
        System.out.println("Ler Conteúdo do Arquivo ou Gravar Conteúdo no Arquivo? (ler/gravar)");
        r = e.nextLine().toLowerCase();
        if(r.equals("ler")) {
        	System.out.println("Conteúdo do Arquivo: ");
        	System.out.println(saida.ler());        	
        }else {
        	if(r.equals("gravar")) {
        		System.out.print("Conteúdo a ser Gravado no Arquivo: ");
        		String conteudo = e.nextLine();
        		saida.gravar(conteudo);
        	}else {
        		System.out.println("Resposta Inválida..");
        	}
        }
        
     
    }
}
