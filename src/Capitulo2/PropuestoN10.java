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
 * Convertir Grados sexagesimales a centesimales
 */
public class PropuestoN10 {
    
     public static void main(String[]arg){
         
         float grdsSexagesimale;
         
         Scanner tc = new Scanner(System.in);
         
         System.out.println("Ingrese grados sexagesimales: ");
         grdsSexagesimale = tc.nextFloat();
         
         float centesimales = grdsSexagesimale * 200 / 180;
         
         System.out.println("Conversion en centesimales: " + centesimales);
     }
    
}
