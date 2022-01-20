import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesUnitarios {

	@Test
	void BaixoPesoMuitoGraveTeste() {
		Paciente p = new Paciente(60, 1.95);
		assertEquals(15, p.calcularIMC(), 1);
	}
	
	@Test
	void BaixoPesoGraveTeste() {
		Paciente p = new Paciente(64.6, 1.95);
		assertEquals(16, p.calcularIMC(), 0.99);
	}
	
	@Test
	void BaixoPesoTeste() {
		Paciente p = new Paciente(70.3, 1.95);
		assertEquals(17, p.calcularIMC(), 1.49);
	}
	
	@Test
	void PesoNormalTeste() {
		Paciente p = new Paciente(76, 1.75);
		assertEquals(18.5, p.calcularIMC(), 6.49);
	}
	
	@Test
	void SobrePesoTeste() {
		Paciente p = new Paciente(76, 1.75);
		assertEquals(25, p.calcularIMC(), 4.99);
	}
	
	@Test
	void ObesidadeGrau1Teste() {
		Paciente p = new Paciente(76.6, 1.75);
		assertEquals(30, p.calcularIMC(), 4.99);
	}
	
	@Test
	void ObesidadeGrau2Teste() {
		Paciente p = new Paciente(100, 1.75);
		assertEquals(35, p.calcularIMC(), 4.99);
	}
	
	@Test
	void ObesidadeGrau3Teste() {
		Paciente p = new Paciente(300, 1.75);
		assertEquals(40, p.calcularIMC(), 60);
	}
}
