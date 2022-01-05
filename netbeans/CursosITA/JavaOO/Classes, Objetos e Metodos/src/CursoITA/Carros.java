/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CursoITA;

/**
 *
 * @author Alisson Alves
 */
public class Carros {
    
    int potencia;
    int velocidade;
    String Nome;
    
    
    // Criação de Métodos para alterar estado dos objetos da classe Carros
    void acelerar(){
        velocidade += potencia;
    }
    
    void frear(){
        velocidade = velocidade/2;
    }
    
    int getVelocidade(){
        return velocidade;
    }
    
    void imprimir(){
        System.out.println("O carro modelo " + Nome + " está a uma velocidade de: "+ getVelocidade() +" KM/H.");
    }
}
