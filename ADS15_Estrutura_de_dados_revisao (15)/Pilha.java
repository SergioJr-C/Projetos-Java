package REV_14_Pilha_EX6;


public class Pilha {

	
		private Elemento topo;
		
		private int tamanho;
		
		public Pilha() {
			this.tamanho = 0;
		}
		
		
		public int getTamanho() {
			return this.tamanho;
		}
		
		public char empilhar(char caractere) {
			if(this.topo == null) {
				this.topo = new Elemento(caractere);
			}else {
				Elemento elemento = this.topo;
				this.topo = new Elemento(caractere);
				this.topo.setProximo(elemento);
			}
			this.tamanho++;
			return caractere;
		}
		
		public void listar() {
			Elemento elemento = this.topo;
			System.out.println(elemento);
			while(elemento.getProximo() != null) {
				elemento = elemento.getProximo();
				System.out.println(elemento);
			}
		}
		
	
	
		public char desempilhar() {
			if(this.topo == null) {
				return  (Character) null;
				
			}else {
				Elemento elemento = this.topo;
				this.topo = elemento.getProximo();
				this.tamanho--;
				return elemento.getCaractere();
			}
		}
		
		public boolean vazia() {
			if(this.topo != null) {
				System.out.println("Pilha contém valores");
				return true;
			}else {
				System.out.println("Pilha está vazia.");
				return false;
			}
		}
		
		public void tamanho() {
			System.out.println("A quantidade da pilha é "+ this.tamanho);
		}
		

		
		
}
