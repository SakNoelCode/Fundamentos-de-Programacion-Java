/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo3;

import java.util.Scanner;

/**
 *
 * @author ARCANGEL Dados los sgtes datos de entrada: Saldo anterior, Tipo de
 * Movimiento (Retiro) (Deposito) y monto de transaccion, obtener como dato de
 * salida el saldo actual
 */
public class PropuestoN17 {

    public static void main(String[] arg) {

        double saldoAnterior, montoTransaccion, saldoActual = 0;
        int TipoMovimiento = 0;

        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese su saldo:");
        saldoAnterior = tc.nextDouble();
        System.out.println("Elija que operación realizará");
        System.out.println("1.RETIRO");
        System.out.println("2.DEPOSITO");
        TipoMovimiento = tc.nextInt();
        if (TipoMovimiento != 1 && TipoMovimiento != 2) {
            System.out.println("Opcion Incorrecta");
        } else {

            System.out.println("Ingrese Monto de Transacción");
            montoTransaccion = tc.nextDouble();

            if (TipoMovimiento == 1) {
                saldoActual = saldoAnterior - montoTransaccion;
            }

            if (TipoMovimiento == 2) {
                saldoActual = saldoAnterior + montoTransaccion;
            }

            System.out.println("Su saldo actual es : " + saldoActual);
        }
    }
}
