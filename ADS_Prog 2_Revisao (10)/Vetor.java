package R_10_Vetores_e_Arquivos_Jogo_Rapido;

public class Vetor {
	public int [] processaConteudo(int vet[]) {
		for(int i=0; i< vet.length; i++) {
			vet[i] = vet[i] + 100;
		}
		return vet;
	}
	
	public void exibeConteudo(int vet[]) {
		for(int i=0; i<vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}

//Crie um m�todo processaConteudo(), na classe Vetor, para retornar
//o conte�do do vetor recebido por par�metro, com a seguinte particularidade:

//*Para cada valor contido em cada posi��o do vetor recebido ser� somado o valor de 100;

//Lembre-se: a instancia��o da classe, chamada de m�todo, passagem de par�metro de ver� ser realizada na
//classe Gerenciador.