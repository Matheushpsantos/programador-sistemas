package controller;

import java.util.Scanner;

public class ExemploScanner2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String nome;

		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Seu nome é: " + nome.toUpperCase());
	
		Scanner sc2 = new Scanner(System.in);

		double salario;

		System.out.println("Digite o Salario que deseja: ");
		salario = sc2.nextDouble();

		System.out.println("Seu novo Salário : " + salario);
		
		sc.close();
		sc2.close();
	}
}
