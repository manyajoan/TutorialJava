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

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int nSucursal;
		Sucursal sucursales[];
		String direccion;
		String ciudad;
		int numeroPaquete;
		String dni;
		double peso;
		int prioridad;

		System.out.println("Introduzca numero de cuentas adquiridas: ");
		nSucursal = entrada.nextInt();
    sucursales = new Sucursal[nSucursal];
		for (int i = 0; i < sucursales.length; i++) {
			System.out.println("Para la sucursal: "+(i+1));
			System.out.print("Introduzca direccion: ");
			direccion = entrada.nextLine();
			System.out.println(" ");
			System.out.print("Ciudad: ");
			
		}
		
		
	}

}
