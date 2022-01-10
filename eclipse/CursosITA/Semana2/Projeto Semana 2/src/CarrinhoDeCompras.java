
public class CarrinhoDeCompras{

	//Construtor recebendo uma instância de Pizza
	public CarrinhoDeCompras(Pizza p) {
	}
	
	public int ValorTotalCarrinho(Pizza p) {
		return Pizza.contabilizarIngredientes();
	}
}
