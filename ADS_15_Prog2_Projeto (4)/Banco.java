package Exemplo_5_Banco;

public class Banco {
	public static void main(String args[]) {
		// Declaração e abertura das caixas de banco.
		CaixaBanco c1 = new CaixaBanco();
		CaixaBanco c2 = new CaixaBanco();
		CaixaBanco c3 = new CaixaBanco();
		CaixaBanco c4 = new CaixaBanco();
		CaixaBanco c5 = new CaixaBanco();
		c1.abreCaixa(1);
		c2.abreCaixa(2);
		c3.abreCaixa(3);
		c4.abreCaixa(4);
		c5.abreCaixa(5);
		// Simulações de atendimento com chamada de numeros de Clientes
		//(14 clientes da fila...)
		c1.iniciaAtendimento();
		c2.iniciaAtendimento();
		c3.iniciaAtendimento();
		c4.iniciaAtendimento();
		c5.iniciaAtendimento();
		
		c1.iniciaAtendimento();
		c2.iniciaAtendimento();
		c3.iniciaAtendimento();
		
		c1.iniciaAtendimento();
		c2.iniciaAtendimento();
		
		c1.iniciaAtendimento();
		c1.iniciaAtendimento();
		c1.iniciaAtendimento();
		c1.iniciaAtendimento();
	}
}
