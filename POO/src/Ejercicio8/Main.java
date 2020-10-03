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

    public static int buscarSucursales(Sucursal paquete[], int nPaquete, int contadorPaquete) {
        int i = 0;
        int indice = 0;
        boolean encontrada = false;

        for (int j = 0; j < contadorPaquete; j++) {
            if (paquete[i].getNumeroSucursal() == nPaquete) {
                encontrada = true;
                indice = i;
            }
            if (encontrada == false) {
                indice = -1;
            }
        }

        return indice;
    }

    public static int buscarPaquete(Paquete sucursales[], int numeroSucursal, int contadorSucursal) {
        int i = 0;
        int indice = 0;
        boolean encontrada = false;

        for (int j = 0; j < contadorSucursal; j++) {
            if (sucursales[i].getNumeroSucursal() == numeroSucursal) {
                encontrada = true;
                indice = i;
            }
            if (encontrada == false) {
                indice = -1;
            }
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nSucursal, nPaquete, opcion;
        Sucursal sucursales[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];
        String direccion;
        String ciudad;
        int numeroPaquete, contadorSucursal = 0, contadorPaquete = 0;
        String dni;
        double peso;
        int prioridad, indiceSucursal, indicePaquete;
        double precioPaquete = 0;

        System.out.println("Introduzca numero de sucursales ");
        nSucursal = entrada.nextInt();
        System.out.println("Introduzca numero de paquetes:");
        nPaquete = entrada.nextInt();
        sucursales = new Sucursal[nSucursal];
        paquete = new Paquete[nPaquete];

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
                    
                    System.out.println("Digite el numero de sucursal");
                    nSucursal = entrada.nextInt();
                    
                    System.out.println("Digite la ciudad:");
                    ciudad = entrada.nextLine();
                    
                    System.out.print("Digite su direccion:");
                    direccion = entrada.nextLine();
                    
                    
                    sucursales[contadorSucursal] = new Sucursal(nSucursal, direccion, ciudad);
                    contadorSucursal++;
                    break;
                case 2:
                    System.out.println("2. Enviar paquete");
                    System.out.println("De que sucursal envia el paquete");
                    nSucursal = entrada.nextInt();
                    indiceSucursal = buscarSucursales(sucursales, nSucursal, contadorSucursal);

                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe");

                    } else {
                        System.out.println("Introduzca numero de paquete");
                        numeroPaquete = entrada.nextInt();
                        System.out.println("Introduzca numero de DNI");
                        dni = entrada.nextLine();
                        System.out.println("Introduce el peso");
                        peso = entrada.nextInt();
                        System.out.println("Introduce la prioridad = normal, 1= ALta, 2Expres");
                        prioridad = entrada.nextInt();

                        paquete[numeroPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);

                        precioPaquete = sucursales[indiceSucursal].calcularPaqute(paquete[contadorPaquete]);

                        System.out.println("El precio es " + precioPaquete);

                        contadorPaquete++;

                    }

                    break;
                case 3:
                    System.out.println("3. Consulta sucursal");
                    System.out.println("Digite el numero de sucursal");
                    nSucursal = entrada.nextInt();

                    indiceSucursal = buscarSucursales(sucursales, nSucursal, contadorSucursal);
                    if (indiceSucursal == -1) {
                        System.out.println("No existe sucursal");
                    } else {
                        System.out.println("Los datos de la sucursal son: ");
                        System.out.println(sucursales[indiceSucursal].mosrarDatosSucursal());
                    }
                    break;
                case 4:
                    System.out.println("4. Consultar paquete");
                    System.out.println("Digite el numero de paquete");
                    nPaquete = entrada.nextInt();

                    indicePaquete = buscarPaquete(paquete, nSucursal, contadorSucursal);

                    if (indicePaquete == -1) {
                        System.out.println("No existe sucursal");
                    } else {
                        System.out.println("Los datos de la sucursal son: ");
                        System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                    }

                    break;
                case 5:
                    System.out.println("5. Mostrar todas las sucursales");
                    for (int i = 0; i < contadorSucursal; i++) {
                        System.out.println("Los datos de la sucursal num " + (i + 1));
                        System.out.println(sucursales[i].mosrarDatosSucursal());
                    }
                    break;
                case 6:
                    System.out.println("6. Mostrar todos los paquetes");
                    for (int i = 0; i < contadorPaquete; i++) {
                        System.out.println("Los datos del paquete num "+(i+1));
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    break;
                case 7:
                    System.out.println("7. Salir");
                    System.out.println("Adeuuu");
                    break;
            }

        } while (opcion != 7);

    }

}
