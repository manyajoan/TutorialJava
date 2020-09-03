/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author conan
 */
public class Cliente {
    //Atributos 

    String nombre;
    String apellido;
    String dni;
    Cuenta cuentas[];

    //Metodos 
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public double consultarSaldo(int n) {
        double saldo = 0;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i].numeroCuenta == n) {
                System.out.println("El numero de cuenta es: " + n);
                saldo = cuentas[i].getSaldo();
            }
        }
        return saldo;
    }

    public void ingresarDinero(int n, double cantidad) {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i].numeroCuenta == n) {
                cuentas[i].ingresarDinero(cantidad);
            }
        }

    }

    public void retirarDinero(int n, double cantidad) {
        for (int i = 0; i < cuentas.length; i++) {
           if (cuentas[i].numeroCuenta == n) {
               cuentas[i].retirarDinero(cantidad);
           }
        }
    }

}
