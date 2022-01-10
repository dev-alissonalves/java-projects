import java.util.HashMap;

public class Pizza {

	String ingrediente;
	double preco;
	private static int qtdIngredientes;
	
	// Construtor da Pizza
	public Pizza(String ingrediente, double preco){
		this.ingrediente = ingrediente;
		this.preco = preco;
		adicionarIngrediente(ingrediente, preco);
	}
	
	public void adicionarIngrediente(String ingredienteAdd, double valorAdd) {
		contabilizarIngredientes();
		HashMap<String, Integer> listaIngredientesHashMap = new HashMap<String, Integer>();
		listaIngredientesHashMap.put(ingredienteAdd, (int) valorAdd);
	}
	
	public void getPreco(){
		
		if (contabilizarIngredientes() <= 2) {
			System.out.println("Preço = "+ 15.0);
		}else if (contabilizarIngredientes()  > 2 && contabilizarIngredientes() <= 5) {
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
