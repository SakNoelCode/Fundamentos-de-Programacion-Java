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
 * Obtener el valor de C y D de acuerdo a la sgte formula
 * 
 */
public class PropuestoN4 {
    
    
        public static void main(String[]arg){
            
            int a,b;
            Scanner tc = new Scanner(System.in);
            
            System.out.println("Ingrese valor de a: ");
            a=tc.nextInt();
            System.out.println("Ingrese valor de b: ");
            b=tc.nextInt();
            
            float c =  (float) ( (4*Math.pow(a, 4) + 3*b*a + Math.pow(b, 2))/(Math.pow(a, 2) - Math.pow(b, 2)) );
            float d = (float) ( (3*Math.pow(c, 2) + a + b)/(4) );
            
            
            System.out.println("Valor de c: " + c);
            System.out.println("Valor de d: " + d);
        }
    
}
