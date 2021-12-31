/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvetores2;

/**
 *
 * @author Alisson Alves
 */
public class ExVetores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String meses[] = {"Jan", "Fev", "Mar", "Abr","Mai", "Jun", 
            "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int qtdDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //Neste exemplo estamos usando o método length do objeto vetor como parâmetro de controle
        for(int cont = 0; cont < meses.length; cont++){
            System.out.println("O mês de " + meses[cont] + " tem " + qtdDias[cont] +" dias.");
        }
    }
    
}
