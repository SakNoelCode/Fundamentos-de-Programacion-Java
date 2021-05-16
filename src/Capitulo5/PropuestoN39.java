/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Dados 2 números, obtener el MCD(Maximo Comun Divisor),
 * utilize el método Euclides (Divisiones Sucesivas)
 */
public class PropuestoN39 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int num1, num2, mcd = 0;

        System.out.println("Ingrese primer Numero: ");
        num1 = tc.nextInt();
        System.out.println("Ingrese Segundo Numero: ");
        num2 = tc.nextInt();

        //Obtenemos el numero mayor y menor
        int numMayor, numMenor;
        if (num1 > num2) {
            numMayor = num1;
            numMenor = num2;
        } else {
            numMayor = num2;
            numMenor = num1;
        }

        int dividendo = numMayor;
        int divisor = numMenor;
        int cociente;
        int residuo;
        
        boolean flat = false;

        while (flat==false) {
       
            cociente = dividendo / divisor; 
            residuo = dividendo % divisor;
            
            if (residuo == 0) {
                mcd = divisor;
                flat=true;
            } else {
                dividendo = divisor;
                divisor = residuo;
            }

        }

        System.out.println("MCD: " + mcd);

    }

}
