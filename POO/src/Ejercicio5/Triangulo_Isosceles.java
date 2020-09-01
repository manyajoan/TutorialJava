/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author conan
 */
public class Triangulo_Isosceles {
    //Atributos 
    
    double base;
    double lado; 
    
    //Metodos 

    public Triangulo_Isosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double obtenerPerimetro(){
        double perimetro = 2* lado + base;
        return perimetro;
    }
    
    public double obtenerArea(){
        double area= base * (Math.sqrt((lado*lado) - (base*base/4))/2);
        return area;
    }
    
}
