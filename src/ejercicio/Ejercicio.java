
package ejercicio;
        

        
import modelo.*;
import controlador.*;
import vista.*;
        

public class Ejercicio {

    
    public static void main(String[] args) {
        conectar vistaConexion = new conectar();
        crear_usuario VistaCreacion = new crear_usuario();
        agregarUsuario agregarUsuarioModel = new agregarUsuario();
        conexion conector = new conexion();
        
        controladorEjercicio controlador = new controladorEjercicio(agregarUsuarioModel, conector, vistaConexion, VistaCreacion);
        
        
    }
    
}
