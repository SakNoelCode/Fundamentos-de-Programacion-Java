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
 * Dados dos números, determinar si son iguales o diferentes
 */
public class PropuestoN13 {
    
    public static void main(String[]arg){
        
        float num1,num2;
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Ingrese primer número");
        num1 = tc.nextFloat();
        
        System.out.println("Ingrese segundo número");
        num2 = tc.nextFloat();
        
        if(num1 == num2){
            System.out.println("Los números son iguales");
        }else{
            System.out.println("Los números son diferentes");
        }
        
    }
    
}
