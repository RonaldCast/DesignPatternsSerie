
package Factory;

import Factory.Implenete.*;
import Factory.Interface.IConexion;

/*
Esta es la fabrica donde se decide cual es la implenetacion a seleccionar
*/
public class ConexionFabrica {
    public IConexion getConexion(String motor){
        if (motor == null) {
            return null;
        }
        if(motor.equalsIgnoreCase("Mysql")){
         return new ConexionMySQL();
        }
        else if(motor.equalsIgnoreCase("Oracle")){
            return new ConexionOracle();
        }
        else if(motor.equalsIgnoreCase("PostgreSQL")){
            return new ConexionPostgreSQL();
        }
      return null;
    }
}
