/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos2;

/**
 *
 * @author conan
 */
public class Persona {
    
    //Atributos
    
    String nombre; 
    int edad; 
    String dni;
    
    
    //Metodo
    //Primer metodo es el constructor que se pone public
    //Metodo constructor
  
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    //public void mostrarDatos() {
       // System.out.println("El nombre es "+nombre);
       // System.out.println("La edad es "+edad);
   // }
    
    public void correr(){
        System.out.println("Soc en " +nombre+" tengo "+edad+" años y estoy corriendo una maraton");
    }
    
    public void correr(int km){
        System.out.println("He corrido tantos "+km+" kilometros");
    }
    
}


