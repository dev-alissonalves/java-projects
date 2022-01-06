
public class Somador {
	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;
	
	void somar() {
		valorEstatica++;
		valorInstancia++;
	}
	
	void imprimir() {
		System.out.println("O " +nome+": instância="+ valorInstancia +" e estática = " + valorEstatica);
	}
}
