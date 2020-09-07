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
public class Paquete {

//Atributos 
	int numeroPaquete;
	String dni;
	double peso;
	int prioridad;

	public Paquete(int numeroPaquee, String dni, double peso, int prioridad) {
		this.numeroPaquete = numeroPaquee;
		this.dni = dni;
		this.peso = peso;
		this.prioridad = prioridad;
	}

	public int getNumeroPaquee() {
		return numeroPaquete;
	}

	public String getDni() {
		return dni;
	}

	public double getPeso() {
		return peso;
	}

	public int getPrioridad() {
		return prioridad;
	}
	
	public String mostrarDatosPaquete(){
		
		return "Numero de paquete: " +numeroPaquete+"DNI: "+dni+"Peso: "+peso+"Prioridad: "+prioridad; 
	}
	

}
