package code.dio;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int Dia, Mes;
		System.out.println("<< -- BEM VINDO AO PAGANDO EM DIA! -- >>");
		System.out.printf("Informe a dia de vencimento do seu boleto: ");
		Scanner scan = new Scanner(System.in);
		Dia = scan.nextInt();
		System.out.printf("Informe o mês de vencimento do seu boleto: ");
		Mes = scan.nextInt();
		Calendar diaAtual = Calendar.getInstance();
		diaAtual.getTime();
		
		
	}
}
