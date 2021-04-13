package TrabalhoExercicio_5_Resolvido_pelo_Professor;

public class Main {

	public static void main(String[] args) {
		// Aqui vou criar meu Restaurante, contendo 5 mesas...
		Restaurante restaurante = new Restaurante(5);
		
		restaurante.adicionaAoPedido(0, 2); // Adicionando refri600ml na mesa 0
		restaurante.adicionaAoPedido(0, 4); // Adicionando cerveja na mesa 0
		restaurante.adicionaAoPedido(0, 4); // Adicionando cerveja na mesa 0
		restaurante.adicionaKgRefeicaoAoPedido(0, 0.350); // Adicionando comida na mesa 0
		
		System.out.println("Consumo Atual da Mesa 0:");
		System.out.println(restaurante.verConsumo(0));
		
		System.out.println("Velor da Conta da Mesa 0: R$ " + restaurante.fecharConta(0));

	}

}
