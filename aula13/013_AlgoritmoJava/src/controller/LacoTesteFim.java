package controller;
import util.teclado;

public class LacoTesteFim {

	public static void main(String[] args) {
		int r, x, i;
		i = 1;
		do {
			x = teclado.lerInt("digite um n�mero: ");
			r = x * 3;
			System.out.println(r);
			i = i + 1;
		} while (i <= 5);
		}

	}
