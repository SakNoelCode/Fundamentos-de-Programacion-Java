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
 * Dado un número, determinar cuál es el porcentaje de números pares, impares y neutros.
 */
public class PropuestoN36 {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int numPares=0,numImpares=0,numNeutros=0;
        double porcentajePares,porcentajeImpares,porcentajeNeutros;
        String num;
        
        System.out.println("Ingrese número");
        num = tc.next();
        
        //Conversion a String
        String numCadena = String.valueOf(num);
        
        //Creamos un i para recorrer la cadena
        int i=0;
        while(i<numCadena.length()){
            //Obtenemos cada caracter de la cadena
            char c = numCadena.charAt(i);
            //El char lo convertimos a Sring
            String cc = String.valueOf(c);
            //El String lo convertimos a entero
            int digito =Integer.parseInt(cc);
            //Encontramos que numero son pares, impares o neutros
            
            if(digito == 0){
                numNeutros++;
            }else if(digito%2 ==0) {
                numPares++;
            }else{
                numImpares++;
            }
            
            i++;
            
        }
        
        //Hallamos los porcentaje mediante regla de tres simple
        porcentajeImpares = numImpares * 100 / numCadena.length();
        
        porcentajePares = numPares * 100 / numCadena.length();
        
        porcentajeNeutros = numNeutros * 100 / numCadena.length();
        
        
        //Mostramos en pantalla el resultado
        
        System.out.println("Porcentaje Numeros Impares " + porcentajeImpares +" %");
        System.out.println("");
        System.out.println("Porcentaje Numeros Pares " + porcentajePares +" %");
        System.out.println("");
        System.out.println("Porcentaje Numeros Neutros "+ porcentajeNeutros +" %");
        
        
        
        
    }
    
}
