/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Alisson Alves
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Diferentes maneiras de se declarar e comparar strings
        String nome1 = "Álisson";
        String nome2 = "Álisson";
        String nome3 = new String("Álisson");
        String resultado;
        
        resultado = (nome1 == nome2)?"Igual":"Diferente!";
        System.out.println(resultado);
        
        /*Se a estrutura dos objetos forem declaradas diferentes não posso 
        utilizar os dois iguais, preciso utilizar o método equals.
        */
        
        resultado = (nome1.equals(nome3))?"Igual":"Diferente!";
        System.out.println(resultado);
    }
    
}
