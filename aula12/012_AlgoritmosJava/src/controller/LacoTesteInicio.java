package controller;
import util.teclado;
public class LacoTesteInicio {
	public static void main (String[] args) {
		
		int r, x, i;
		i = 1;
		x = teclado.lerInt(" digite um npumero: ");
		while (i <= 5) {
			r = x * 3;
			System.out.println(r);
			i = i + 1;
		}
	}

}
