package Exemplo3a;

import java.util.LinkedList;
import java.util.Scanner;

public class TesteDAOFuncionario {
	
	public static void main(String[] args) {
		
		FuncionarioDao dao = new FuncionarioDao();
		
		// Adicionando um funcion�rio.
/*		Funcionario f = new Funcionario("Lilica", "lica@email.com", "estima��o");		
		dao.adiciona(f);
/**/		
		// Listando os funcion�rios.
/*		LinkedList<Funcionario> lista = dao.listar();
		for (Funcionario funcionario : lista) {
	          System.out.println(funcionario);
		}
/**/		
/*	
		LinkedList<Funcionario> lista = dao.procurar("maria");
		for (Funcionario funcionario : lista) {
	          System.out.println(funcionario);
		}
/**/

/*
		System.out.println("ID do funcionario a ser alterado: ");
		int id = new Scanner(System.in).nextInt();
		Funcionario f = dao.procurar(id);
		f.setNome(f.getNome()+" - alterado");
		dao.alterar(f);
/**/		
	
		LinkedList<String> lista = dao.listarNomes();
		for (String nome : lista) {
	          System.out.println(nome);
		}
	
	}
}
	
	



