package TrabalhoExercicio2_5_Resolvido_pelo_Professor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Arquivo arq = new Arquivo("usuario");
		Scanner e = new Scanner(System.in);
		
		int escolha = 0;
        while (escolha != 3) {
            System.out.println("1 - Gravar Nome de Usuário e Senha");
            System.out.println("2 - Fazer Login (Verificar Nome de Usuário e Senha)");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            escolha = Integer.parseInt(e.nextLine());	            
            switch (escolha) {
                case 1:
                	String vetNomeSenha[] = new String[2];
                    System.out.print("Nome de Usuário: ");
                    vetNomeSenha[0] = e.nextLine();
                    System.out.print("Senha: ");
                    vetNomeSenha[1] = e.nextLine();                    
                    arq.gravar(vetNomeSenha); // Grava no arquivo o vetor com nome e senha.
                    System.out.println("----------------------------------------------");
                    System.out.println("Usuário e Senha Cadastrado com Sucesso!");
                    System.out.println("----------------------------------------------");
                    break;
                case 2:
                	System.out.println("----------------------------------------------");
                    System.out.println("Faça seu Login:");                    
                    System.out.println("----------------------------------------------");                    
                    String vetLoginNomeSenha[] = new String[2];
                    System.out.print("Nome de Usuário: ");
                    vetLoginNomeSenha[0] = e.nextLine();
                    System.out.print("Senha: ");
                    vetLoginNomeSenha[1] = e.nextLine();
                    // Agora faz a compração com os dados gravados no arquivo
                    String vetNomeSenhaArquivo[] = arq.ler();
                    if(vetLoginNomeSenha[0].equals(vetNomeSenhaArquivo[0]) && vetLoginNomeSenha[1].equals(vetNomeSenhaArquivo[1])) {
                    	System.out.println("----------------------------------------------");
                        System.out.println("Login Efetuado com Sucesso!!");                    
                        System.out.println("----------------------------------------------");
                    }else {
                    	System.out.println("----------------------------------------------");
                        System.out.println("Usuário ou Senha Incorreto!!");                    
                        System.out.println("----------------------------------------------");
                    }
                    break;
                default:                	
                	e.close();
                	System.exit(0);
            }

        }
	}

}
