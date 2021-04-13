package TrabalhoExercicio_4;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {}
	
	public Data(int dia,int mes,int ano) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}
	
	public void inicializaData(int dia,int mes,int ano) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}
	
	private boolean dataEvalida(int dia, int mes, int ano) {
		if((dia > 0 && dia < 32) && (mes > 0 && mes < 32) && (ano > 1800 && ano < 9999)) {
			return true;
		}else {
			return false;
		}
	}

	public void mostraData() {
		if(dataEvalida(this.dia, this.mes, this.ano)) {
			System.out.println(this.toString());
		}else {
			System.out.println("Data é Inválida");
		}
	}
	
		
	public boolean dataAnteriores(Data dataValida2, Data dataValida3) {
		
				//ano é menor que outro
		if((this.ano < dataValida2.getAno()) && (this.ano < dataValida3.getAno())) {
				return true;
			
				//ano é maior que outro
		}else if((this.ano > dataValida2.getAno()) && (this.ano > dataValida3.getAno())) {
				return false;
			
				//ano igual e mes maior que outro
		}else if((this.ano == dataValida2.getAno()) && (this.ano == dataValida3.getAno()) &&
				 (this.mes > dataValida2.getMes()) && (this.mes > dataValida3.getMes())) {
				return true;
			
				//mes igual e mes menor que outro
		}else if ((this.ano == dataValida2.getAno()) && (this.ano == dataValida3.getAno()) &&
				 (this.mes < dataValida2.getMes()) && (this.mes < dataValida3.getMes())) {
				return false;
			
				//Ano igual, mês igual e dia menor que outro
		}else if ((this.ano == dataValida2.getAno()) && (this.ano == dataValida3.getAno()) 
				&& (this.mes == dataValida2.getMes()) && (this.mes == dataValida3.getMes())
				&& (this.dia < dataValida2.getDia()) && (this.dia < dataValida3.getDia())) {
					return true;
					
					//Ano igual, mês igual e dia maior que outro
					}else if ((this.ano == dataValida2.getAno()) && (this.ano == dataValida3.getAno()) 
							&& (this.mes == dataValida2.getMes()) && (this.mes == dataValida3.getMes())
							&& (this.dia > dataValida2.getDia()) && (this.dia > dataValida3.getDia())) {
							return false;
					}else {
							return true;
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
		return this.dia+"/"+mes+"/"+ano;
	}

		}

