/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos2;

import javax.swing.JOptionPane;

/**
 *
 * @author conan
 */
public class Operador2 {
    
    //Atributos 
    
    //int numero1;
    //int numero2;
    //int suma;
    //int resta;
    //int multiplicacion;
    //int division; 
     
    
    //Metodos 
    
    
    //Metodo para pedir al usuario que nos digite dos numeros 

//public void leerNumeros(){
 //   numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
  //  numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
//}

public int sumar(int numero1, int numero2){
   int suma = numero1 +numero2;
   return suma;
}
  public int resta(int numero1, int numero2){
   int  resta = numero1 - numero2;
   return resta;
}
public int multiplicacion(int numero1, int numero2){
   int multiplicacion = numero1 * numero2;
   return multiplicacion;
}
public int division(int numero1, int numero2){
   int division = numero1 / numero2;
   return division; 
}

//public void mostrar(int suma, int resta, int multiplicacion, int division){
   
    //System.out.println("La suma de  = " + suma);
    //System.out.println("La resta de  = " + resta);
    //System.out.println("La multiplicacion de = " + multiplicacion);
    // System.out.println("La division de  = " + division);
  
    
//}


}
