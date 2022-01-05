package code.dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtra�ao = subtra�ao(a, b);
		int multiplicacao = multiplicacao(a, b);
		int divisao = divisao(a, b);
		
		System.out.println("Soma:" + soma);
		System.out.println("Subtra��o: "+ subtra�ao);
		System.out.println("Multiplica��o: " + multiplicacao);
		System.out.println("Divis�o: " + divisao);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtra�ao(int a, int b) {
		return a - b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}
