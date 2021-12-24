package code.dio;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		var nome = "Alisson";
		var sobreNome = " Alves";
		final var nomeCompleto = nome+sobreNome;
		
		System.out.println(nomeCompleto);
		System.out.println("O nome do candidato é: " + nome);
		System.out.println("O nome completo é: " + nomeCompleto);
		System.out.println("");
		System.out.println("<-- Utilizando métodos das Strings -->");
		/*Comando charAt*/
		System.out.println("Char na posição 5: " + nome.charAt(5));
		/*Comando length*/
		System.out.println("Quantidade de caracteres: " + nome.length());		
		/*Sem TRIM - Caracteres em Branco NÃO são excluídos*/
		System.out.println("COM ESPAÇOS: [" + nomeCompleto + "]");
		/*Com TRIM - Caracteres em Branco são excluídos*/
		System.out.println("SEM ESPAÇOS: [" + nomeCompleto.trim() + "]");
		/*Deixar tudo em maiúsculo*/
		System.out.println("MAIÚSCULO: [" + nomeCompleto.toUpperCase()+ "]");
		/*Deixar tudo em minúsculo*/
		System.out.println("Minúsculo: [" + nomeCompleto.toLowerCase()+ "]");
		/*Verificação de Caracteres com Contains*/
		System.out.println("Verificando Caracter A: " + nomeCompleto.contains("A"));		
		/*Modificando valores com Replace*/
		System.out.println("Modificando A por @: " + nomeCompleto.replace("A", "@"));		
		/*Comparando valores com equals*/
		System.out.println("Nomes são Iguais? " + nomeCompleto.equals("Alisson Alves"));
		/*Comparando valores com equalsIgnoreCase*/
		System.out.println("Nomes são Iguais? " + nomeCompleto.equalsIgnoreCase("alisson alves"));		
		/*Fatiando Strings*/
		System.out.println("Nomes são Iguais? " + nomeCompleto.substring(0, 7));
		/*Utilizando format para formatar strings*/
		System.out.println(String.format("O cliente %s tem sobre nome%s. Desse modo, seu nome completo é: %s", nome, sobreNome, nomeCompleto));
		/*Utilizando toCharArray*/
		System.out.println("<-TRANSFORMANDO STRINGS EM UM VETOR DE CARACTERES->");
		char[] vetor = nome.toCharArray();
		
		for (char i:vetor) {
			System.out.println(i);
		}
		
		System.out.println("");
		/*Utilizando .split()*/
		System.out.println("<-- SEPARANDO STRINGS EM VÁRIAS PARTES USANDO SPLIT -->");
		System.out.println(String.format("O Nome original é: %s", nomeCompleto));
		String[] nomeSeparado = nomeCompleto.split(" ");
		System.out.println("Após separado a estrutura ficou: "+ Arrays.toString(nomeSeparado));
		System.out.println("");
		/*Utilizando o método .concat*/
		System.out.println("Utilizando método concat.");
		System.out.println("Aula".concat(" de Java!"));
		System.out.println("");
		/*Utilizando o método .replaceAll*/
		System.out.println("Utilizando o método replaceAll");
		var cpf = "101-212-654-47";
		System.out.println(String.format("Número do CPF com -: %s", cpf));
		var cpfAdulterado = cpf.replaceAll("-", ".");
		System.out.println(String.format("Número do CPF refatorado com .: %s", cpfAdulterado));
		
	}
}
