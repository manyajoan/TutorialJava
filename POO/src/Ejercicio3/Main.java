/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author conan
 */
public class Main {

    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio; 
        int indice=0; 
        
        precio= coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if(coches[i].getPrecio()< precio){
               precio = coches[i].getPrecio();
               indice = i;
                
            }
        }
        return  indice;
    }
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Vehiculo v1;
        String marca;
        String modelo;
        float precio;
        int numeroVehiculos, indiceBarato;

        System.out.println("Digite la cantidad de vehiculos");
        numeroVehiculos = entrada.nextInt();

        //Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < coches.length; i++) {
            entrada.nextLine();//Esto sale cuando tienes que introducir strings 
            System.out.println("Digite las caracteristicas del coches "+ (i+1)+":");
            System.out.println("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.println("Introduce Modelo: ");
            modelo = entrada.nextLine();
            System.out.println("Introduzca precio: ");
            precio= entrada.nextFloat();
            
            coches[i]= new Vehiculo(marca,modelo,precio);
        }
        
        indiceBarato = indiceCocheMBarato(coches); 
        System.out.println("EL coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
