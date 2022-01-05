/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetores3;

import java.util.Arrays;

/**
 *
 * @author Alisson Alves
 */
public class ExVetores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vet[] = {3.5, 2.5, 1.75, 3.5, 9.5};
        
        //Método de exibição de vetores unidimensionais usando FOR EACH
        for (double valor: vet){
            System.out.print(valor + " ");
        }
        System.out.println("\n");
        
        System.out.println("Vetor ordenado abaixo usando o método sort.");
        Arrays.sort(vet);
        for (double valor: vet){
            System.out.print(valor + " ");
        }
    }
    
}
