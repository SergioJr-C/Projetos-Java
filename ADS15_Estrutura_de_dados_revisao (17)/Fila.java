package REV_16_Fila_EX1;

public class Fila {
	
	private Elemento inicio;
	
	private int tamanho;
	
	public Fila() {
		this.tamanho = 0;
	}
		
	
	public int getTamanho() {
		return tamanho;
	}


	public void enfileirar(Paciente paciente) {
		if(this.inicio == null) {
			this.inicio = new Elemento(paciente);
		}else {
			Elemento elemento = this.inicio;
			while(elemento.getProximo() != null) {
				elemento = elemento.getProximo();
			}
			elemento.setProximo(new Elemento(paciente));
			
		}
		this.tamanho++;
	}
	
	public Paciente desenfileirar() {
		if(this.inicio == null) {
			return null;
		}else {
			Elemento elemento = this.inicio;
			this.inicio = elemento.getProximo();
			this.tamanho--;
			return elemento.getPaciente();
		}
	}
	
	public void listar() {
		Elemento elemento = this.inicio;
		System.out.println(elemento.getPaciente());
		while(elemento.getProximo() != null) {
			elemento  = elemento.getProximo();
			System.out.println(elemento.getPaciente());
		}
	}
}
