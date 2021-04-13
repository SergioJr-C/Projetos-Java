package R_29_Interfaces_EX2;

public class Tartaruga implements Anda {
		private int posx, posy; //posição da tartaruga
		@Override
		public void avancar(int deslx, int desly) {
			posx += deslx;
			posy += desly;
		}
		@Override
		public void recuar(int deslx, int desly) {
			posx -= deslx;
			posy -= desly;
		}
}
