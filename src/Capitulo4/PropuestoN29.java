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
 * Segun la siguiente tabla, obtener la ciudad que visitara, despues de ingresar su sexo
 * y el puntaje obtenido en el examen
 **/
public class PropuestoN29 {
    
     public static void main(String[] arg) {

        int sexo;    
        double puntaje;
        

        Scanner tc = new Scanner(System.in);
        
        
         System.out.println("Ingrese sexo");
         System.out.println("1.Masculino");
         System.out.println("2.Femenino");
         sexo=tc.nextInt();
         switch(sexo){
             case 1:
                 System.out.println("MASCULINO");
                 System.out.println("Ingrese puntaje");
                 puntaje = tc.nextDouble();
                 if(puntaje>=18 && puntaje <=35){
                     System.out.println("Visitarás Arequipa");
                 }else if(puntaje>35 && puntaje <=75){
                     System.out.println("Visitarás Cuzco");                     
                 }else if(puntaje>75 ){
                     System.out.println("Visitaras Iquitos");
                 }else{
                     System.out.println("Error desconocido");
                 }
                 break;
             case 2:
                  System.out.println("FEMENINO");
                 System.out.println("Ingrese puntaje");
                 puntaje = tc.nextDouble();
                 if(puntaje>=18 && puntaje <=35){
                     System.out.println("Visitarás Cuzco");
                 }else if(puntaje>35 && puntaje <=75){
                     System.out.println("Visitarás Iquitos");                     
                 }else if(puntaje>75 ){
                     System.out.println("Visitaras Arequipa");
                 }else{
                     System.out.println("Error desconocido");
                 }
                 break;
             default:
                 System.out.println("Algo ocurrio mal");
                 break;
         }
     }
    
}
