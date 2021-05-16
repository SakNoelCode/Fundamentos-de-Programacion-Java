/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Obtener el factorial de un número, recuerde que el factorial
 * de un número es el producto de 1x2x3x4
 */
public class PropuestoN31 {

    public static void main(String[] args) {

        int num = 0, rpta = 1;
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese numero:");
        num = tc.nextInt();

        

        while (num != 0) {
            rpta = rpta*num;
            num--;
        }

        System.out.println("El factorial es: " + rpta);
    }

}
