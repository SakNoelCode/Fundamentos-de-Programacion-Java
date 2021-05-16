/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL
 * Dado un número, determinar cuántos dígitos 0 continene
 */
public class PropuestoN34 {
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        int num,digitosCero=0;
        
        System.out.println("Ingrese numero");
        num= tc.nextInt();
        
        String numString = String.valueOf(num);
        
        //Este entero nos servira para recorrer la cadena
        int recorrerString =0;
        //Este metodo no ayuda a saber el tamaño de nuestro String
        int tamañoString =numString.length();
        
        while(recorrerString<tamañoString){
            
            char caracter = numString.charAt(recorrerString);
            //Conversion a String para poder manejarlo mucho mejor
            String c = String.valueOf(caracter);
            
            if("0".equals(c)){
                digitosCero++;
            }
            
            recorrerString++;
        }
        
        
        System.out.println("Digitos cero que continene: " +digitosCero);
        
    }
    
}
