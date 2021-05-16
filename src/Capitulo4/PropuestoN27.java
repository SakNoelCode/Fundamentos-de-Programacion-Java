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
 * Obtenga el nombre del estado civil según la sgte tabla
 */
public class PropuestoN27 {
    
     public static void main(String[] arg) {

        int codigo;
        
        Scanner tc = new Scanner(System.in);
        
         System.out.println("Ingrese Codigo");
         
         codigo = tc.nextInt();
         
         switch(codigo){
             case 0:
                 System.out.println("Soltero");
                 break;
             case 1:
                 System.out.println("Casado");
                 break;
             case 2:
                 System.out.println("Divorciado");
                 break;
             case 3:
                 System.out.println("Viudo");
                 break;
             default:
                 System.out.println("Codigo inválido");
                 break;
         }
        
     }
    
}
