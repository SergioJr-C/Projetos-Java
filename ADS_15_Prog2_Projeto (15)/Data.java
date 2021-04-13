package TrabalhoExercicio_3_Resolvido_pelo_Professor;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	
	public Data(){}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	/* No lugar desse método inicializaData, poderíamos apenas ter utilizado o construtor cheio! Eles fazem a mesma coisa, compreendes?
	 * Só deixei aqui o método, pois na descrição do exercício dizia para utilizá-lo!!!   */
	public void inicializaData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	/* Aqui faço uma verificação de data usando o retorno booleano, verdadeiro ou falso, conforme a data! 
	 * Repare que fiz o método ser privado, para ser usado apenas aqui dentro da classe.*/
	private boolean dataEhValida(int dia, int mes, int ano){
		if ((dia < 32 && dia >= 1) && (mes <= 12 && mes >= 1) && (ano <= 2999 && ano >= 1900)) {
            return true;
        } else {            
            return false;            
        }
	}
	
	/* Aqui, nesse método (eu sei que sempre falo para não imprimir na classe, mas no exercício pedia para imprimir....) simplesmente, imprimimos a data
	 * usando inclusive o toString que criamos normalmente. Porém, antes de imprimir, usamos o método de verificação, que analisa se os valores são válidos, para então
	 * imprimir. Se forem válidos, vai chamar o toString e imprimir corretamente a data, caso contrário, vai imprimir a mensagem de data inválida
	 */
	public void mostraData(){
		if(dataEhValida(this.dia, this.mes, this.ano)){
			System.out.println(this.toString());
		}else{
			System.out.println("Data Inválida");
		}
	}
	
	/* Esse método é a resolução do Exercício 4, que recebe uma data por parâmetro e verifica se uma acontece antes que a outra.*/
	public boolean vemAntes(Data data2) {
        if (this.ano < data2.getAno()) {
            return true;            
        } else if (this.ano > data2.getAno()) {
            return false;            
        } else if ((this.ano == data2.getAno()) && (this.mes > data2.getMes())) {
            return true;                      
        } else if ((this.ano == data2.getAno()) && (this.mes < data2.getMes())) {
            return false;            
        } else if ((this.ano == data2.getAno()) && (this.mes == data2.getMes()) && (this.dia < data2.getDia())) {
            return true;            
        } else if ((this.ano == data2.getAno()) && (this.mes == data2.getMes()) && (this.dia > data2.getDia())) {
            return false;                 
        } else {
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
	
	@Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
