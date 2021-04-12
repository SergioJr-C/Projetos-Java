package Trabalho_Pratico_2_Resolvido_Pelo_Professor;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		Arquivo saida = new Arquivo("Bicicletas_do_Gustavo");
		
		
		/** Esse trecho de código era para os testes... **/
		/*
		ListaEncadeada bicicletas = new ListaEncadeada(); 
		bicicletas.adicionar(new Bicicleta("00", "Caloi", "MTB", "10.00", "Disponível"));
		bicicletas.adicionar(new Bicicleta("01", "Caloi", "MTB", "10.00", "Disponível"));
		bicicletas.adicionar(new Bicicleta("02", "Caloi", "SPEED", "10.00", "Disponível"));		  
		bicicletas.listar();		  
		saida.gravar(bicicletas);
		
		//ListaEncadeada bicicletas = saida.ler();		
		//bicicletas.adicionar(new Bicicleta("03", "Caloi", "SPEED", "10.00", "Alugada"));		
		//bicicletas.listar();		
		
		/*
		// Aqui é o bônus, onde altero o estado de uma bicicleta da lista...
		Bicicleta alt = bicicletas.buscar("00");
		alt.setEstado("Alugada");
		alt.setValor("30.0");		 
		bicicletas.listar();		
		saida.gravar(bicicletas);		 
		/**/
		
		/** Aqui é uma Main() utilizável... **/
        ListaEncadeada lista = new ListaEncadeada();

        int escolha = 0;
        while (escolha != 5) {
            System.out.print("1 - Adicionar bicicleta \n2 - Remover bicicleta  \n3 - Listar todos os elementos \n4 -  Buscar bicicleta e modificá-la \n5 - Sair \nEscolha: ");
            escolha = Integer.parseInt(e.nextLine());	            
            switch (escolha) {
                case 1:
                	lista = saida.ler(); // Carrega a lista que ja está no arquivo.
                    Bicicleta b = new Bicicleta();
                    System.out.print("ID: ");
                    b.setId(e.nextLine());
                    System.out.print("Marca: ");
                    b.setMarca(e.nextLine());
                    System.out.print("Tipo: ");
                    b.setTipo(e.nextLine());
                    System.out.print("Valor: ");
                    b.setValor(e.nextLine());
                    System.out.print("Estado: ");
                    b.setEstado(e.nextLine());
                    lista.adicionar(b);
                    saida.gravar(lista); // Grava no arquivo a lista atualizada
                    System.out.println("----------------------------------------------");
                    lista.listar();
                    System.out.println("QUANTIDADE DE ELEMENTOS: " + lista.getTamanho());
                    System.out.println("----------------------------------------------");
                    break;
                case 2:
                	lista = saida.ler();
                    System.out.print("ID da bicicleta a ser removida: ");
                    lista.remover(e.nextLine());
                    System.out.println("----------------------------------------------");
                    lista.listar();
                    System.out.println("QUANTIDADE DE ELEMENTOS: " + lista.getTamanho());
                    System.out.println("----------------------------------------------");
                    break;
                case 3:
                	lista = saida.ler();
                    lista.listar();
                    System.out.println("QUANTIDADE DE ELEMENTOS: " + lista.getTamanho());
                    System.out.println("----------------------------------------------");
                    break;
                case 4:
                	lista = saida.ler();
                    System.out.print("ID da bicicleta a ser modificada: ");
                    Bicicleta alt = lista.buscar(e.nextLine());
                    // Aqui o correto seria verificar o que deseja modificar, mas para simplificar, estou supondo
                    // que todos atributos serão modificados...
                    if(alt != null) {
                    	// Não podemos mudar o ID, mas o resto sim...
                    	System.out.print("Nova marca: ");
                        alt.setMarca(e.nextLine());
                        System.out.print("Novo tipo: ");
                        alt.setTipo(e.nextLine());                            
                        System.out.print("Novo valor: ");
                        alt.setValor(e.nextLine());                            
                        System.out.print("Novo estado: ");
                        alt.setEstado(e.nextLine());
                    
                    }
                    lista.listar();
                    System.out.println("QUANTIDADE DE ELEMENTOS: " + lista.getTamanho());
                    saida.gravar(lista);
                    System.out.println("----------------------------------------------");
                default:                	
                	e.close();
                	System.exit(0);
            }
           
        }
	}

}
