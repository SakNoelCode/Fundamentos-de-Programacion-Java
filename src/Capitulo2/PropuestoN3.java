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
 * Dada una cantidad de milimetros, expresarlo  en la maxima cantidad de metros, 
 * el resto en decimetros, centrimetros y milimetros,
 */
public class PropuestoN3 {
    
    public static void main(String[]arg){
        
        final int metros = 1000;
        final int decimetros = 100;
        final int centimetros = 10;
        final int milimetro = 1;
        
        Scanner tc = new Scanner(System.in);
        
        
        System.out.println("Ingrese cantidad en milimetros: ");
        int cantidad = tc.nextInt();
        
        int m = cantidad/metros;
        
        int resto = cantidad%metros;
        int dc = resto/decimetros;
        int cm = resto/centimetros;
        int mm = resto/milimetro;
        
        
        
        System.out.println("Metros: " + m);
        System.out.println("Resto en Decimetros: "+ dc);
        System.out.println("Resto en Centimetros: "+ cm);
        System.out.println("Resto en Milimetros: "+ mm);
        
        
        
        
    }
    
}
