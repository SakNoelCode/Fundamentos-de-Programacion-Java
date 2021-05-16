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
 * Se requiere saber si existe un determinado dígito en un número dado
 */
public class PropuestoN35 {
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        int numero;
        String digito;
        boolean existeDigito=false;
        
        
        System.out.println("Ingrese número");
        numero = tc.nextInt();
        System.out.println("Ingrese Dígito a buscar");
        digito = tc.next();
        
        
        int i =0;
        
        String numeroString = String.valueOf(numero);
        int tamanoString = numeroString.length();
        
        while(i<tamanoString){
            char c = numeroString.charAt(i);
            String cc = String.valueOf(c);
            if(cc.equals(digito)){
                existeDigito = true;
                break;
            }
            i++;
        }
        
        
        System.out.println("");
        if(existeDigito==true){
            System.out.println("Existe el digito en el número");
        }else{
            System.out.println("No existe el dígito en el número");
        }
        
    }
 
}
