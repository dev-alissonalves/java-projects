import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AntesDepois {

	
	@Before
	public void antes() {
		System.out.println("TesteAntes");
	}
	
	@After
	public void depois() {
		System.out.println("TesteDepois");
	}
	
	@BeforeClass
	public static void antesDeTudo() {
		System.out.println("Testar - Antes de Tudo!\n");
	}
	
	@AfterClass 
	public static void depoisDeTudo() {
		System.out.println("\nTestar - Depois de Tudo!");
	}
	
	@Test
	public void teste1() {
		System.out.println("Teste1");
	}
	
	@Test
	public void teste2() {
		System.out.println("Teste2");
	}
	
	@Test
	public void teste3() {
		System.out.println("Teste3");
	}

}
