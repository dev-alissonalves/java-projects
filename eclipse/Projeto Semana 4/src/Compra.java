public class Compra {
	
	private double valorCompra;
	protected double valorTotalCompra;
	
	public Compra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorCompra() {
		return valorCompra;
	}
	
	public double valorTotalCompra() {
		valorTotalCompra += getValorCompra();
		return (Math.round(valorTotalCompra));
	}
}
