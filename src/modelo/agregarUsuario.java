package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import modelo.conexion;

/**
 *
 * @author umg
 */
public class agregarUsuario {
    private String usuario;
    private String password;
    private Connection myConexion;

    public agregarUsuario(String usuario, String password, Connection myConexion) {
        this.usuario = usuario;
        this.password = password;
        this.myConexion = myConexion;
    }
    public agregarUsuario() {
    }

    public Connection getMyConexion() {
        return myConexion;
    }

    public void setMyConexion(Connection myConexion) {
        this.myConexion = myConexion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void CrearUsuario(String usuario, String password)
    {
        try
        {
          conexion nuevaConexion = new conexion();
          this.myConexion = nuevaConexion.Conectar();
          Statement sentencia = myConexion.createStatement();
          sentencia.execute("insert into PERSONAS values('"+this.getUsuario()+"', '"+this.getPassword()+"')");
          
        }
        catch(SQLException e)
        {
         JOptionPane.showMessageDialog(null, "error al crear usuario..."+e.getMessage());   
        }
    }
}
    
    
    
    
    

