/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CursoITA;

/**
 *
 * @author Alisson Alves
 */

//Se utiliza construtores diferentes quando eu tenho tipos de parâmetros diferentes
public class Compra {
    int valorTotal;
    int numeroParcelas;
    
    //Compras a vista
    public Compra(int valor){
        this.valorTotal = valor;
        numeroParcelas = 1;
    }
    
    // Compras parceladas
    public Compra(int valorParcela, int parcelas){
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
