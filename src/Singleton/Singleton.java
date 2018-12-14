
package Singleton;

/**
 * El objetivo del patron de diseño:
 * Es crear una unica instacia de una clase durante toda la aplicación.
 * Se usa para optimizar la memoria, es para que un objeto sea usado por muchos 
 * usuarios con una solo instancia
 * @author DELL
 */
public class Singleton {
 
    //Declaración
    private static Singleton instancia;
    
    //Para evitar instacia mediante operador new
    private Singleton(){
        
    }
    
    //Para obtener la instacia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Class.metodo 
    public static Singleton getInstacia(){
        if(instancia == null){
            instancia = new Singleton(); 
        }
        return instancia;
    }
    
    //Método de prueba
    public void conectar(){
        System.out.println("Me conecté a la BD");
    }
    
    //Método de prueba
    public void desconectar(){
        System.out.println("Me desconecté de la BD");
    }
}
