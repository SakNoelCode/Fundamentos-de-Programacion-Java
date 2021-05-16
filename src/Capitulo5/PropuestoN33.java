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
 * Calcular la suma y el producto de los N primeros números naturales múltiplos
 * de 3
 * Multiplos de 3:       3, 6 , 9, 12, 15, 18, 21, ..........
 */
public class PropuestoN33 {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int suma=0,producto=1,N,numMultiplo=3;
        
        System.out.println("Ingrese N");
        N = tc.nextInt();
        
        int i=1;
        while(i<=N){
            
            suma +=numMultiplo;
            producto *=numMultiplo;
            
            numMultiplo +=3 ;
            i++;
        }
        
        
        System.out.println("Suma: " + suma);
        System.out.println("Producto: "+producto);
        
    }
    
}
