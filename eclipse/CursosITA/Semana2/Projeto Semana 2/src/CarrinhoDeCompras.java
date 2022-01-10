
public class CarrinhoDeCompras{

	double valorTotal;
	
	//Construtor recebendo uma instância de Pizza
	public CarrinhoDeCompras(Pizza p) {
		this.valorTotal = Pizza.contabilizarIngredientes();
	}
}
