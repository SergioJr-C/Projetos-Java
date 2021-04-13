package TrabalhoExercicio_1;

public class Disciplina {
	private String nome;
	private String nomeProf;
	private String cargaH;
	
	public Disciplina() {}	
	
	public Disciplina(String nome, String nomeProf, String cargaH) {
		this.nome = nome;
		this.nomeProf = nomeProf;
		this.cargaH = cargaH;
				
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeProf() {
		return nomeProf;
	}
	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}
	public String getCargaH() {
		return cargaH;
	}
	public void setCargaH(String cargaH) {
		this.cargaH = cargaH;
	}
	
	public String toString() {
		return "Nome: " + nome + 
				 "\nCarga Horária: " + cargaH +
				 "\nNome do Professor: " + nomeProf;
	}
}
