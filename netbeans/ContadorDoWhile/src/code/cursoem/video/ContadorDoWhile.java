/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.cursoem.video;
import javax.swing.JOptionPane;
/**
 *
 * @author Alisson Alves
 */
public class ContadorDoWhile {
    public static void main(String[] args) {
        int numero, soma = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe!)</em></html>"));
            soma += numero;
        }while(numero != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br><hr>"
                + "<br>Somatório vale " +soma+" </html>");
    }
}
