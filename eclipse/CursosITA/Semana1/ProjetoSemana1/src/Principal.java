
public class Principal {
	// Developer GitHub: https://github.com/dev-alissonalves
	
	public static void main(String[] args) {
		
		System.out.println("<<< C�LCULO DO IMC UTILIZANDO ORIENTA��O A OBJETOS >>>>");
		System.out.println();
		
		System.out.println("Informa��es do Paciente 01\n----------------------------");
		Paciente paciente1 = new Paciente(80, 1.75);
		paciente1.diagnosticoIMC();
		
		System.out.println("\n");
		System.out.println("Informa��es do Paciente 02\n----------------------------");
		Paciente paciente2 = new Paciente(120, 1.70);
		paciente2.diagnosticoIMC();
		
		System.out.println("\n");
		System.out.println("Informa��es do Paciente 03\n----------------------------");
		Paciente paciente3 = new Paciente(60, 1.95);
		paciente3.diagnosticoIMC();
		
		System.out.println("\nFim da execu��o!");
	}

}
