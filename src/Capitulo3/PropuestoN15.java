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
 * Crear un programa que al ingresar 3 números enteros devuelva los números ordenados 
 * en forma ascendente y en forma descendente
 */
public class PropuestoN15 {
    
    public static void main(String[]arg){
        
        int num1,num2,num3;
        int mayor=0, intermedio=0,menor=0;
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Ingrese número 1");
        num1 = tc.nextInt();
        System.out.println("Ingrese número 2");
        num2 = tc.nextInt();
        System.out.println("Ingrese número 3");
        num3 = tc.nextInt();
        
        //Buscamos al mayor
        if(num1 > num2 && num1 >num3){
            mayor = num1;
        }else if (num2 > num1 && num2 > num3){
            mayor = num2;
        }else{
            mayor = num3;
        }
        
        
        //Buscamos al menor
        if(num1 < num2 && num1 <num3){
            menor = num1;
        }else if (num2 < num1 && num2 < num3){
            menor = num2;
        }else{
            menor = num3;
        }
        
        
        //Buscamos al intermedio
        intermedio = (num1+num2+num3)-(mayor+menor);
        
        
        //Ordenamos   
        System.out.println("Ordenamos descendentemente " + mayor + "; "+ intermedio + "; " + menor);
        System.out.println("Ordenamos ascendentememte " + menor + "; "+ intermedio + "; " + mayor);
    }
    
}
