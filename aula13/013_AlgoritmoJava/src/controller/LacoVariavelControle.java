package controller;
import util.teclado;
public class LacoVariavelControle {

	public static void main(String[] args) {
		int r, x, i;
		for (i=1; i<=5; i++); {
			x = teclado.lerInt("Divide um número: ");
			r = x * 3;
			System.out.println(r);
		}
	}

}
