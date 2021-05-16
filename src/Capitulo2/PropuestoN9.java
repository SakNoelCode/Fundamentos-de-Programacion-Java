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
 * Hallar el area y el perimetro de un rectangulo
 */
public class PropuestoN9 {
     public static void main(String[]arg){
         
         float largo,ancho;
         Scanner tc = new Scanner(System.in);
         
         System.out.println("Ingrese largo: ");
         largo = tc.nextFloat();
         
         System.out.println("Ingrese ancho: ");
         ancho = tc.nextFloat();
         
         float perimetro = 2 * largo + 2* ancho;
         float area = largo * ancho;
         
         System.out.println("Area: "+ area);
         System.out.println("Perimetro: "+ perimetro);
     }
    
    
}
