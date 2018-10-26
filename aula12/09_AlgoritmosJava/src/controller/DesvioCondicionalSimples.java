package controller;
import util.teclado;

public class DesvioCondicionalSimples {
	public  static void main(String[] args) {
	
		int a, b, x;
		a = teclado.lerInt("Informe o primeiro número: ");
		b = teclado.lerInt("Informe o segundo número: ");
		x = a + b;
		if (x > 10) {
			System.out.println("O valor da soma de " + a + " com " + b + " é " + x);
		}
		
  }
	
}