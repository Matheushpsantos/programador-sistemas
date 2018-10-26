package controller;
import util.teclado;
public class DesvioCondicionalEncadeado {
	public static void main (String[] args) {
		double sal, salNovo;
		sal = teclado.lerDouble("digite o salario: ");
		if (sal < 500) {
			salNovo = sal * 1.15;
		} else {
			if (sal <= 1000) {
				salNovo = sal * 1.10;
			} else {
				salNovo = sal * 1.05;
			}
		}
		System.out.println("O salario com reajuste é: " + salNovo);
	}
}
