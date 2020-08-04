/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author conan
 */
public class Atleta {
    //Atributos
    int numeroAtleta;
    String nombre;
    float tiempoCarrera; 
    
    //Metodos

    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

  

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }
    
    public String mostrarDatosGanador(){
        String ganador= "Nombre: "+nombre+" Numero: "+numeroAtleta+" Tiempo: "+tiempoCarrera;
        return ganador;
    }
}
