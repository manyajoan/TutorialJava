/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author jmanya
 */
public class Sucursal {
//	Atributos

	int numeroSucursal;
	String direccion;
	String ciudad;

	public Sucursal(int numeroSucursal, String direccion, String ciudad) {
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

    Sucursal(String direccion, String ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public int getNumeroSucursal() {
		return numeroSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String mosrarDatosSucursal() {
		return "Numero sucursal: " + numeroSucursal + "Direccion: " + direccion + "Ciudad: " + ciudad;
	}

	public double calcularPaqute(Paquete t) {
		double precio;
		precio = t.getPeso();
		if (t.getPrioridad() == 1) {
			precio = 10 + precio;
		}
		if (t.getPrioridad() == 2) {
			precio = 20 + precio;
		}

		return precio;
	}
}
