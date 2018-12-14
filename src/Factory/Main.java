
package Factory;

import Factory.Interface.IConexion;

/*
 Objetivo: devuelve instacia de una clase particular mediante un indentificador
Benefico: codigo flexible a la hora de instaciar ya que no debe de pasar por una 
instancia en especidica, es decir de forma particular  
*/
public class Main {
    public static void main(String[] args){
        ConexionFabrica fabrica = new ConexionFabrica();
        IConexion oracle = fabrica.getConexion("oracle");
        oracle.conectar();
        oracle.desconectar();
        
        IConexion  mysql = fabrica.getConexion("mysql");
        mysql.conectar();
        mysql.desconectar();
    }
    
}
