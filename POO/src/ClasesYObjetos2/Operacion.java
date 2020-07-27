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
public class Operacion {
    
    //Atributos 
    
    int numero1;
    int numero2;
    
    int suma;
    int resta;
    int multiplicacion;
    int division; 
    String saludo;
    
    
    
    
    
    
    //Metodos 
    
    
    //Metodo para pedir al usuario que nos digite dos numeros 

public void leerNumeros(){
    numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
}


public String salutacion(String nombre){
    String saludo = "Hola "+ nombre;
    return saludo; 
}
public void saludar(){
     System.out.println(saludo);
}
public void sumar(){
    suma = numero1 + numero2;
    
}
  public void resta(){
    resta = numero1 - numero2;
    
}
public void multiplicacion(){
    multiplicacion = numero1 * numero2;
    
}
public void division(){
    division = numero1 / numero2;
    
}

public void mostrar(){
   
    System.out.println("La suma de " + numero1 + "+" + numero2 + "=" + suma);
    System.out.println("La resta de " + numero1 + "+" + numero2 + "=" + resta);
    System.out.println("La multiplicacion de " + numero1 + "+" + numero2 + "=" + multiplicacion);
    System.out.println("La division de " + numero1 + "+" + numero2 + "=" + division);
    
}

  
}
