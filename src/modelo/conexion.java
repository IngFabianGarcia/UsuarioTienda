
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class conexion {
    Connection conexion;
    
    
    public Connection Conectar(){
        try 
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/tienda";
            String usuario = "root";
            String password = "";
            
            conexion = DriverManager.getConnection(url, usuario, password);
            
            return conexion;
            
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se conecto tio.."+e.getMessage());
            return conexion;
        }
        catch(ClassNotFoundException e){
            System.out.println("Error al conectar "+e);
            return conexion;
        }    
    }
}