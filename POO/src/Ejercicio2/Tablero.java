/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author conan
 */
public class Tablero {
 //Atributos    
    int x;
    int y;
 //Metodos 

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void moverArriba (int incremento){
        y= y+incremento;
        
    }
    
    public void moverAbajo (int incremento){
        y= y-incremento;
    }
      public void moverDerecha (int incremento){
        x=x+incremento;
    }
      public void moverIzquierda (int incremento){
        x=x-incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
      
}
