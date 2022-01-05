package CursoITA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alisson Alves
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando os objetos C1 e C2
        Carros c1 = new Carros();
        Carros c2 = new Carros();
        
        //Setando valores para os atributos de C1
        c1.Nome = "Fox";
        c1.potencia = 100;
        c1.velocidade = 120;
        c1.imprimir();
        
        System.out.println("");
        
        //Setando valores para os atributos de C1
        c2.Nome = "Palio Weekend";
        c2.potencia = 120;
        c2.velocidade = 90;
        c2.imprimir();
        
        
    }
    
}
