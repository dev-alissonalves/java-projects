package code.dio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UtilizandoLocalDate {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate ontem = hoje.minusDays(1);
		System.out.println(ontem);
		System.out.println(hoje);
		
		
		LocalTime agora = LocalTime.now();
		LocalTime maisUmaHora = agora.plusHours(1);
		System.out.println(agora);
		System.out.println(maisUmaHora);
		
		LocalDateTime agora2 = LocalDateTime.now();
		System.out.println(agora2);
		LocalDateTime futuro = agora2.plusDays(1).plusHours(3).plusSeconds(15);
		System.out.println(futuro);
	}
}
