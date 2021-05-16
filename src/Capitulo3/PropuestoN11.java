/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL
 * Dada la edad de una persona, determinar si es mayor o menor de edad.Considere que se considera 
 * a alguien como mayor de edad si tiene 18 años a más
 */
public class PropuestoN11 {
    
    public static void main(String[]arg){
         
        int edad;
         
         Scanner tc = new Scanner(System.in);
    
         
         System.out.println("Ingrese Edad: ");
         edad = tc.nextInt();
         
         if(edad>=18){
             System.out.println("La persona es mayor de edad");
         }else{
             System.out.println("La persona es menor de edad");
         }
    
    }
    
}
