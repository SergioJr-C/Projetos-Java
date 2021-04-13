package R_19_Contru_e_Destru_Destrutor_EX7;
public class Destrutor {
		public static void main (String args[]) {
				Carro carro = new Carro ("Fusca");
				carro.exibeNome();
				carro = null;
				System.gc();// comando para executar o Garbage Collector
				
				//Ap�s a execu��o da linha 6, o objeto carro vira lixo e estar� dispon�vel para ser
				//varrido pelo GC quando ele decidir entrar em a��o.
				//Entretanto na linha 7 � solicitado um "por favor" ao GC.
		}
	}

//Uma das Vantagens de java � que, ao reservar um espa�o
//da mem�ria para um programa, n�o � necess�rio explicitar a
//libera��o dele quando n�o utiliz�-lo mais.

//*Sempre que for realizada a refer�ncia a um objeto, a JVM(Java Virtual Machine)
//registra esse evento em um contador. Com isso � poss�vel saber quantas refer�ncias est�o apontando
//para aquele peda�o de mem�ria.
//
//Em um momento oportuno a JVM limpar� este espa�o de mem�ria, dando lugar para novos objetos o utilizarem.

//Logo, em Java n�o destrutor. O que existe � um recurso chamado Garbage Collector(Coletor de lixo, ou lixeiro).

//ele tem como responsabilidade de alocar mem�ria, anotar quantas refer�ncias existem para cada objeto, e limpar
//os objetos que n�o te refer�ncias.

//O Garbage Collector � nativo do JVM, importante: a especifica��o da JVM n�o obriga o Garbage Collector
//a rodar nos momentos em que se deseja. Isso significa que n�o � poss�vel obrig�-lo a executar, mas pode pedir:
//"por favor, seu lixeiro, se poss�vel, execute"