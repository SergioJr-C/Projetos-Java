package R_19_Contru_e_Destru_Destrutor_EX7;
public class Destrutor {
		public static void main (String args[]) {
				Carro carro = new Carro ("Fusca");
				carro.exibeNome();
				carro = null;
				System.gc();// comando para executar o Garbage Collector
				
				//Após a execução da linha 6, o objeto carro vira lixo e estará disponível para ser
				//varrido pelo GC quando ele decidir entrar em ação.
				//Entretanto na linha 7 é solicitado um "por favor" ao GC.
		}
	}

//Uma das Vantagens de java é que, ao reservar um espaço
//da memória para um programa, não é necessário explicitar a
//liberação dele quando não utilizá-lo mais.

//*Sempre que for realizada a referência a um objeto, a JVM(Java Virtual Machine)
//registra esse evento em um contador. Com isso é possível saber quantas referências estão apontando
//para aquele pedaço de memória.
//
//Em um momento oportuno a JVM limpará este espaço de memória, dando lugar para novos objetos o utilizarem.

//Logo, em Java não destrutor. O que existe é um recurso chamado Garbage Collector(Coletor de lixo, ou lixeiro).

//ele tem como responsabilidade de alocar memória, anotar quantas referências existem para cada objeto, e limpar
//os objetos que não te referências.

//O Garbage Collector é nativo do JVM, importante: a especificação da JVM não obriga o Garbage Collector
//a rodar nos momentos em que se deseja. Isso significa que não é possível obrigá-lo a executar, mas pode pedir:
//"por favor, seu lixeiro, se possível, execute"