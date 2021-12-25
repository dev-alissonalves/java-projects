package code.dio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDatas {

	public static void main(String[] args) throws java.lang.Exception {
		// Construtor padrão - Forma 1 de obter a data e hora atual
		Date dataAtual = new Date();
		System.out.println(dataAtual);
		System.out.println("");
		
		/*CURRENT TIME MILLIS REPRESENTA A DIFERENÇA DO HORÁRIO ATUAL EM RELAÇÃO A 1º
		  DE JANEIRO DE 1970 */
		//Forma 2 de obter a data e hora atual
		Long currentTimeMillis = System.currentTimeMillis();
		Date dataAtual2 = new Date(currentTimeMillis);
		System.out.println(dataAtual2);

		//Transformando a data de nascimento em um padrão de milisegundos
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date dataNascimento = sdf.parse("1994-04-28 17:39:50.000");
		System.out.println("<<-DATA DE NASCIMENTO TRANSFORMADO EM MILISEGUNDOS->>");
		System.out.println(dataNascimento.getTime());
		Date dataComparativo = sdf.parse("2010-05-15 17:39:50.000");
		System.out.println(dataComparativo.getTime());

		boolean isAfter = dataNascimento.after(dataComparativo);
		System.out.println(isAfter);
		
		boolean isBefore = dataNascimento.before(dataComparativo);
		System.out.println(isBefore);
	}
}
