
public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.nome = "Fox";
		c1.potencia = 120;
		c1.velocidade = 100;
		
		Carro c2 = new Carro();
		c2.nome = "Palio";
		c2.potencia = 100;
		c2.velocidade = 80;
		
		
		c1.acelerar();
		c1.imprimir();
		c1.frear();
		c1.imprimir();
		System.out.println();
		
		c2.acelerar();
		c2.imprimir();
		c2.frear();
		c2.imprimir();
	}

}
