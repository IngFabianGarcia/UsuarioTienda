
package controlador;
        
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;


public class controladorEjercicio implements ActionListener{
    agregarUsuario nuevoUsuario;
    conexion conector;
    conectar vistaConexion;
    crear_usuario vistaCrear;

    public controladorEjercicio(agregarUsuario nuevoUsuario, conexion conector, conectar vistaConexion, crear_usuario vistaCrear) {
        this.nuevoUsuario = nuevoUsuario;
        this.conector = conector;
        this.vistaConexion = vistaConexion;
        this.vistaCrear = vistaCrear;
       
        
        this.vistaConexion.setVisible(true);
        this.vistaConexion.setLocationRelativeTo(null);
        this.vistaConexion.btnConectar.addActionListener(this);
        this.vistaCrear.btnCrear.addActionListener(this);
         
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vistaConexion.btnConectar){
            this.conector.Conectar();
        }
        if (e.getSource()== this.vistaConexion.btnConectar){
            this.vistaCrear.setVisible(true);
            this.vistaCrear.setLocationRelativeTo(null);
    }
        
    }
    
    
    
}

  
