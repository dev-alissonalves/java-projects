import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u1 = new Usuario();
		u1.nome = "Álisson Alves";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		
		rp.criarTopico(u1);
		assertEquals(u1.pontos, 5);
		
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		Usuario u1 = new Usuario();
		u1.nome = "Álisson Alves";
		u1.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarTopico(u1);
		assertEquals(u1.pontos, 25);
	}

	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario u1 = new Usuario();
		u1.nome = "Álisson Alves";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarTopico(u1);
		assertEquals(u1.pontos, 15);
	}
	
	@Test
	public void pontosCriarTopicoVIPBonusDoDia() {
		Usuario u1 = new Usuario();
		u1.nome = "Álisson Alves";
		u1.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarTopico(u1);
		assertEquals(u1.pontos, 50);
	}
}
