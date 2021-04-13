package TrabalhoExercicio_5_Resolvido_pelo_Professor;

public class Restaurante {
	
	// Definindo constantes com os valores de cada produto do restaurante, para ent�o usar nos c�lculos da conta..
	public static final double precokgRefeicao = 31.99;
	public static final double precoSobremesa = 0.0; //Sobremesa gr�tis... ;-)
	public static final double precoRefrig2L = 5.50;
	public static final double precoRefrig600ml = 3.50;
	public static final double precoRefrigLata = 2.50;
	public static final double precoCerveja = 9.50;
	
	
	// Criei meu restaurante com um vetor de mesas...
	private MesaDeRestaurante mesas[];
	
	// No construtor, apenas passo o n�mero de mesas que ter� no restaurante..
	public Restaurante(int numMesas){
		// Aqui eu crio o vetor de mesas
		this.mesas = new MesaDeRestaurante[numMesas];
		
		// Aqui eu instancio cada mesa do vetor, para poder utilizar...
		for(int i=0; i<this.mesas.length; i++){
			this.mesas[i] = new MesaDeRestaurante();
		}
	}
	
	// Aqui � o mpetodo de adicionar ao pedido da mesa, onde informo o numero da mesa, e o item que ele quer inserir
	public void adicionaAoPedido(int mesa, int item){
		this.mesas[mesa].adicionaAoPedido(item);
	}
	
	// Aqui � o mpetodo de adicionar refei��o ao pedido da mesa, onde informo o numero da mesa, e a quantidade de comida..
	public void adicionaKgRefeicaoAoPedido(int mesa, double quantidade){
		this.mesas[mesa].adicionaKgRefeicaoAoPedido(quantidade);
	}
		
	// Aqui mostro o estado atual da mesa
	public String verConsumo(int mesa){
		return this.mesas[mesa].toString();
	}
	
	// Aqui fecho a conta, e encerro os pedidos da mesa.
	public double fecharConta(int mesa){
		double total = this.mesas[mesa].calculaTotal();
		this.mesas[mesa].zeraPedidos();
		return total;
	}
   
}
