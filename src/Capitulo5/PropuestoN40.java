/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ARCANGEL Dados 2 números, obtener el MCD, utilice el método de
 * factorización simultanea Recuerde: El máximo divisor es el divisor mayor
 * común de todos ellos
 */
public class PropuestoN40 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("Numero 1:");
        int num1 = tc.nextInt();

        System.out.println("Numero 2:");
        int num2 = tc.nextInt();

        boolean SonPrimos = false;
        int i = 2;
        int valor1 = num1;
        int valor2 = num2;
        
        //Lista para almacenar los divisores
        List<Integer> lista = new ArrayList<>();
        
        while (SonPrimos == false) {

            if (valor1 % i == 0 && valor2 % i == 0) {
                valor1 = valor1 / i;
                valor2 = valor2 / i;
                lista.add(i);
            } else {
                i++;
            }

            if ((EsPrimo(valor1)) || EsPrimo(valor2)) {
                SonPrimos = true;
            }

        }
                
        //Metodo para Hallar el MCD
        int MCD=1;
        for(int num:lista){
            MCD *= num;
        }
        
        System.out.println("MCD: "+ MCD);
    }

    private static boolean EsPrimo(int valor) {
        int i = 2;
        boolean v = true;
        while (i < valor) {
            if (valor % i == 0) {
                v = false;
            }
            i++;
        }
        return v;
    }

}
