
public class Compras {
	
	int valorTotal;
    int numeroParcelas;
    
    //Compras a vista
    public Compras(int valor){
        this.valorTotal = valor;
        numeroParcelas = 1;
    }
    
    // Compras parceladas
    public Compras(int valorParcela, int parcelas){
        this.valorTotal = valorParcela * parcelas;
        this.numeroParcelas = parcelas;
    }
    
    
    public int getNumeroParcelas() {
        return numeroParcelas;
    }
    
    public int getValorTotal() {
        return valorTotal;
    }
    
    public int getValorParcela(){
        return valorTotal/numeroParcelas;
    }
    
}
