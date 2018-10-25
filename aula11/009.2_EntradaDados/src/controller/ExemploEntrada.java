package controller;

import util.teclado;

public class ExemploEntrada {

	public static void main(String[] args) 
	{
	//leitura de texto
	String nome;
	
	nome = teclado.lerTexto("digite seu nome: ");
	
	//leitura de inteiro
	int idade;
	idade = teclado.lerInt("digite sua idade: ");
	
	//leitura de Ponto Flutuante
	
	double salario;
	salario = teclado.lerDouble("digite seu salario: ");
	
	System.out.println("Nome informado: " + nome);
	System.out.println("Idade informada: " + idade);
	System.out.println("Salário informado: " + salario);
	}

}
