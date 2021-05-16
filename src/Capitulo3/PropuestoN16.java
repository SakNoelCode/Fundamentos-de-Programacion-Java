/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Despues de ingresar 4 notas, obtener el promedio de las 3
 * mejores. Mostar el mensaje aprobado si el promedio es mayor o igual a 11,
 * caso contrario mostrar desaprobado
 */
public class PropuestoN16 {

    public static void main(String[] arg) {

        float num1, num2, num3, num4;

        float promedio = 0;
        String mensaje = "";

        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese Nota 1");
        num1 = tc.nextFloat();
        System.out.println("Ingrese Nota 2");
        num2 = tc.nextFloat();
        System.out.println("Ingrese Nota 3");
        num3 = tc.nextFloat();
        System.out.println("Ingrese Nota 4");
        num4 = tc.nextFloat();

        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            promedio = (num2 + num3 + num4) / 3;
            if (promedio >= 11) {
                mensaje = "APROBADO";
            } else {
                mensaje = "DESAPROBADO";
            }
        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            promedio = (num1 + num3 + num4) / 3;
            if (promedio >= 11) {
                mensaje = "APROBADO";
            } else {
                mensaje = "DESAPROBADO";
            }
        } else if (num3 <= num1 && num3 <= num2 && num3 <= num4) {
            promedio = (num1 + num2 + num4) / 3;
            if (promedio >= 11) {
                mensaje = "APROBADO";
            } else {
                mensaje = "DESAPROBADO";
            }
        } else if (num4 <= num1 && num4 <= num2 && num4 <= num3) {
            promedio = (num1 + num2 + num3) / 3;
            if (promedio >= 11) {
                mensaje = "APROBADO";
            } else {
                mensaje = "DESAPROBADO";
            }
        }

        System.out.println(mensaje + " con " + promedio);

    }

}
