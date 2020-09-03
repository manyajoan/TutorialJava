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
public class Cuenta {
    //Atributos 

    int numeroCuenta;
    double saldo;

    //Constructores 
    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarDinero(double cantidad) {
        saldo = saldo + cantidad;
        
    }

    public void retirarDinero(double cantidad) {
        saldo = saldo - cantidad;
    }

}
