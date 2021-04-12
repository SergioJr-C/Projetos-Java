package Exemplo_ListaEncad_ReferObjetos;

public class Main {
public static void main(String[] args) {
	
	int a = 3;
	
	int b = a;
	
	b = 5;
	
	System.out.println("A: " +a);
	System.out.println("B: " +b);
	
	Elemento e = new Elemento(2);
	
	/*Quando um objeto iguala outro objeto significa que � uma refer�ncia*/
	Elemento f = e;
	
	f.setInfo(4);
	
	System.out.println("\nElemento E: " + e);
	
	System.out.println("Elemento F: " + f);
	
	Elemento elemento = new Elemento(8);
	
	Elemento elemento2 = new Elemento(10);
	
	
	elemento.setProximo(elemento2);
	

	System.out.println("\nElemento 1: " +elemento);
	System.out.println("Elemento 2: " +elemento2);
	
	/*Cria-se uma refer�ncia chamado in�cio para o elemento*/
	Elemento inicio = elemento;
	
	/*O in�cio est� referenciando o elemento2 */
	inicio = elemento.getProximo();
	
	System.out.println("\nIn�cio: " + inicio);
	}
}
