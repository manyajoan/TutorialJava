/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author conan
 */
public class Info {
    
    
      /*
        Un Objeto tiene atributos que son las caracteristicas o propiedades
        Metodos: acciones que realiza el objeto 
        
        Un onbjecto tambien puede ser algo ficticio, mientras tenga atributos y
        metodos. 
        
        Clases: Conjunto de objetos con caracteristicas similares
        Ejemplo: Cotxe es un objeto
        
                  Coche         Primero creamos las classe y allí instanciamos atributos o metodos   
                -----------     Ahora creamos coche 1
                -color          
                -marca
                -km                  Coche1           Coche2
               ---------           ----------         --------
               encender()           Blanco            Rojo
               acelerar()           Audi              Ferrari
               frenar()             0                 100 
         
        A cada uno de los objetos les puede poner los metodos que tengo en la classe
        
        COMO CREAR UNA CLASE:
        
        public: modificador de acceso
        coche: nombre de la classe mayuscula y en singular
        
        public class Coche {
        
        
        
        
         }
        COMO CREAR UN OBJECTO: 
        Coche: nombre de la clase
        coche1: nombre del objeto
        Coche(): constructores 
        
        Coche coche1 = new Coche(); 
        Coche coche2 = new Coche(); 
        
    
       CONCEPTO Y CREACION DE METODOS 
       
      Un metodo es una accion o comportamiento de objetos 
        
        public= modificador de acceso 
        void= valor de retorno
        metodo= nombre del metodo
        ( )= Argumentos 
        public void metodo ( ) {




                 }
    
    // Metodos: parametros y argumentos 
    
    
    Parametros: es una DECLARACION de variable o una declaracion de objeto. 
    Argumentos: Es un valor que se envia 
    
    micoche.acelerar()
    
    Pero no le digo cuanto tiene que acelerar, por eso sirven los parametros y argumentos 
    para decir quanto tiene que realizar (indicar un dato caon el que tiene que trabajr) 
    
    // Declaracion del metodo
    public void metodo (inta , String b ) { // declaramos parametros
     


                 }
    
    
    
    // Invocacion del metodo (despues de crear el metodo) 
    
    objeto.metodo(     1,"Hola"    ); // colocamos argumentos 
    
    *************************************************************************
    //Metodos retorno de valores 
    
    public int sumar ( int a, int b) {
    int suma = a+ b;
    
    return suma ; 
    }
    
    ---> Si vamos al main 
    int suma = objeto.sumar(5,4); 
    System.out.println("La suma es: "+suma);
    
    o tambien puedes imprimir directamente el :
    
    System.out.println("La suma es: "+objeto.sumar(5,4));
    
    OTRO ejemplo*****************************************************
   
    public String saludar (String nombre){
    
     String saludo = "Hola" + nombre; 
      
     retunr saludo;
    }
    
    String saludo = objeto.saludo("Alejandr"); 
    System.out.println(saludo);
    
    //************************************************************************
    
    No todas las classes es obligatorio que tengan atributos o metodos. 
    
    
    //*******************************************CONSTRUCTOR********************
    
    
    Un constructor es un metodo especial de una clase que se invoca siempre que 
    se crea un objeto de esa clase 
    
    
    CUANDO SE CREA UN OBJETO OCURREN TRES COSAS:
    
    - Se asigna memoria para el objeto 
    - Se inicializan los atributos de ese objeto
    - Se invoca al constructor de la clase que puede ser uno entre varios 
    
    
    
    Persona p1 = new Persona(); 
                 ----> Esto es el constructor, como lleva parentesis es un metodo. 
    
    
    Caracteristicas de los constructores 
    
    Tienen el mismo nombre que la classe 
    No devuelven ningun valor 
    Son publicos 
    
    
    
    //****************************Getters y Setters*****************************
    
    Los encapsulamientos sirven para que no todo el mundo pueda tomar los datos de tu classe
    y hacer lo que quieran. 
    
    Sirve para limitar para que no puedas tener por ejemplo un objeto persona con el atributo edad 
    y que sea de 1000 años. 
    
    Un atributo tiene dos partes la que se rellena el atributo y la parte para mostrar. 
    
    SET= Establedcer
    
    
    //*****************************Miembros de una classe***********************
    
    Los miembros de una classe son los getters y setters 
    Los atributos de tipo estatico la classe es dueña de los atributos.
    Tambi8en hay metodos staticos no le pertenecen a los objetos le pertenecen a la classe. 
    
    Cuando es estatico no le pertenece al objeto le pertenece a la clase. Se utiliza qundo quieras canviar un
    atributo y quieres que canvie en todos los objetos. 
    
    
    
    
    
    
    
    
    
    
    
    
    
        
        */
       
        
}
