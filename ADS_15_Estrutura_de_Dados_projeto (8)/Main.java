package Trabalho_Pratico_2;

public class Main {
	public static void main (String args[]) {
		
		Arquivo saida = new Arquivo("Bicicletas_do_Gustavo");
		
		//String id,String marca,String tipo,String valor, String estado
		ListaEncadeada lista = new ListaEncadeada();{
			lista.adicionar(new  Bicicleta("00", "caloi", "mtb", "10.00", "Disponível"));
			lista.adicionar(new  Bicicleta("01", "caloi", "mtb", "10.00", "Disponível"));
			lista.adicionar(new  Bicicleta("02", "caloi", "speed", "10.00", "Disponível"));
		
			lista.listar();
			
			//saida.gravar(lista);
			
			/*
			
			  ListaEncadeada lista = saida.ler();
			  lista.adicionar(new Bicicleta("03", "caloi", "speed", "10.00", "alugada"));
			 
			 lista.listar();
			 lista.buscar("00");
			 /*
			 //bonus
			 Bicicleta alt = lista.buscar("00");
			 alt.setEstado("Alugada");
			 alt.setValor("30.0");
			 
			 lista.listar();
			 
			 saida.gravar(lista);
			  */
		//}
		
	//}
		}}}
