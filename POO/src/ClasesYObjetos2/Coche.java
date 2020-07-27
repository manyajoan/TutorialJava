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
public class Coche {
    
    //Atributos    
    
    String color; 
    String marca; 
    int km; 
    
    //metodos 
   
    public static void main(String [] args){
        
        Coche coche1 = new Coche();
        Coche coche2 = new Coche(); 
        
        
        coche1.color= "blanco";
        coche1.marca= "Audi";
        coche1.km=0;
        
        System.out.println("El color del coche1 es: "+ coche1.color);
        System.out.println("La marca del coche1 es: "+ coche1.marca);
        System.out.println("El kilometraje del coche1 es: "+coche1.km);
        
        coche2.color="rojo";
        coche2.marca="Ferrari";
        coche2.km=10;
        
        System.out.println(" ");
        
        System.out.println("El color del coche2 es: "+ coche2.color);
        System.out.println("La marca del coche2 es: "+ coche2.marca);
        System.out.println("El kilometraje del coche2 es: "+coche2.km);
    }
    
    
}
