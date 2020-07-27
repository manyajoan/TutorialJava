// MODIFICADORES DE ACCESO 


package paquete1;

public class Clase1 {
    /*
    
   
    //al poner un atributo en public puede acceder cualquiera sea del mismo paquete o no. 
    public int atributo1; 
    //SI el modificador de acceso es private restringe para metodos de la clase1 
     */
    
    //Encapsulamiento es ocultar algunos datos para que no cualquiera pueda utilizarlos
    //Para poder tratar estos datos en otras classes tienes que utilizar los metodos accesores getters y setters
    
  
    //METODO SETTER!!!!!!!  
    //SET = Establecer LA EDAD
    private int edad;
    private String nombre; 

    public void setEdad(int edad) {
        this.edad = edad;
    }

  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    //METODO GETTER MOSTRAMOS LA EDAD
     //private int edad;
    public int getEdad(){
        return edad;
    }
      public String getNombre() {
        return nombre;
    }
    
    
    
    

}
