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
 * Dada una fecha determinen cuantos días faltan para que
 * termine el año;
 */
public class PropuestoN30 {

    public static void main(String[] arg) {
        
       String mes;
        int diaMes;
        
        int diasFaltan;

        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese Mes");
        mes = tc.next();
        String mesMayus = mes.toUpperCase();

        switch (mesMayus) {
            case "ENERO":
                System.out.println("ENERO");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=31){
                    diasFaltan = (31 - diaMes)+334;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "FEBRERO":
                System.out.println("FEBRERO");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=28){
                    diasFaltan = (28 - diaMes)+306;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "MARZO":
                System.out.println("MARZO");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=31){
                    diasFaltan = (31 - diaMes)+275;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "ABRIL":
                System.out.println("ABRIL");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=30){
                    diasFaltan = (30 - diaMes)+245;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "MAYO":
                System.out.println("MAYO");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=31){
                    diasFaltan = (31 - diaMes)+214;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "JUNIO":
                System.out.println("JUNIO");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=30){
                    diasFaltan = (30 - diaMes)+184;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "JULIO":
                System.out.println("JULIO");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=31){
                    diasFaltan = (31 - diaMes)+153;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "AGOSTO":
                System.out.println("AGOSTO");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=31){
                    diasFaltan = (31 - diaMes)+124;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "SEPTIEMBRE":
                System.out.println("SEPTIEMBRE");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=30){
                    diasFaltan = (30 - diaMes)+94;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "OCTUBRE":
                System.out.println("OCTUBRE");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=31){
                    diasFaltan = (31 - diaMes)+63;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "NOVIEMBRE":
                System.out.println("NOVIEMBRE");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=30){
                    diasFaltan = (30 - diaMes)+31;
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            case "DICIEMBRE":
                System.out.println("DICIEMBRE");
                System.out.println("Ingrese dia de mes(Fecha)");
                diaMes = tc.nextInt();
                if(diaMes>0 && diaMes<=31){
                    diasFaltan = (31 - diaMes);
                    System.out.println("Faltan " + diasFaltan +" días para que termine el año");
                }else{
                    System.out.println("Fecha Incorrecta");
                }
                break;
            default:
                System.out.println("Mes incorrecto");
                break;

        }

    }

}











