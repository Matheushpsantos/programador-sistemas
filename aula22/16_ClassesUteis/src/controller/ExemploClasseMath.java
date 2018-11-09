package controller;

public class ExemploClasseMath {

	public static void main(String[] args) {
		
		// Sorteando um número entre 50 e 80
		double valSorteado = Math.random();
		int resultado = 50 + (int) (valSorteado * 30);
		System.out.println("sorteio entre 50 e 80 --->"+ resultado);
		
		// Sorteando a mega-sena
		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int) (numeroSena * 61);
			System.out.println("");
			System.out.println("Número Sorteado: "+ numeroSorteado);
			
			}
		
		// Maior entre dois números
		int maior;
		maior = Math.max(resultado, 65);
		System.out.println("");
		System.out.println("====================================");
		System.out.println("entre 65 e "+ resultado + 
							" o maior valor é "+ maior );
		System.out.println("=====================================");
		System.out.println("");
		
		//Área de um circulo de raio 5
		System.out.println("");
		System.out.println("=====================================");
		double area = Math.PI * Math.pow(5, 2);
		System.out.println("Área de um circulo de " + "raio 5 é "+ area);
		System.out.println("=====================================");
		System.out.println("");
		
		double sen, cos, tan;
		double a = 60;
		
		sen = Math.sin(Math.toRadians(a));
		cos = Math.cos(Math.toRadians(a));
		tan = Math.tan(Math.toRadians(a));
		
		System.out.println("seno: " + sen);
		System.out.println("Cosseno: " + cos);
		System.out.println("Tangente: "+ tan);
		
		//Raiz Quadrada
		double raiz = Math.sqrt(4);
		System.out.println("Raix quadrada de 4 é" + raiz);
		
		
	}

}
