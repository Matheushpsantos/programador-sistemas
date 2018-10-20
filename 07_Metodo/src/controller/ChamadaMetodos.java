package controller;

public class ChamadaMetodos {
	
//Isso que estivemos fazendo são métodos
//Métodos são ações da classe no programa
	public static void main(String [] args) {
		System.out.println("Iniciando Programa");
		primeiro();
		System.out.println("Continuando Programa");
		terceiro();
		System.out.println("Terminando programa");
	}
	public static void primeiro () {
		System.out.println("Iniciando método 1");
		segundo();
		System.out.println("terminando metodo 1");
	}
	public static void segundo() {
		System.out.println("Iniciando método 2 ");
		System.out.println("Terminando método 2");
	}
	public static void terceiro () {
		System.out.println("iniciando método 3");
		System.out.println("Terminando método 3");
	}
}
