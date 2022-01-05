/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetores1;

/**
 *
 * @author Alisson Alves
 */
public class ExVetores1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //Método 1 de declaração de Vetores Unidimensionais
        int n1[] = new int[4];
        n1[0] = 3;
        n1[1] = 2;
        n1[2] = 4;
        n1[3] = 5;
        
        //Método de exibição de vetores unidimensionais usando FOR
        for(int cont = 0; cont < 4; cont++){
            System.out.println("Na posição["+ cont +"] temos: " + n1[cont]);
        }        
        
        System.out.println("");
        
        //Método 2 de declaração de Vetores Unidimensionais
        int n2[] = {5, 1, 3, 4, 5};
        for(int cont2 = 0; cont2 < 5; cont2++){
            System.out.println("Na posição["+ cont2 +"] temos: "+n2[cont2]);
        }        
    }   
}
