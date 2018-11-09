package controller;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploInternacionalizacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.FRANCE);
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55009.537;
		System.out.println("Sem formata��o "+ valor);
		System.out.println("Com formata��o "+ f.format(valor));
		
		//normas: ISO 639 => Idioma ; ISO 3166 => Localidade
		Locale local = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(local);
		System.out.println("Sem formata��o "+ valor);
		System.out.println("Sem formata��o "+ nf.format (valor));
	}

}
