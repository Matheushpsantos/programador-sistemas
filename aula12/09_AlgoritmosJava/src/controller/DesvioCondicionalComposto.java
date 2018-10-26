package controller;

import util.teclado;

public class DesvioCondicionalComposto {
	public static void main(String[] args) {
		
		int a, b, x;
		a = teclado.lerInt("Informe o primeiro número: ");
		b = teclado.lerInt("Informe o segundo número: ");
		x = a + b;
		if (x >= 10) {
			System.out.println("o resultado acrescido de 5 é: " + (x + 5));
		} else {
			System.out.println("o resultado subtraido de 7 é: " + (x - 7));
		}
	}
}
