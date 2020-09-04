/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import static Ejercicio7.Main.buscaCuenta;
import java.util.Scanner;

/**
 *
 * @author conan
 */
public class Main {

	public static int buscaCuenta(Cuenta cuentas[], int n) {
		int i = 0;
		int indice = 0;
		boolean encontrado = false;

		while ((i < cuentas.length) && (encontrado == false)) {
			if (cuentas[i].getNumeroCuenta() == n) {
				encontrado = true;
				indice = i;
			}
			i++;
		}
		if (encontrado == false) {
			indice = -1;
		}

		return indice;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Atributos 
		String nombre;
		String apellido;
		String dni;
		Cuenta cuentas[];
		Cliente cliente;
		int nCuentas, opcion = 0, indiceCuenta, numeroCuenta;
		double saldo, cantidad;

		System.out.println("\tIntroduzca datos de cliente ");
		System.out.print("Introduzca el nombre: ");
		nombre = entrada.nextLine();
		System.out.print("  Apellido:  ");
		apellido = entrada.nextLine();
		System.out.println("Introduzca DNI");
		dni = entrada.nextLine();
		System.out.println("Introduzca numero de cuentas adquiridas: ");
		nCuentas = entrada.nextInt();
		cuentas = new Cuenta[nCuentas];

		for (int i = 0; i < cuentas.length; i++) {
			System.out.println("Digite los datos para la cuenta: " + (i + 1));
			System.out.println("Digite el numero de cuenta: ");
			numeroCuenta = entrada.nextInt();
			System.out.println("Digite el saldo: ");
			saldo = entrada.nextDouble();

			cuentas[i] = new Cuenta(numeroCuenta, saldo);
		}

		cliente = new Cliente(nombre, apellido, dni, cuentas);

		do {
			System.out.println("\t LA CAIXA que quiere hacer?:  ");
			System.out.println("1. Ingresar dinero");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Visualizar saldo");
			System.out.println("4. Salir");
			System.out.print("Digite la opcion del menu: ");

			opcion = entrada.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("1. Ingresar dinero");
					System.out.println("Digite la cuenta que quiere ingresar ");
					numeroCuenta = entrada.nextInt();
					indiceCuenta = buscaCuenta(cuentas, numeroCuenta);
					if (indiceCuenta == -1) {
						System.out.println("Numero de cuenta no existe");
					} else {
						System.out.println("Cantidad: ");
						cantidad = entrada.nextDouble();
						cliente.ingresarDinero(indiceCuenta, cantidad);
						System.out.println("Saldo disponible " + cliente.consultarSaldo(indiceCuenta));

					}
					break;

				case 2:
					System.out.println("2. Retirar dinero");
					System.out.println("Digite la cuenta que quiere retirar ");
					numeroCuenta = entrada.nextInt();
					indiceCuenta = buscaCuenta(cuentas, numeroCuenta);
					if (indiceCuenta == -1) {
						System.out.println("Numero de cuenta no existe");
					} else {
						System.out.println("Cantidad: ");
						cantidad = entrada.nextDouble();
						if (cantidad > cliente.consultarSaldo(indiceCuenta)) {
							System.out.println("No dispones de ese dinero");
						} else {
							cliente.retirarDinero(indiceCuenta, cantidad);
							System.out.println("Saldo disponible " + cliente.consultarSaldo(indiceCuenta));
						}

					}
					break;
				case 3:
					System.out.println("3. Visualizar saldo");
					System.out.println("Digite la cuenta que quiere visualizar");
					numeroCuenta = entrada.nextInt();
					indiceCuenta = buscaCuenta(cuentas, numeroCuenta);
					System.out.println("Su saldo es: " + cliente.consultarSaldo(indiceCuenta));
					break;

				case 4:
					System.out.println("Gracies Adeu");
					break;

			}
		} while (opcion != 4);
	}

}
