package Exec_2a_2;

import java.io.IOException;

public class Disciplina {
	private String nomeDisc;
	private String cargaH;
	private String nomeProf;
	
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nomeDisc, String cargaH, String nomeProf) {
		this.nomeDisc = nomeDisc;
		this.cargaH = cargaH;
		this.nomeProf = nomeProf;
	}

	public String getNomeDisc() {
		return nomeDisc;
	}

	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}

	public String getCargaH() {
		return cargaH;
	}

	public void setCargaH(String cargaH) {
		this.cargaH = cargaH;
	}

	public String getNomeProf() {
		return nomeProf;
	}

	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}
	
}
