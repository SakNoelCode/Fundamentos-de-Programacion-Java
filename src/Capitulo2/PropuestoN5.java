/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo2;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Dado 4 números enteros, obtener el porcentaje de cada uno en
 * función a la suma de los números ingresados
 */
public class PropuestoN5 {

    public static void main(String[] arg) {

        int num1, num2, num3, num4;

        Scanner tc = new Scanner(System.in);

        System.out.println("Ingresa primer valor:");
        num1 = tc.nextInt();
        System.out.println("Ingresa segundo valor:");
        num2 = tc.nextInt();
        System.out.println("Ingresa tercer valor:");
        num3 = tc.nextInt();
        System.out.println("Ingresa cuarto valor:");
        num4 = tc.nextInt();

        int suma = num1 + num2 + num3 + num4;

        //Usar la regla de tres simple
        float num1porcentual = num1 * 100 / suma;
        float num2porcentual = num2 * 100 / suma;
        float num3porcentual = num3 * 100 / suma;
        float num4porcentual = num4 * 100 / suma;

        System.out.println("Valor porcentual de " + num1 + " es " + num1porcentual + "%");
        System.out.println("Valor porcentual de " + num2 + " es " + num2porcentual + "%");
        System.out.println("Valor porcentual de " + num3 + " es " + num3porcentual + "%");
        System.out.println("Valor porcentual de " + num4 + " es " + num4porcentual + "%");

    }
}
