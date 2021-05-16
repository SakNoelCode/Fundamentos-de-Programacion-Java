/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo2;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL
 * Hallar el area y el perimetro de un cuadrado
 */
public class PropuestoN6 {
    
     public static void main(String[]arg){
         
         float lado;
         
         Scanner tc = new Scanner(System.in);
         
         System.out.println("Ingrese lado del cuadrado: ");
         lado= tc.nextFloat();
         
         float area = (float) Math.pow(lado, 2);
         float perimetro = lado *4;
         
         System.out.println("Area: "+ area);
         System.out.println("Perimetro "+perimetro);
     }
}
