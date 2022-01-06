import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	void compraAVista() {
		Compras c1 = new Compras(1000);
		assertEquals(1, c1.getNumeroParcelas());
		assertEquals(1000, c1.getValorParcela());
		assertEquals(1000, c1.getValorTotal());
	}
	
	@Test
	void compraParcelada() {
		Compras c2 = new Compras(100, 10);
		assertEquals(10, c2.getNumeroParcelas());
		assertEquals(100, c2.getValorParcela());
		assertEquals(1000, c2.getValorTotal());
	}
}
