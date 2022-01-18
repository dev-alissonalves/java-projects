import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testesCarro {

	@Test
	void testeCarroInicializado() {
		Carro c = new Carro();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	void testeCarroAcelerar() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	void testeCarroFreio() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
}
