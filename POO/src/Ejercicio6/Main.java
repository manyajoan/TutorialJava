/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author conan
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
          numero1 = a + bi
          numero2 = c + di
         */
        NumeroComplejo numero1, numero2, suma, mult;
        double a, b, c, d;
        int opcion, numero;
        do {
            System.out.println("\t OPERACIONES CON NUMEROS COMPLEJOS:  ");
            System.out.println("1. Sumar");
            System.out.println("2.Multiplicar");
            System.out.println("3. Comparar");
            System.out.println("4. Multiplicar entero * complejo");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Sumar");
                    System.out.println("Digite el primer numero complejo");
                    a = entrada.nextDouble();
                    System.out.println("Digite la parte  imaginaria del segundo i ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el segundo numero complejo");
                    c = entrada.nextDouble();
                    System.out.println("Digite la parte del segundo  imaginaria i ");
                    d = entrada.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    suma = numero1.calcularSuma(numero2);
                    System.out.println("La suma es: " + suma.getA() + " " + suma.getB() + "i");

                    break;
                case 2:
                    System.out.println("2.Multiplicar");
                    System.out.println("Digite el primer numero complejo");
                    a = entrada.nextDouble();
                    System.out.println("Digite la parte  imaginaria del segundo i ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el segundo numero complejo");
                    c = entrada.nextDouble();
                    System.out.println("Digite la parte del segundo  imaginaria i ");
                    d = entrada.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    mult = numero1.calcularProducto(numero2);
                    System.out.println("La multiplicacion es: " + mult.getA() + " " + mult.getB() + "i");
                    break;

                case 3:
                    System.out.println("3. Comparar");
                    System.out.println("Digite el primer numero complejo");
                    a = entrada.nextDouble();
                    System.out.println("Digite la parte  imaginaria del segundo i ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el segundo numero complejo");
                    c = entrada.nextDouble();
                    System.out.println("Digite la parte del segundo  imaginaria i ");
                    d = entrada.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    System.out.println("La igualdad es: " + numero1.comprobarIgualdad(numero2));
                    break;

                case 4:
                    System.out.println("4. Multiplicar entero * complejo");
                    System.out.println("Digite el primer numero complejo");
                    a = entrada.nextDouble();
                    System.out.println("Digite la parte  imaginaria del segundo i ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el numero a multiplicar");
                    numero = entrada.nextInt();

                    numero1 = new NumeroComplejo(a, b);
                    mult = numero1.multiplicarPorEntero(numero);

                    System.out.println("La multiplicar por un entero es: " + mult.getA() + "+" + mult.getB());
                    break;

                case 5:
                    System.out.println(" ADEEEUUUU");

                    break;

            }

        } while (opcion != 5);

    }

}
