package TrabalhoExercicio2_2;

;

public class Vetores {


	public String[] vetFloat(String vet[]) {
		for (int i = 0; i < vet.length; i++) {
			float vetFloat = Float.parseFloat(vet[i]);
			vetFloat =  (float) (vetFloat + 0.5);
			String VetString = Float.toString(vetFloat);
			vet[i] = VetString;
		}
		return vet;
	}
	

	public void exibeConteudo(String vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}


/*
Crie uma classe que recebe um vetor de inteiros e devolva à classe
principal apenas os que são pares
*/

/* integer.toString(variável);*/