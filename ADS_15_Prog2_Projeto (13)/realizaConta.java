package TrabalhoExercicio_2;

public class realizaConta {
	private int va1;
	private int va2;
	
	public realizaConta() {}
	
	public realizaConta(int va1, int va2) {
		this.va1 = va1;
		this.va2 = va2;
	}
		
	public int getVa1() {
		return va1;
	}
	public void setVa1(int va1) {
		this.va1 = va1;
	}
	public int getVa2() {
		return va2;
	}
	public void setVa2(int va2) {
		this.va2 = va2;
	}
	
	public int getSoma() {
		return ((this.getVa1()) + (this.getVa2()));
	}
	
	public int getSubtracao() {
		return ((this.getVa1()) - (this.getVa2()));
	}
	
	public int getDivisao() {
		return ((this.getVa1()) / (this.getVa2()));
	}
	
	public int getMultiplicacao() {
		return ((this.getVa1()) * (this.getVa2()));
	}	
	
	public String toString() {
		return "Soma: " + getSoma() + 
				 "\nSubtração: " + getSubtracao() +
				 "\nDivisão: " + getDivisao() +
				 "\nMultiplicação: " +getMultiplicacao();
	}
}
