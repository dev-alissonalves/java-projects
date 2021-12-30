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
        int numero = 0, soma = 0, pares = 0, impares = 0, AcimaDe100 = 0, somatorio = 0;
        double media;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe!)</em></html>"));
            somatorio++;
            
            if(numero % 2 == 0){
                pares++;
            }else{
                impares++;
            }
            if(numero > 100){
                AcimaDe100++;
            }
            soma += numero;
        }while(numero != 0);
        media = soma/(somatorio-1);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br><hr>"
                + "<br>Somatório: " + soma +" <br> "
                + "Total de Nº Pares digitados: " + (pares-1) +"<br>"
                + "Total de Nº Ímpares digitados: " + impares + "<br>"
                + "Total de Nº acima de 100: "+ AcimaDe100 +"<br>"
                + "Média dos valores: "+ media +"<br><hr></html>");
    }
}
