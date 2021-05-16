/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Dadas tres longitudes, si forman un triangulo, devolver el
 * tipo de triángulo según sus lados Equilatero = Sus tres lados son iguales
 * Isosceles = Tiene dos lados iguales Escaleno = Sus tres lados son diferentes
 */
public class PropuestoN20 {

    public static void main(String[] arg) {

        float long1, long2, long3;
        String tipoTriangulo = "";

        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese longitud 1");
        long1 = tc.nextFloat();
        System.out.println("Ingrese longitud 2");
        long2 = tc.nextFloat();
        System.out.println("Ingrese longitud 3");
        long3 = tc.nextFloat();

        if (long1 == long2 && long1 == long3) {
            tipoTriangulo = "Equilatero";
        }
        if (long1 == long2 && long1 != long3 || long2 == long3 && long2 != long1 || long1 == long3 && long1 != long2) {
            tipoTriangulo = "Isosceles";
        }

        if (long1 != long2 && long1 != long3 && long2 != long3) {
            tipoTriangulo = "Escaleno";
        }

        System.out.println("Tipo de triángulo: " + tipoTriangulo);

    }

}
