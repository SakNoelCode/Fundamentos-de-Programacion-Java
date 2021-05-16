/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Dados los siguientes operadores matematicos devuelva el
 * nombre del operador
 */
public class PropuestoN23 {

    public static void main(String[] arg) {

        Scanner tc = new Scanner(System.in);

        String operadorMatematico;

        System.out.println("Ingrese operador matemático  [ +, -, *, / ]");
        operadorMatematico = tc.next();

        switch (operadorMatematico) {
            case "+":
                System.out.println("Suma");
                break;
            case "-":
                System.out.println("Resta");
                break;
            case "*":
                System.out.println("Multiplicación");
                break;
            case "/":
                System.out.println("División");
                break;
            default:
                System.out.println("Operador Incorrecto");
                break;

        }

    }

}
