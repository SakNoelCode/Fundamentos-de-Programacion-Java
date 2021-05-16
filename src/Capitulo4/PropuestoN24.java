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
 * Dado el número de un canal de televisión, determine cuál es el nombre del canal
 * 2.Frecuencia Latina
 * 9.ATV
 * 13.TV Perú
 * 
 */
public class PropuestoN24 {
    
    public static void main(String[] arg) {
        
        int numCanal;

        Scanner tc = new Scanner(System.in);
        
        System.out.println("Ingrese número de canal de televisión");
        numCanal = tc.nextInt();
        
        switch(numCanal){
            case 2:
                System.out.println("Frecuencia Latina");
                break;
            case 9:
                System.out.println("ATV");
                break;
            case 13:
                System.out.println("TV Perú");
                break;
            default:
                System.out.println("Canal no registrado");
                break;
        }
        
    }
    
}
