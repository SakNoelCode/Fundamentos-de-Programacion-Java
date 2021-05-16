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
 * Dados dos números enteros devolver el número menor
 */
public class PropuestoN12 {
    
    public static void main(String[]arg){
        
        int num1, num2,menor;
        
        Scanner tc = new Scanner (System.in);
        
        System.out.println("Ingrese primer número");

        num1 = tc.nextInt();
        
        System.out.println("Ingrese segundo número");
        num2 = tc.nextInt();
        
        if(num1<num2){
            menor= num1;
        }else{
            menor = num2;
        }
        
        
        System.out.println("El numero menor es: " + menor);

        
    }
}
