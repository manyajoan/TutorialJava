/*
Estaticos  miembros de clase 
 */
package MiembrosEstaticos;

public class Estatico {
    //Al poner este atributo no le pertenece a la classe le pertenece a los obketos
    //pertenece a la clase EL ULTIMO CAMBIO QUE SE REALICE SERA EL QUE AFECTARA A TODOS LOS OBJETOS
    private static String frase = "Primera frase";
    public static int sumar(int n1, int n2){
        int suma = n1+n2; 
        return suma;
    }
    
    public static void main(String []args){
        //Ahora la classe es la dueña del atributo 
        System.out.println(Estatico.frase);
        System.out.println(Estatico.sumar(3, 2));
        
    }

    
}
