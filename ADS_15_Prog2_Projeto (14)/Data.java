package TrabalhoExercicio_3;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void inicializaData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	private boolean dataEValida(int dia, int mes, int ano) {
		if((dia < 32 && dia >= 1) && (mes <= 12 && mes >= 1) && (ano <= 9999 && ano >= 1900)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mostraData(){
		if((dataEValida(this.dia, this.mes, this.ano))) {
			System.out.println(this.toString());
		}else {
		System.err.println("Data Inválida");
	}
		}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
