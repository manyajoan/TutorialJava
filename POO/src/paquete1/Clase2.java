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
public class Clase2 {
    public static void main (String [] args){
        Clase1 objeto1 = new Clase1();

        objeto1.setEdad(27);

        objeto1.setNombre("Joan");

        System.out.println("Mi nombre es " + objeto1.getNombre());
        System.out.println("La edad es:" + objeto1.getEdad());
         
    }
}
