package code.dio;
import java.util.Calendar;

public class ExemploCalendar {

	public static void main(String[] args) {
		Calendar agora = Calendar.getInstance();
		System.out.println("A data de hoje é: " + agora.getTime());
		
		agora.add(Calendar.DATE, -15);
		System.out.println("A data de 15 dias atrás é: " + agora.getTime());
		
		agora.add(Calendar.MONTH, 4);
		System.out.println("Daqui a 4 meses será: " + agora.getTime());
		
		agora.add(Calendar.YEAR, 2);
		System.out.println("Daqui a 2 anos será: " + agora.getTime());
		
		System.out.println("");
		System.out.println("Manipulando formato de hora...");
		
		Calendar HoraAgora = Calendar.getInstance();
		System.out.printf("Formato 1: "+"%tc\n", HoraAgora);
		System.out.printf("Formato 2: "+"%tF\n", HoraAgora);
		System.out.printf("Formato 3: "+"%tD\n", HoraAgora);
		System.out.printf("Formato 4: "+"%tr\n", HoraAgora);
		System.out.printf("Formato 5: "+"%tT\n", HoraAgora);
	}

}
