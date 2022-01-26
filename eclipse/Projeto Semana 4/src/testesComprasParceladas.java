import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testesComprasParceladas {

	@Test
	void testeUmaParcela() {
		CompraParcelada cp = new CompraParcelada(1000, 1, 0.10);
		assertEquals(1100, cp.valorTotalCompra());
	}
	
	@Test
	void testeDuasParcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 2, 0.10);
		assertEquals(2420.0, cp.valorTotalCompra());
	}
	
	@Test
	void testeCincoParcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 5, 0.10);
		assertEquals(8053.0, cp.valorTotalCompra());
	}
	
	@Test
	void testeDezParcelas() {
		CompraParcelada cp = new CompraParcelada(1000, 10, 0.10);
		assertEquals(25937.0, cp.valorTotalCompra());
	}
}
