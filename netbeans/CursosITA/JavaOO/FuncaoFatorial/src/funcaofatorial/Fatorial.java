/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcaofatorial;

public class Fatorial {
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
        
        for (int cont = n; cont > 1; cont --){
            f *= cont;
            s += cont + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial(){
        return fat;
    }
    
    public String getFormula(){
        return formula;
    }
   
}
