import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestesCarroSoma {
	CarroDeCorrida carro;
	
	@BeforeEach
	public void inicializaCarro() {
		carro = new CarroSoma("Pálio", 10, 100);
	}

	@Test
	public void carroParado() {
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	public void carroAcelerar() {
		carro.acelerar();
		assertEquals(10, carro.getVelocidade());
	}
	
	@Test
	public void carroFrear() {
		carro.acelerar();
		carro.frear();
		assertEquals(5, carro.getVelocidade());
	}
	
	@Test
	public void carroFrearAteZero() {
		carro.acelerar();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	public void testeAcelerarAteVelocidadeMaxima() {
		for(int i = 0; i < 20; i++) {
			carro.acelerar();
		}
		assertEquals(100, carro.getVelocidade());
	}
	
}
