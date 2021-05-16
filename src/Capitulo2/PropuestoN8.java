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
 * Convertir una cantidad de grados Fahrenheit a Celsius y Kelvin
 */
public class PropuestoN8 {
    
     public static void main(String[]arg){
         
         float gradosFah;
         
         Scanner tc = new Scanner(System.in);
         
         System.out.println("Ingrese Grados Fahrenheit");
         gradosFah = tc.nextFloat();
         
         float gradosCelsius = (gradosFah - 32)* 5/9;
         
         double gradosKelvin = (gradosFah - 32 )* 5/9 + 273.15;
         
         System.out.println("Conversion a Celsius: " +gradosCelsius + "C");
         System.out.println("Conversion a Kelvin: " +gradosKelvin + "K");
         
     }
}
