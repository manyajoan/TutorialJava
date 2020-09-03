/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author conan
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Atributos 
        String nombre;
        String apellido;
        String dni;
        Cuenta cuentas[];
        Cliente cliente;
        int numCuenta, opcion = 0;
        double saldo;

        System.out.println("\tIntroduzca datos de cliente ");
        System.out.print("Introduzca el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("  Apellido:  ");
        apellido = entrada.nextLine();
        System.out.println("Introduzca DNI");
        dni = entrada.nextLine();
        System.out.println("Introduzca numero de cuentas adquiridas: ");
        numCuenta = entrada.nextInt();

        cuentas = new Cuenta[numCuenta];

        cliente = new Cliente(nombre, apellido, dni, cuentas);

        do {
            System.out.println("\t LA CAIXA que quiere hacer?:  ");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Visualizar saldo");
            System.out.println("4. Salir");
            
            opcion = entrada.nextInt();

        } while (opcion > 4);
        switch (opcion) {
            case 1:
                System.out.println("1. Ingresar dinero");
                System.out.println("Digite la cuenta que quiere ingresar ");
                numCuenta = entrada.nextInt();
                System.out.println("Cantidad: ");
                saldo = entrada.nextDouble();
                cuentas[numCuenta].ingresarDinero(saldo);
                break;

            case 2:
                System.out.println("2. Retirar dinero");
                System.out.println("Digite la cuenta que quiere retirar ");
                numCuenta = entrada.nextInt();
                System.out.println("Cantidad: ");
                saldo = entrada.nextDouble();
                cuentas[numCuenta].retirarDinero(saldo);
                break;
            case 3:
                System.out.println("3. Visualizar saldo");
                System.out.println("Digite la cuenta que quiere visualizar");
                numCuenta = entrada.nextInt();
                System.out.println("Su saldo es: "+cuentas[numCuenta].getSaldo());
                break;
                
            case 4: 
                System.out.println("Gracies Adeu");
                break;

        }

    }

}
