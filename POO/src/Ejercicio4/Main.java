/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author conan
 */
public class Main {
    
     public static int ganador(Atleta atletas[]){
        float tiempo; 
        int indice=0; 
        
        tiempo= atletas[0].getTiempoCarrera();
        for (int i = 1; i < atletas.length; i++) {
            if(atletas[i].getTiempoCarrera()< tiempo){
               tiempo = atletas[i].getTiempoCarrera();
               indice = i;
                
            }
        }
        return  indice;
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numeroAtleta;
        String nombre;
        float tiempoCarrera;
        int participantes, indiceGanador; 
        
        System.out.println("Introduzca numero de atletas de la carrera: ");
        participantes = entrada.nextInt();
       
        Atleta atletas[] = new Atleta[participantes]; 
       
        for (int i = 0; i < atletas.length; i++) {
            entrada.nextLine();
            System.out.println("Introduzca numero: ");
            numeroAtleta= entrada.nextInt(); 
            entrada.nextLine();
            System.out.println("Introduzca nombre del atleta: "+(i+1));
            nombre=entrada.nextLine();
            System.out.println("Introduzca el tiempo: ");
            tiempoCarrera = entrada.nextInt();
            
            
            atletas[i]=new Atleta(numeroAtleta,nombre,tiempoCarrera);
            
        }
        
        System.out.println("El ganador es.............: ");
        indiceGanador=ganador(atletas);
        System.out.println(atletas[indiceGanador].mostrarDatosGanador());
            
        }
        
        
        
    }

