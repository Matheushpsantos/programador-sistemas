package controller;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploFormatData {

	public static void main(String[] args) {
		
		Date data =  new Date();
		System.out.println("Data" + data);
		
		Date dataInserida = new Date(9,11,2018);
		System.out.print("Data inserida");
		
		Calendar data2 = new GregorianCalendar();
		System.out.print("Data" + data2);
		
		data2.set(2011,  3, 19);
		
		System.out.println("Mês: " data2.get(Calendar.MONTH));
		System.out.println("Dia da semana: "+ data2.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da Semana: "+ data2.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do mês: "+ data2.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia do ano: "+ data2.get(Calendar.DAY_OF_YEAR));
		
	}

}
