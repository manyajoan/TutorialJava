/**
 *  Ejercicio1 Construir un programa que calcule el area y el perimetro de un 
 * cuadrilatero dada la longitud de sus lados. Los valores de la longitud deberán 
 * introducirse por linea de ordenes. Si es un cuadrado solo se proporcionara la
 * longitud de uno de los lados al constructor. 
 * 
 * 
 */
package Ejercicio1;

/**
 *
 * @author conan
 */
public class Cuadrilatero {
    
    //Atributos
    
    private float lado1;
    private float lado2;
    
    //Metodos 
    //Constructor 
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2; 
       
    }
    
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro = 2* (lado1 +lado2);
        return perimetro; 
    }
    
    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }
    
    
    
      
    
    
    
}
