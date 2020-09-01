/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author conan
 */
public class Main {
    public static double mayorArea(Triangulo_Isosceles triangulos[]){
        double area;
        
        area = triangulos[0].obtenerArea();
        for (int i = 0; i < triangulos.length; i++) {
            if(triangulos[i].obtenerArea()>area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int numTriangulos; 
        double base, lado; 
         System.out.println("Cuantos triangulos va a comparar? ");
         numTriangulos = entrada.nextInt();
         
         Triangulo_Isosceles triangulos[]= new Triangulo_Isosceles[numTriangulos];
         
         for (int i = 0; i < numTriangulos; i++) {
             System.out.println("Digite los valores para el triangulo "+ (1+i));
             System.out.print("Introduzca la base: ");
             base = entrada.nextDouble();
             System.out.print("Introduzca el lado: ");
             lado = entrada.nextDouble();
             
             triangulos[i]=new Triangulo_Isosceles(base, lado); 
             
         }
         for (int i = 0; i < numTriangulos; i++) {
             System.out.println("El perimetro del triangulo "+(i+1));
             System.out.println("El perimetro es "+ triangulos[i].obtenerPerimetro());
             System.out.println("El area es: "+ triangulos[i].obtenerArea());
             
         }
         
         System.out.println("El area del triangulo de mayor superficie es : "+ mayorArea(triangulos));
     }
}
