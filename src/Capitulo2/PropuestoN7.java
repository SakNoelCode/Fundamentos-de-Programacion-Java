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
 * Dada una cantidad de horas, obtener su equivalente en minutos y segundos
 * 
 */
public class PropuestoN7 {
     public static void main(String[]arg){
         
         final int minutos = 60;
         final int segundos = 3600;
         
         float horas;
         
         Scanner tc = new Scanner(System.in);
         
         System.out.println("Ingrese Cantidad en Horas");
         horas = tc.nextFloat();
         
         float min = horas * minutos;
         float seg = horas * segundos;
         
         System.out.println("Equivalente en Minutos ==> " +min);
         System.out.println("Equivalente en Segundos ==> "+ seg);
         
         
     }
    
    
}
