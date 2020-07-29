/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author conan
 */
public class Principal {
     public static void main (String [] args){
         Persona p1 = new Persona("Joan",27);
         
         p1.setEdad(28);
         p1.mostrarDatos();
       
         
     }
}
