package controller;

public class ChamadaMetodos {
	
//Isso que estivemos fazendo s�o m�todos
//M�todos s�o a��es da classe no programa
	public static void main(String [] args) {
		System.out.println("Iniciando Programa");
		primeiro();
		System.out.println("Continuando Programa");
		terceiro();
		System.out.println("Terminando programa");
	}
	public static void primeiro () {
		System.out.println("Iniciando m�todo 1");
		segundo();
		System.out.println("terminando metodo 1");
	}
	public static void segundo() {
		System.out.println("Iniciando m�todo 2 ");
		System.out.println("Terminando m�todo 2");
	}
	public static void terceiro () {
		System.out.println("iniciando m�todo 3");
		System.out.println("Terminando m�todo 3");
	}
}
