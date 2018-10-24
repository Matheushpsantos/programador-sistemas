package controller;
import util.teclado;

public class Operadores 
{

	public static void main(String[] args) 
	{
		String nome;
		int nota1; 
		int nota2;
		int nota3;
		int nota4;

		
		nome = teclado.lerTexto("Qual é o seu nome?" );
		nota1 = teclado.lerInt("Qual é a sua primeira nota? ");
		nota2 = teclado.lerInt("Qual é a sua segunda nota? ");
		nota3 = teclado.lerInt("Qual é a sua terceira nota? ");
		nota4 = teclado.lerInt("Qual é a sua quarta nota? ");
		
		int media = nota1 + nota2 + nota3 + nota4;
		int mediaReal = media / 4;
		
		
	}
}
