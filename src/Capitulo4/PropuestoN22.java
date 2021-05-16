/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL 
 * lea un número del 1 al 7 y devuelva el día de la semana,
 * considere que 1 es domingo
 */
public class PropuestoN22 {

    public static void main(String[] arg) {

        Scanner tc = new Scanner(System.in);

        int num;

        System.out.println("Ingrese numero");
        num = tc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Numero incorrecto");
                break;
        }

    }

}
