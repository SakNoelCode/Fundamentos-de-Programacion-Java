/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Dados dos números enteros a y b, determinar cuál es mayor
 * con respecto al otro
 */
public class PropuestoN18 {

    public static void main(String[] arg) {

        int a, b;
        String mensaje = "";

        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese valor de a");
        a = tc.nextInt();
        System.out.println("Ingrese valor de b");
        b = tc.nextInt();

        if (a > b) {
            mensaje = "a es mayor que b";
        }

        if (a < b) {
            mensaje = "b es mayor que a";
        }

        if (a == b) {
            mensaje = "a es igual a b";
        }

        System.out.println(mensaje);
    }

}
