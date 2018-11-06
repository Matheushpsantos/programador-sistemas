package controller;
import  model.*;

public class Teste {

	public static void main(String[] args) {
		
		
		Professor prof = new Professor("123João","joãozin",12,"filosifía",58613,
				"João Alberto");
		prof.mostrar();
		System.out.println("=====================================");
		
		Aluno alun = new Aluno("123gilberto","gill96",21,819334,"Gilberto Gilliard",
				"2002","manhã");
		alun.mostrar();
		System.out.println("====================================");
	}

}
