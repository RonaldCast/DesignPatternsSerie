
package Singleton;
 /*
Crea una unica instancia
*/
public class Main {
    
       public static void main(String[] args) {
        
          // Instanciación por constructor prohíbido por ser "private"
         Singleton sg =  Singleton.getInstacia();
         sg.conectar();
         sg.desconectar();
    }
    
}
