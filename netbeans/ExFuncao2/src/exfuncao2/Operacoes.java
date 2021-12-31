/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exfuncao2;

/**
 *
 * @author Alisson Alves
 */
public class Operacoes {
    public static String contador(int inicio, int fim){
        String contagem = "";
        for (int cont = inicio; cont <= fim; cont++){
            contagem += cont + " ";
        }
        return contagem;
    }
}
