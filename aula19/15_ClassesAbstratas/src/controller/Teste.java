package controller;
import  model.*;

public class Teste {

	public static void main(String[] args) {
		
		
		Professor prof = new Professor("123Jo�o","jo�ozin",12,"filosif�a",58613,
				"Jo�o Alberto");
		prof.mostrar();
		System.out.println("=====================================");
		
		Aluno alun = new Aluno("123gilberto","gill96",21,819334,"Gilberto Gilliard",
				"2002","manh�");
		alun.mostrar();
		System.out.println("====================================");
	}

}
