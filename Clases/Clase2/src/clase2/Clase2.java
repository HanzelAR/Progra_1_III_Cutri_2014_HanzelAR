/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean validar = true;
        int opcion;
        char continuar;
        double monto;

        CuentaBancaria oCuentaBancaria = new CuentaBancaria();
        Scanner teclado = new Scanner(System.in);
        while (validar) {
            System.out.println("Digite 1 siquiere realizar un depósito y 2 si quiere realizar un retiro");
            teclado=new Scanner(System.in);
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Digite el monto a depositar");
                monto = teclado.nextDouble();
                oCuentaBancaria.Deposito(monto);

            }
            if (opcion == 2) {
              System.out.println("Digite el monto a retirar");
                monto = teclado.nextDouble();
                oCuentaBancaria.Retiro(monto);
                if (oCuentaBancaria.isHayError()) {
                    System.out.println("El monto que ud va a retirar no puede ser retirado");
                }
            }
            System.out.println("El saldo final es de " + oCuentaBancaria.getSaldoInicial());
            System.out.println("Desea continuar con otra transacción S/N");
            teclado=new Scanner(System.in);
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            }
            if ((continuar == 'N') || (continuar == 'n')) {
                validar = true;

            }

        }
    }
}
