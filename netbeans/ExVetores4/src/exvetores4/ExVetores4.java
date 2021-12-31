/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetores4;

import java.util.Arrays;

/**
 *
 * @author Alisson Alves
 */
public class ExVetores4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {4, 5, 7, 8, 10, 11};
        int valorBuscar = 11;
        
        // Encontrando valores em um vetor utilizando o método Binary Search
        int p = Arrays.binarySearch(vet, valorBuscar);
        
        if (valorBuscar == -p){
            System.out.println("O valor ["+ valorBuscar +"] não foi encontrado em nenhuma posição do vetor!");
        }else{
            System.out.println("O valor ["+ valorBuscar +"] foi encontrado na posição: ["+ p +"]");
        }
        
        System.out.println("\n");
        for(int cont = 0; cont < vet.length; cont++){
            System.out.println("POS ["+ cont +"] = " + vet[cont]);
        }
    }
    
}
