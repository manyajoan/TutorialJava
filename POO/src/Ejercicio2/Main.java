/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author conan
 */
public class Main {
     public static void main(String []args){
         Scanner entrada = new Scanner (System.in);
         Tablero t1;
         int x,y,opcion=0,incremento=0;
         
         System.out.println("Introduzca un valor para la X");
          x= entrada.nextInt();
          System.out.println("Introduzca un valor para la Y");
          y= entrada.nextInt();
         
         t1 = new Tablero(x,y);
         
      do{
          System.out.println("\n\t****************MENU*******************");
          System.out.println("1. Mover ARRIBA");
          System.out.println("2. Mover ABAJO");
          System.out.println("3. Mover DERECHA");
          System.out.println("4. Mover IZQUIERDA");
          System.out.println("Digite la opcion: ");
          opcion = entrada.nextInt();
          
          if (opcion!=5) {
              
              System.out.println("Digite la cantidad de espacios para moverte:");
              incremento = entrada.nextInt();
          }
          switch(opcion){
              case 1: t1.moverArriba(incremento);break;
              case 2: t1.moverAbajo(incremento);break;
              case 3: t1.moverDerecha(incremento);break;
              case 4: t1.moverIzquierda(incremento);break;
              case 5: break;
              default: System.out.println("Error en la opcion de menu!!!");        
          }
          
          System.out.println("Posicion actual [x,y]: " +t1.getX()+","+ t1.getY());
          
      }while(opcion !=5);
         
     }        
         
}
