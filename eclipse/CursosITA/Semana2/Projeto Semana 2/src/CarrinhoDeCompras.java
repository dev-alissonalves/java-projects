
public class CarrinhoDeCompras{

	double valorTotal;
	
	//Construtor recebendo uma inst�ncia de Pizza
	public CarrinhoDeCompras(Pizza p) {
		this.valorTotal = Pizza.contabilizarIngredientes();
	}
}
