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
public class Main1 {

  
    
    public static void main (String[]args){
     //   Operacion op = new Operacion();
        
     //   op.leerNumeros();
     //   op.sumar();
     //   op.resta();
     //   op.multiplicacion();
     //  op.division();
     //   op.mostrar();
     
     int n1 =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
     int n2 =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));  
     
     Operacion ope = new Operacion();
     
     ope.salutacion("Joan");
     
  
     Operador2 op = new Operador2();
     
        System.out.println("La suma es: "+op.sumar(n1, n2));
        int resta= op.resta(n1, n2);
        op.multiplicacion(n1, n2);
        op.division(n1, n2);
    
   //  op.mostrar(suma, resta, mult, div);
   
   
    }
    
    
    
    
}
