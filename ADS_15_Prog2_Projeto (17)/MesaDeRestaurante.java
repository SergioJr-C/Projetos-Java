package TrabalhoExercicio_5;

public class MesaDeRestaurante {
	private double kg_refeicao;
	private  double sobremesa;
	private  double refrig2L;
	private  double refrig600;
	private  double refriglata;
	private  double cerveja;
	
	/*private public double kg_refeicao = 50;
	private public double sobremesa = 12;
	private public double refrig2L = 8;
	private public double refrig600 = 6;
	private public double refriglata = 3.5;
	private public double cerveja = 12;*/
	
	static int qtdPedido;
	static int numMesa;

	
	public MesaDeRestaurante() {}
	
	public MesaDeRestaurante(double kg_refeicao, double sobremesa,
			double refrig2L, double refrig600, double refriglata,
			double cerveja) {
		this.kg_refeicao = kg_refeicao;
		this.sobremesa = sobremesa;
		this.refrig2L = refrig2L;
		this.refrig600 = refrig600;
		this.refriglata = refriglata;
		this.cerveja = cerveja;
	}
	

	public int adcionaPedido(int qtdPedido) {
		qtdPedido = 1;
		numMesa = 0;
		
		numMesa = numMesa + 1;
		
		qtdPedido = qtdPedido +1;
		
		System.out.println("Mesa " +  numMesa +" Foi Adcionado "+ qtdPedido + " Pedidos.");
		return qtdPedido;
	}
	
	public int zeraPedidos(int Z) {
		return Z = adcionaPedido(0);
	}
	
	public double calculaTotal(double kg_refeicao, double sobremesa,
			double refrig2L, double refrig600, double refriglata,
			double cerveja){
		 return ((kg_refeicao = 50) + (sobremesa = 12) + (refrig2L=8)) +
		 + (refrig600 =3.5) + (refriglata = 3.5) + (cerveja=12) * qtdPedido;
	}

	public double getKg_refeicao() {
		return kg_refeicao;
	}

	public void setKg_refeicao(double kg_refeicao) {
		this.kg_refeicao = kg_refeicao;
	}

	public double getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(double sobremesa) {
		this.sobremesa = sobremesa;
	}

	public double getRefrig2L() {
		return refrig2L;
	}

	public void setRefrig2L(double refrig2l) {
		refrig2L = refrig2l;
	}

	public double getRefrig600() {
		return refrig600;
	}

	public void setRefrig600(double refrig600) {
		this.refrig600 = refrig600;
	}

	public double getRefriglata() {
		return refriglata;
	}

	public void setRefriglata(double refriglata) {
		this.refriglata = refriglata;
	}

	public double getCerveja() {
		return cerveja;
	}

	public void setCerveja(double cerveja) {
		this.cerveja = cerveja;
	}
	
	
	
}
	
	