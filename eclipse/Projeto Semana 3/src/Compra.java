public class Compra {
	private double valorCompra;
	protected int valorTotalCompra;
	
	public Compra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorCompra() {
		return valorCompra;
	}
	
	public int valorTotalCompra() {
		valorTotalCompra += getValorCompra();
		return valorTotalCompra;
	}
}
