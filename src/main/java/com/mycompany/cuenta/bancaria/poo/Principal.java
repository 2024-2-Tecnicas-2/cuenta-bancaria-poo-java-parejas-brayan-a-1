package com.mycompany.cuenta.bancaria.poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        // Crear una nueva cuenta bancaria
        CuentaBancaria ct = new CuentaBancaria();
        System.out.println("Nombre del titular: ");
        ct.setTitular(as.nextLine());

        while (true) {
            System.out.println("Nombre del titular: " + ct.getTitular());
            System.out.println("Saldo actual de la cuenta: " + ct.getSaldo());
            System.out.println("Interés del saldo: " + ct.calcularInteres());
            System.out.println("");
            

            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3.Cambio de nombre del titular");
            int opc = as.nextInt();
            as.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Monto a ingresar: ");
                    double ingreso = as.nextDouble();
                    ct.ingresar(ingreso);

                    System.out.println("Nuevo Saldo actual de la cuenta: " + ct.getSaldo());

                    System.out.println("Nuevo Interés del saldo: " + ct.calcularInteres());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Monto a retirar: ");
                    double retiro = as.nextDouble();
                    ct.retirar(retiro);
                    System.out.println("Nuevo Saldo actual de la cuenta: " + ct.getSaldo());
                    System.out.println("Nuevo Interés del saldo: " + ct.calcularInteres());
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo nombre del titular:");
                    ct.setTitular(as.nextLine());
                    System.out.println("Nombre actualizado a: " + ct.getTitular());
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;

            }

        }
    }
}
