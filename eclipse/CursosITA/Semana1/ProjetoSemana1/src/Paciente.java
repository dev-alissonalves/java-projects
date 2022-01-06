public class Paciente {

	// Responsabilidades/Atributos
	double peso;
	double altura;
	double resultadoIMC;
	double diagnostico;
	
	// Construtor do Paciente
	public Paciente(double pesoInserido, double alturaInserida){
		peso = pesoInserido;
		altura = alturaInserida;
	}
	
	// Responsabilidades/Métodos
	public double calcularIMC(){
		return resultadoIMC = peso/(altura*altura);
	}
	
	public String diagnosticoIMC(){
		diagnostico = calcularIMC();
		if (resultadoIMC < 16) {
			System.out.println(String.format("Baixo peso muito grave = %.2f", diagnostico));
		}else if (resultadoIMC >= 16 && diagnostico < 17) {
			System.out.println(String.format("Baixo peso grave = %.2f", diagnostico));
		}else if (resultadoIMC >= 17 && diagnostico < 18.5) {
			System.out.println(String.format("Baixo peso = %.2f", diagnostico));
		}else if(resultadoIMC >= 18.50 && resultadoIMC < 25) {
			System.out.println(String.format("Peso normal = %.2f", diagnostico));
		}else if(resultadoIMC >= 25 && resultadoIMC < 30) {
			System.out.println(String.format("Sobrepeso = %.2f", diagnostico));
		}else if(resultadoIMC >= 30 && diagnostico < 35) {
			System.out.println(String.format("Obesidade grau I = %.2f", diagnostico));
		}else if(resultadoIMC >= 35 && diagnostico < 40) {
			System.out.println(String.format("Obesidade grau II = %.2f", diagnostico));
		}else {
			System.out.println(String.format("Obesidade grau III = %.2f", diagnostico));
		}
		
		//tem que retornar o null ao final...
		return null;
	}
}
