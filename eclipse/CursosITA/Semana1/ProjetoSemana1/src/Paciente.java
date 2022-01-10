public class Paciente {

	// Responsabilidades/Atributos
	double peso;
	double altura;
	
	// Construtor do Paciente
	public Paciente(double pesoInserido, double alturaInserida){
		peso = pesoInserido;
		altura = alturaInserida;
	}
	
	// Responsabilidades/Métodos
	public double calcularIMC(){
		return peso/(altura*altura);
	}
	
	public String diagnosticoIMC(){
		if (calcularIMC() < 16) {
			System.out.println(String.format("Baixo peso muito grave = %.2f", calcularIMC()));
		}else if (calcularIMC() >= 16 && calcularIMC() < 17) {
			System.out.println(String.format("Baixo peso grave = %.2f", calcularIMC()));
		}else if (calcularIMC() >= 17 && calcularIMC() < 18.5) {
			System.out.println(String.format("Baixo peso = %.2f", calcularIMC()));
		}else if(calcularIMC() >= 18.50 && calcularIMC() < 25) {
			System.out.println(String.format("Peso normal = %.2f", calcularIMC()));
		}else if(calcularIMC() >= 25 && calcularIMC() < 30) {
			System.out.println(String.format("Sobrepeso = %.2f", calcularIMC()));
		}else if(calcularIMC() >= 30 && calcularIMC() < 35) {
			System.out.println(String.format("Obesidade grau I = %.2f", calcularIMC()));
		}else if(calcularIMC() >= 35 && calcularIMC() < 40) {
			System.out.println(String.format("Obesidade grau II = %.2f", calcularIMC()));
		}else {
			System.out.println(String.format("Obesidade grau III = %.2f", calcularIMC()));
		}
		
		//tem que retornar o null ao final...
		return null;
	}
}
