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
 */
public class PropuestoN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       
        int a;
        int b;

        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese Numero 1: ");
        a = tc.nextInt();

        System.out.println("Ingrese Numero 2:");
        b = tc.nextInt();

        int suma = a + b;
        int resta = a - b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta); 


    }

}
