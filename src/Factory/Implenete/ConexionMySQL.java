
package Factory.Implenete;

import Factory.Interface.IConexion;

public class ConexionMySQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
    public ConexionMySQL(){
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena = "123";
    }
    @Override
    public void conectar() {
        System.out.println("Se conecto a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de MySQL");
    }
    
}
