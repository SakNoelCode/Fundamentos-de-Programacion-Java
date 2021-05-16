/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Dadas tres longitudes, diga si forman un triangulo Teorema:
 * En todo triangulo cada lado es menor que la suma de los otros dos, pero mayor
 * que su diferencia
 */
public class PropuestoN19 {

    public static void main(String[] arg) {

        float long1, long2, long3;

        boolean esTriangulo1, esTriangulo2, esTriangulo3;

        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese longitud 1");
        long1 = tc.nextFloat();
        System.out.println("Ingrese longitud 2");
        long2 = tc.nextFloat();
        System.out.println("Ingrese longitud 3");
        long3 = tc.nextFloat();

        float suma;
        float diferencia;

        //Comparamos Lado 1
        suma = long2 + long3;
        if (long2 < long3) {
            diferencia = long3 - long2;
        } else {
            diferencia = long2 - long3;
        }

        if (long1 < suma && long1 > diferencia) {
            esTriangulo1 = true;
        } else {
            esTriangulo1 = false;
        }

        //Comparamos Lado 2
        suma = long1 + long3;
        if (long1 < long3) {
            diferencia = long3 - long1;
        } else {
            diferencia = long1 - long3;
        }

        if (long2 < suma && long2 > diferencia) {
            esTriangulo2 = true;
        } else {
            esTriangulo2 = false;
        }

        //Comparamos Lado 3
        suma = long2 + long1;
        if (long2 < long1) {
            diferencia = long1 - long2;
        } else {
            diferencia = long2 - long1;
        }

        if (long3 < suma && long3 > diferencia) {
            esTriangulo3 = true;
        } else {
            esTriangulo3 = false;
        }

        if (esTriangulo1 == true && esTriangulo2 == true && esTriangulo3 == true) {
            System.out.println("Las longitudes forman un triangulo");
        } else {
            System.out.println("Lalongitudes no forman un triangulo");
        }

    }

}
