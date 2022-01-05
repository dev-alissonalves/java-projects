package code.dio;

import java.text.DateFormat;
import java.util.Date;

public class UtilizandoDateFormat {
	public static void main(String[] args) {
		Date agora = new Date();
		
		/*1ª FORMA*/
		String dateToString = DateFormat.getInstance().format(agora);
		System.out.println(dateToString);
		
		/*2ª FORMA*/
		dateToString = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
		System.out.println(dateToString);
		
		/*3ª FORMA*/
		dateToString = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
		System.out.println(dateToString);
		
	}
}
