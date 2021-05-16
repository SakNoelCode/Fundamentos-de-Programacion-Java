/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL En una empresa se ha determinado la sgte politica de
 * descuento Obrero Hombre 15% Empleado Hombre 20% Mujer Obrero 10% Empleado
 * Mujer 15%
 */
public class PropuestoN25 {

    public static void main(String[] arg) {

        float montoDescuento=0;
        int sexo;
        int cargo;
        float sueldo;

        Scanner tc = new Scanner(System.in);

        System.out.println("Selecione Sexo");
        System.out.println("1.Hombre");
        System.out.println("2.Mujer");
        sexo = tc.nextInt();

        switch (sexo) {
            case 1:
                System.out.println("Selecciones Cargo:");
                System.out.println("1.Obrero");
                System.out.println("2.Empleado");
                cargo = tc.nextInt();
                switch(cargo){
                    case 1:
                        System.out.println("Ingrese Sueldo");
                        sueldo = tc.nextFloat();
                        montoDescuento = 15  * sueldo / 100;
                        break;
                    case 2:
                        System.out.println("Ingrese Sueldo");
                        sueldo = tc.nextFloat();
                        montoDescuento = 20  * sueldo / 100;
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }
                break;
            case 2:
                System.out.println("Selecciones Cargo:");
                System.out.println("1.Obrero");
                System.out.println("2.Empleado");
                cargo = tc.nextInt();
                switch(cargo){
                    case 1:
                        System.out.println("Ingrese Sueldo");
                        sueldo = tc.nextFloat();
                        montoDescuento = 10  * sueldo / 100;
                        break;
                    case 2:
                        System.out.println("Ingrese Sueldo");
                        sueldo = tc.nextFloat();
                        montoDescuento = 15  * sueldo / 100;
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }
                break;
                
            default:
                System.out.println("Opción Incorrecta");
                break;
        }
        
        
        System.out.println("El monto de descuento es: " + montoDescuento);

        
    }

}
