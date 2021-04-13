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

//Crie um método processaConteudo(), na classe Vetor, para retornar
//o conteúdo do vetor recebido por parâmetro, com a seguinte particularidade:

//*Para cada valor contido em cada posição do vetor recebido será somado o valor de 100;

//Lembre-se: a instanciação da classe, chamada de método, passagem de parâmetro de verá ser realizada na
//classe Gerenciador.