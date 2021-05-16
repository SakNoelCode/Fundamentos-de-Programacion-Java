/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo4;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Determinar el monto que recibira un trabajador por
 * utilidades, despues de ingresar el tiempo de servicio y el cargo, según la
 * siguiente tabla
 */
public class PropuestoN28 {

    public static void main(String[] arg) {

        int cargo;
        int tiempoServicio;
        
        

        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese Cargo");
        System.out.println("1.Administrador");
        System.out.println("2.Contador");
        System.out.println("3.Empleado");
        cargo = tc.nextInt();

        switch (cargo) {
            case 1:
                System.out.println("ADMINISTRADOR");
                System.out.println("Ingrese tiempo de Servicio");
                tiempoServicio = tc.nextInt();
                if(tiempoServicio>0 && tiempoServicio <=2){
                    System.out.println("El monto a recibir es de 2000 $");
                }else if(tiempoServicio>2 && tiempoServicio<=5){
                    System.out.println("El monto a recibir es de 2500 $");
                }else if(tiempoServicio>5 && tiempoServicio<=8){
                    System.out.println("El monto a recibir es de 3000 $");
                }else if(tiempoServicio>8){
                    System.out.println("El monto a recibir es de 4000 $");
                }else{
                    System.out.println("Valores Incorrectos");
                }
                break;
            case 2:
                System.out.println("CONTADOR");
                System.out.println("Ingrese tiempo de Servicio");
                tiempoServicio = tc.nextInt();
                if(tiempoServicio>0 && tiempoServicio <=2){
                    System.out.println("El monto a recibir es de 1500 $");
                }else if(tiempoServicio>2 && tiempoServicio<=5){
                    System.out.println("El monto a recibir es de 2000 $");
                }else if(tiempoServicio>5 && tiempoServicio<=8){
                    System.out.println("El monto a recibir es de 2500 $");
                }else if(tiempoServicio>8){
                    System.out.println("El monto a recibir es de 3500 $");
                }else{
                    System.out.println("Valores Incorrectos");
                }
                break;
            case 3:
                System.out.println("EMPLEADO");
                System.out.println("Ingrese tiempo de Servicio");
                tiempoServicio = tc.nextInt();
                if(tiempoServicio>0 && tiempoServicio <=2){
                    System.out.println("El monto a recibir es de 1000 $");
                }else if(tiempoServicio>2 && tiempoServicio<=5){
                    System.out.println("El monto a recibir es de 1500 $");
                }else if(tiempoServicio>5 && tiempoServicio<=8){
                    System.out.println("El monto a recibir es de 2000 $");
                }else if(tiempoServicio>8){
                    System.out.println("El monto a recibir es de 1500 $");
                }else{
                    System.out.println("Valores Incorrectos");
                }
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
              
        }

    }

}
