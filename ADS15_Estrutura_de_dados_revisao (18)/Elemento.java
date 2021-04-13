
package REV_17_Fila_EX2;

public class Elemento{
	
	private Paciente paciente;
	
	private Elemento proximo;
	
	public Elemento(Paciente pessoa) {
		this.paciente = pessoa;
	}
	

	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}	
	
}