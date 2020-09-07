/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author jmanya
 */
public class Main {

    public static int numeroSucursales(Sucursal sucursales[], int n) {
        int i=0;
        int indice = 0;
        boolean encontrada = false; 
        
        while ((i<sucursales.length)&&(encontrada==false)) {
            if (sucursales[i].getNumeroSucursal()== i) {
                encontrada = true; 
                i = indice; 
                
            }
        }
        
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nSucursal, nPaquete, opcion;
        Sucursal sucursales[];
        Paquete paquetes[];
        String direccion;
        String ciudad;
        int numeroPaquete;
        String dni;
        double peso;
        int prioridad;

        System.out.println("Introduzca numero de sucursales ");
        nSucursal = entrada.nextInt();
        System.out.println("Introduzca numero de paquetes:");
        nPaquete = entrada.nextInt();
        sucursales = new Sucursal[nSucursal];
        paquetes = new Paquete[nPaquete];

        do {
            System.out.println("****MENU*****");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consulta sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Crear una nueva sucursal");
                    

                    break;
                case 2:
                    System.out.println("2. Enviar paquete");
                    break;
                case 3:
                    System.out.println("3. Consulta sucursal");
                    break;
                case 4:
                    System.out.println("4. Consultar paquete");
                    break;
                case 5:
                    System.out.println("5. Mostrar todas las sucursales");
                    break;
                case 6:
                    System.out.println("6. Mostrar todos los paquetes");
                    break;
                case 7:
                    System.out.println("7. Salir");
                    System.out.println("Adeuuu");
                    break;
            }

        } while (opcion < 5);

    }

}
