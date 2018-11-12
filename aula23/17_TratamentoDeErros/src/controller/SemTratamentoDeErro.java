package controller;
import util.teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) {

		double a = teclado.lerDouble("Digite o Numerador");
		double b = teclado.lerDouble("Digite o Numerador");
		
		double c = a/b;
		System.out.println("resultado da divisão de a por b" + c);
	}

}
