package code.dio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDatas {

	public static void main(String[] args) throws java.lang.Exception {
		//Construtor padrão
		Date dataAtual = new Date(); 
		System.out.println(dataAtual);
		
		System.out.println("");
		
		/*CURRENT TIME MILLIS REPRESENTA A DIFERENÇA DO HORÁRIO ATUAL EM 
		RELAÇÃO A 1º DE JANEIRO DE 1970*/
		
		Long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		
		Date dataAtual2 = new Date(currentTimeMillis);
		System.out.println(dataAtual2);

		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	     Date dataNascimento = sdf.parse("1994-04-28 17:39:50.000");
	     System.out.println(dataNascimento.getTime());
	     
	     Date atual = sdf.parse("2010-05-15 17:39:50.000");
	     System.out.println(atual.getTime());
	     
	     
	     boolean isAfter = dataNascimento.after(atual);
	     System.out.println(isAfter);
	}
}
