public class Pizza {

	String ingrediente;
	double preco;
	private static int qtdIngredientes;
	
	// Construtor da Pizza
	public Pizza(String ingrediente, double preco){
		this.ingrediente = ingrediente;
		this.preco = preco;
	}
	
	public void adicionarIngrediente(String ingredienteAdicionar) {
		contabilizarIngredientes();
	}
	
	public void getPreco(int numIngredientes){
		
		if (contabilizarIngredientes() <= 2) {
			System.out.println("Preço = "+ 15.0);
		}else if (contabilizarIngredientes()  > 2 && numIngredientes <= 5) {
			System.out.println("Preço = "+ 20.0);;
		}else {
			System.out.println("Preço = "+ 23.0);
		}	
	}
	
	public static int contabilizarIngredientes() {
		qtdIngredientes += qtdIngredientes;
		return qtdIngredientes;
	}
}
