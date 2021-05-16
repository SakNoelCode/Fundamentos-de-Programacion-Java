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
 * Una frutería ofrece las manzanas con descuento, segun la sgte tabla
 * Determinar cuánto pagara una persona que compre manzanas en esa frutería
 * 
 */
public class PropuestoN26 {
    
    public static void main(String[] arg) {

        double kg;
        double precio;
        double descuento;
        double montoFinal;
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Ingrese cuánto el kg de manza");
        precio = tc.nextDouble();
        System.out.println("Ingrese cuantos Kg de manzana comprará");
        kg=tc.nextDouble();
        
        if(kg>0 && kg<=2){
            System.out.println("Sin Descuento");
            montoFinal = precio * kg ;
            System.out.println("Precio Final: "+ montoFinal);
        }else if(kg>2 && kg <=5){
            System.out.println("Descuento del 10%");
            descuento = (10 * (precio*kg )) / 100;
            montoFinal =  (precio * kg) -descuento;
            System.out.println("Precio Final: "+ montoFinal);
        }else if(kg>5 && kg<=10){
            System.out.println("Descuento del 20%");
            descuento = (20 * (precio*kg )) / 100;
            montoFinal =  (precio * kg) -descuento;
            System.out.println("Precio Final: "+ montoFinal);
        }else if(kg>10){
            System.out.println("Descuento del 30%");
            descuento = (30 * (precio*kg )) / 100;
            montoFinal =  (precio * kg) -descuento;
            System.out.println("Precio Final: "+ montoFinal);
        }else{
            System.out.println("Valores Incorrectos ");
        }
    
    }
}
