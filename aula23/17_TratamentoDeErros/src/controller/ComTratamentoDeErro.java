package controller;

import util.teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {

		try {
			double a = teclado.lerDouble("Digite o Numerador ");
			double b = teclado.lerDouble("Digite o Numerador ");
		
			double c = a/b;
			System.out.println("resultado da divisão de a por b " + c);
		} catch (NumberFormatException nfe) {
			System.out.println("caracter invalido");
			
		
		} catch (ArithmeticException ae) {
			System.out.println("divisão por zero ");/*este tratamento só funciona para versões
			 										 *abaixo do java 6 
			 										 */
 
		}
	}

}
