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
 *      * Dados dos números enteros, determinar cuántos números enteros
     * están incluidos en ellos
 */
public class PropuestoN2 {
    
    public static void main(String[]arg){
        
        int a;
        int b;
        int res;
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Ingrese valor 1:");
        a = tc.nextInt();
        System.out.print("Ingrese valor 2:");
        b = tc.nextInt();
        
        if(a>b){
            res = a-b;
        }else{
            res = b-a;
        }
        
        System.out.println("Los numeros enteros incluidos son "+res);
        
    }
    
}
