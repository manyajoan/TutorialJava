/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author conan
 *
 * Suma de numeros complejos numero1 = 3 +4i numero2= 2+5i
 *
 * suma= 5 + 9i
 *
 * NumeroComplejo numero1 = new NumeroComplejo(3,4);
 * numero1.calcularSuma(numero2)
 */
public class NumeroComplejo {

    //Atributos 
    private double a; //Parte real
    private double b; //Parte imaginaria 

    //Constructor
    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    /* SUMA
     numero1 = 3 +4i 
     numero2=  2 +5i
     suma= 5 + 9i
     NumeroComplejo numero1 = new NumeroComplejo(3,4);
      numero1.calcularSuma(numero2)
     */
    public NumeroComplejo calcularSuma(NumeroComplejo c) {
        NumeroComplejo suma = new NumeroComplejo(a + c.getA(), b + c.getB());
        return suma;
    }

    /* MULTIPLICACION
      numero1 = 3 + 4i 
      numero2=  2 + 5i
      mult= ( 3*2 -4*5) + (3*5 + 4*2)
     */
    public NumeroComplejo calcularProducto(NumeroComplejo c) {
        NumeroComplejo mult = new NumeroComplejo((a * c.getA() - b * c.getB()), (a * c.getB() + b * c.getA()));
        return mult;
    }

    /* IGUALACION
      numero1 = 3 + 4i 
      numero2=  3 + 4i
     */
    public boolean comprobarIgualdad(NumeroComplejo c) {
        boolean igualdad = false;
        if ((a == c.getA()) && (b == c.getB())) {
            igualdad = true;
        } 
        return igualdad;
    }
    
    /* MULTIPLICACION DE UN NUMERO ENTERO POR UN NUMERO COMPLEJO 
    
    numeroCOmplejo= 3+ 4i
    entero= 2; 
    
    mult= 6 +8i; 
    
    */
    
    public NumeroComplejo  multiplicarPorEntero(int e){
        
        NumeroComplejo multCom= new NumeroComplejo(e*a,e*b); 
        
        return multCom;
    }
    
    

}
