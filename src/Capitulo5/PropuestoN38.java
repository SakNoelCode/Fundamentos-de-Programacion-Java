/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5;

import java.util.Scanner;



/**
 *
 * @author ARCANGEL 
 * Dado un numero determine si es capicua
 */
public class PropuestoN38 {

    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese numero:");
        num = entrada.nextInt();
        
        int resto,falta=num,numInvertido=0 ;
        
        while(falta>0){
            
            resto = falta % 10 ;
            falta = falta / 10;
            numInvertido = numInvertido * 10 + resto;
        }
        
        
        if(numInvertido == num){
            System.out.println("Es un número capicúa");
        }else{
            System.out.println("No es un número capicúa");
        }

       
    }

}





























/**
 *
 * @author ARCANGEL 
 * Dado un rango de número determine cuantos números capicua
 * hay
 */
/*
        Scanner tc = new Scanner(System.in);
        int numInicial, numFinal, numCapicuas = 0;

        System.out.println("Ingrese Numero Inicial ");
        numInicial = tc.nextInt();

        System.out.println("Ingrese Numero Final ");
        numFinal = tc.nextInt();

        //I para recorrer el rango
        int i = numInicial + 1;


        while (i < numFinal) {
             
            //ciclo para ver si es un numero capicua
            int resto,numeroInvertido=0,falta=i;
            
            while(falta>0){
                resto = falta % 10;
                falta = falta /10;
                numeroInvertido = numeroInvertido * 10 + resto;
            }
            if(numeroInvertido ==i){
                numCapicuas++;
            }
            

            i++;
        }

        System.out.println("Números capicúas que existen " + numCapicuas);
*/