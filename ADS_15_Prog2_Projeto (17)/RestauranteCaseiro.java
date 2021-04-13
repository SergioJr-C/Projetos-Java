package TrabalhoExercicio_5;
import TrabalhoExercicio_5.MesaDeRestaurante;
public class RestauranteCaseiro {
	public static void main(String args[]) {
		//Mesas
		MesaDeRestaurante m1 = new MesaDeRestaurante();
		MesaDeRestaurante m2 = new MesaDeRestaurante();
		MesaDeRestaurante m3 = new MesaDeRestaurante();
		
		//Mesa Adcionando Pedidos
		m1.adcionaPedido(1);
		m2.adcionaPedido(2);
		m3.adcionaPedido(3);
		
		//Cálculo total de Pedidos
		System.out.println("\nValor Total: "+m1.calculaTotal(1, 1, 1, 1, 1, 1));
		System.out.println("Valor Total: "+m2.calculaTotal(2, 2, 2, 2, 2, 2));
		System.out.println("Valor Total: "+m3.calculaTotal(3, 3, 3, 3, 3, 3));
		
	
	}
}
