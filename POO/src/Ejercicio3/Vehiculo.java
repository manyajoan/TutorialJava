/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author conan
 */
public class Vehiculo {
    //Atributos 
    
     String marca;
     String modelo;
     float precio; 
    
    //Metodos

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    
    
    public String mostrarDatos(){
      String datos ="Marca:"+ marca +"Modelo: "+ modelo +"Precio: "+ precio;
        return datos;  
    }
}
