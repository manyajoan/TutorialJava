
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author conan
 */
public class Operacion {
    //Atributos
    //int numero1; 
    //int numero2;
    //int suma;
    //int resta;
    //int multiplicacion;
    //int division; 
    
    //Atributos globales
    
    
    
    // Declaracion del Metodos 
    
    //Metodo para perdirle al usuario que nos digite 2 numeros 
    
    public void leerNumeros(){
        //numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introdueix numero 1: "));
        //numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introdueixi numero 2: "));
        
    }
    
    public int sumar(int numero1, int numero2 ){
       // suma = numero1 + numero2;
        int suma = numero1+ numero2; 
        return suma;
    }
    
    public int restar(int numero1, int numero2){
        //resta = numero1 - numero2;
        int resta  = numero1 - numero2; 
        return resta;
    }  
    
    public int multiplicar(int numero1, int numero2){
        //multiplicacion = numero1 * numero2; 
      int  multiplicacion = numero1 * numero2; 
      return multiplicacion;         
    }
    
    public int dividir(int numero1, int numero2){
        //division= numero1 / numero2; 
      int  division = numero1/numero2; 
      return division; 
    }
    /*
     public void mostrarResultados(int suma, int resta, int multiplicacion, int division){
        
         JOptionPane.showMessageDialog(null,"La sumas es"+ suma);
        JOptionPane.showMessageDialog(null, "La resta es"+resta);
        JOptionPane.showMessageDialog(null,"La multiplicacion es"+ multiplicacion);
        JOptionPane.showMessageDialog(null,"La division es"+ division);
       
    }
    
    */
    
    
    
            
}
