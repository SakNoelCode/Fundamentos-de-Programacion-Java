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
 * Dado un número entero, devolver el doble del número si el número es positivo, el 
 * triple del número si es negativo, y cero si el número es neutro
 */
public class PropuestoN14 {
    
    public static void main(String[]arg){
        
        int num_entero=0;
        
        Scanner tc = new Scanner (System.in);
        
        System.out.println("Ingrese número");
        num_entero = tc.nextInt();
        
        if(num_entero>0){
            num_entero = num_entero * 2;
            System.out.println("Numero positivo  Doble: "+num_entero);
        }else if(num_entero<0){
            num_entero = num_entero *3;
            System.out.println("Numero negativo   Triple: "+ num_entero);
        }else{
            System.out.println("Numero neutro "+num_entero);
        }
    }
    
}
