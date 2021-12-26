/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author Alisson Alves
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = 15;
        z = 20;
        boolean r;
        
        //Condicional com AND
        r = (x < y && y < z)?true:false;
        System.out.println(r);
        
        //Condicional com OR
        r = (x < y || y < z)?true:false;
        System.out.println(r);
        
        //Condicional com OU Exclusivo
        r = (x < y ^ y == z)?true:false;
        System.out.println(r);
    }
}
