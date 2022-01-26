
public class CompraParcelada extends Compra{

	private int qtdParcelas;
	private double jurosMensais;
	
	public CompraParcelada(double valorCompra, int qtdParcelas, double jurosMensais) {
		super(valorCompra);
		this.jurosMensais = jurosMensais;
		this.qtdParcelas = qtdParcelas;
	}

	@Override
	public double valorTotalCompra() {
		for (int i = 1; i <= qtdParcelas; i++) {
			valorTotalCompra += getValorCompra() * Math.pow((1+jurosMensais), qtdParcelas);
		}
		return (Math.round(valorTotalCompra));
	}
}
