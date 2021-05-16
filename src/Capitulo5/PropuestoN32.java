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
 * Dado un rango de números enteros,obtener la cantidad de números pares e impares que contiene el 
 * rango, sin considerar los múltiplos de 5
 */
public class PropuestoN32 {
    
   
    public static void main(String[] args) {
         Scanner tc = new Scanner(System.in);
        
        int numInicial,numFinal,numPares=0,numImpares=0;
        
        System.out.println("Ingrese numerio Inicial");
        numInicial = tc.nextInt();
        System.out.println("Ingrese numero final");
        numFinal = tc.nextInt();
        
        int i = numInicial +1;
        
        while(i<numFinal){
            if(i%2==0){
                numPares++;
            }else{
                numImpares++;
            }
            i++;
        }
        
        System.out.println("Numeros pares: "+ numPares);
        System.out.println("Numeros Impares: "+numImpares);
        
        
    }
    
}
