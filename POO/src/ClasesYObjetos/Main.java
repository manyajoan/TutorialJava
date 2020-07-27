/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author conan
 */
public class Main {
    public static void main(String []args){

        /*
        //Creo un Objeto de la classe operacion
        
        Operacion op = new Operacion();
        
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
         
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero 2"));
        //Creamos el objeto
        Operacion op = new Operacion();

        //Envio los argumentos 
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);

       
        //El metodo de mostrar.
      //op.mostrarResultados(suma, resta, multiplicacion, division);
        
        System.out.println("La suma es"+op.sumar(n1, n2));
        System.out.println("La resta es: "+op.restar(n1, n2));
        System.out.println("lA MULTIPLICACION ES: "+op.multiplicar(n1, n2));
        System.out.println("La division es: "+op.dividir(n1, n2));
        */
        //*******************EJERCICIOS DEL METODO CONSTRUCTOR******************
        /*
            Persona p1 = new Persona("Joan",27);
        p1.correr();
        Persona p2 =new Persona("47172059L");
        p2.correr(100);
        
        */
    
        Persona p1 = new Persona("joan",27); 
        p1.setEdad(28);
        p1.mostrarDatos();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
