/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetores5;

import java.util.Arrays;

/**
 *
 * @author Alisson Alves
 */
public class ExVetores5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = new int[20];
        
        //Preenchendo valores de um vetor automaticamente com o método fill
        Arrays.fill(vet, 0);
        for (int valor: vet){
            System.out.print(valor + " ");
        }
    }   
    
}
