package controller;
import util.teclado;

public class BatalhaNaval {

	public static void main(String[] args) {
		// primeiro indice de linha, depois o da coluna
String arena[] [] = new String [4] [5];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
			arena [i] [j] = "Água";
		}
	}

		arena[2][2] = "Barco";
		arena[1][3] = "Submarino";
		arena[3][3] = "Porta-aviões";
		arena[0][2] = "Navio";
		
		int linha, coluna, pontos = 0, w = 1;
		
		while ( w < 4) 
			{
		
		linha = teclado.lerInt("digite a coordenada da linha: ");
		coluna = teclado.lerInt("digite a coordenada da coluna: ");
		System.out.println("Você acertou : " + arena [linha][coluna]);
		if(arena[linha][coluna] != "agua")
		{
			pontos = pontos + 1;
		}  
		w = w + 1;	
	
		System.out.println("você acertou: " + pontos + " pontos");
		System.out.println(" ");
		}
		
	}
}
