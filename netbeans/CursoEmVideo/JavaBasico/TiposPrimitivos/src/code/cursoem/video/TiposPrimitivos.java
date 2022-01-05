package code.cursoem.video;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alisson Alves
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor da nota do 1º bimestre: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Informe o valor da nota do 2º bimestre: ");
        float nota2 = entrada.nextFloat();
        System.out.print("Informe o valor da nota do 3º bimestre: ");
        float nota3 = entrada.nextFloat();
        float media = (nota1 + nota2 + nota3)/3;
        System.out.printf("A sua média final foi: %.2f\n", media);
    }
} 
            