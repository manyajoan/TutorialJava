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
public class Persona {
    /*
    ****************************************110 METODO CONSTRUCTOR**************
   
    //Atributos 
    String nombre; 
    int edad; 
    
    
    //Metodos 

    El primer metodo que se deve crear es el metodo constructor , SIEMPRE 
    Son los unicos que no se pone el tipo de retorno.
   
    //Metodo constructor 
    public Persona(String nombre, int edad){
        this.nombre = nombre; //Lo que marcas con this es el atributo y lo que marcas 
        this.edad = edad;    // Lo que esta sin el this es el parametro. 
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    ******************************************111 SOBRECARGA DE METODOS ********
     
    
    //Atributos 
    String nombre;
    int edad; 
    String dni; 
    //Metodos 
    //Metodo constructor Insert code Constructor 
    //Sobrecarga de consturctores  por que tenemos dos constructores 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
   public void correr(){
       System.out.println("Soy "+nombre+" tengo "+edad+" años y estoy corriendo una maraton");
   }
   
   public void correr(int km){
       System.out.println("He corrido "+km+" kilometros");
   }
   */
    private final String nombre; 
     private int edad;
    
    
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("el nombre es: "+nombre);
        System.out.println("la edad es: "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
