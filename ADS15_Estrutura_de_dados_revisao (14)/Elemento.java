package REV_13_Pilha_EX5;

public class Elemento {
		private char caractere;
		
		private Elemento proximo;
		
		public Elemento(char caractere) {
			this.caractere = caractere;
		}
		
		
		public char getCaractere() {
			return caractere;
		}


		public void setCaractere(char caractere) {
			this.caractere = caractere;
		}


		public Elemento getProximo() {
			return proximo;
		}


		public void setProximo(Elemento proximo) {
			this.proximo = proximo;
		}


		public String toString() {
			return this.caractere + "";
		}
}
