package code.dio;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		var nome = "Alisson";
		var sobreNome = " Alves";
		final var nomeCompleto = nome+sobreNome;
		
		System.out.println(nomeCompleto);
		System.out.println("O nome do candidato �: " + nome);
		System.out.println("O nome completo �: " + nomeCompleto);
		System.out.println("");
		System.out.println("<-- Utilizando m�todos das Strings -->");
		/*Comando charAt*/
		System.out.println("Char na posi��o 5: " + nome.charAt(5));
		/*Comando length*/
		System.out.println("Quantidade de caracteres: " + nome.length());		
		/*Sem TRIM - Caracteres em Branco N�O s�o exclu�dos*/
		System.out.println("COM ESPA�OS: [" + nomeCompleto + "]");
		/*Com TRIM - Caracteres em Branco s�o exclu�dos*/
		System.out.println("SEM ESPA�OS: [" + nomeCompleto.trim() + "]");
		/*Deixar tudo em mai�sculo*/
		System.out.println("MAI�SCULO: [" + nomeCompleto.toUpperCase()+ "]");
		/*Deixar tudo em min�sculo*/
		System.out.println("Min�sculo: [" + nomeCompleto.toLowerCase()+ "]");
		/*Verifica��o de Caracteres com Contains*/
		System.out.println("Verificando Caracter A: " + nomeCompleto.contains("A"));		
		/*Modificando valores com Replace*/
		System.out.println("Modificando A por @: " + nomeCompleto.replace("A", "@"));		
		/*Comparando valores com equals*/
		System.out.println("Nomes s�o Iguais? " + nomeCompleto.equals("Alisson Alves"));
		/*Comparando valores com equalsIgnoreCase*/
		System.out.println("Nomes s�o Iguais? " + nomeCompleto.equalsIgnoreCase("alisson alves"));		
		/*Fatiando Strings*/
		System.out.println("Nomes s�o Iguais? " + nomeCompleto.substring(0, 7));
		/*Utilizando format para formatar strings*/
		System.out.println(String.format("O cliente %s tem sobre nome%s. Desse modo, seu nome completo �: %s", nome, sobreNome, nomeCompleto));
		/*Utilizando toCharArray*/
		System.out.println("<-TRANSFORMANDO STRINGS EM UM VETOR DE CARACTERES->");
		char[] vetor = nome.toCharArray();
		
		for (char i:vetor) {
			System.out.println(i);
		}
		
		System.out.println("");
		/*Utilizando .split()*/
		System.out.println("<-- SEPARANDO STRINGS EM V�RIAS PARTES USANDO SPLIT -->");
		System.out.println(String.format("O Nome original �: %s", nomeCompleto));
		String[] nomeSeparado = nomeCompleto.split(" ");
		System.out.println("Ap�s separado a estrutura ficou: "+ Arrays.toString(nomeSeparado));
		System.out.println("");
		/*Utilizando o m�todo .concat*/
		System.out.println("Utilizando m�todo concat.");
		System.out.println("Aula".concat(" de Java!"));
		System.out.println("");
		/*Utilizando o m�todo .replaceAll*/
		System.out.println("Utilizando o m�todo replaceAll");
		var cpf = "101-212-654-47";
		System.out.println(String.format("N�mero do CPF com -: %s", cpf));
		var cpfAdulterado = cpf.replaceAll("-", ".");
		System.out.println(String.format("N�mero do CPF refatorado com .: %s", cpfAdulterado));
		
	}
}
