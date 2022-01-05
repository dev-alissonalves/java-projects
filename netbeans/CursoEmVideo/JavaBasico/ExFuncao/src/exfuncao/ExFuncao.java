/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exfuncao;

/**
 *
 * @author Alisson Alves
 */
public class ExFuncao {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b){
        int soma = a + b;
        return soma;
    }
    public static void main(String[] args) {
        int resultado = soma(1, 2);
        System.out.println("A soma é: " + resultado);
    }
    
}
