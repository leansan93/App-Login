
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();


    public Usuario ValidarUsuario(String usuario, String contrasenia) {
       Usuario user = null ;
       List<Usuario> listUsuario= controlPersis.traerUsuarios();
        for (Usuario usu : listUsuario){
            if (usu.getNombreUsuario().equals(usuario)){
                     
                if (usu.getContrasenia().equals(contrasenia)){
                        user = usu;
                        return user;  
                }
                else {
                    user= null;
                    return user;  
                    
                    
                }
            }
            else {
                user= null;
            }
        }
        return user;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String contrasenia, String rolRecibido) {
            Usuario usu = new Usuario ();
            Rol rolEncontrado = new Rol();
            
            usu.setNombreUsuario(usuario);
            usu.setContrasenia(contrasenia);
            rolEncontrado = this.traerRol(rolRecibido);
            if (rolEncontrado != null ){
            usu.setUnRol(rolEncontrado);
            }
            
            int id= this.buscarUltimoIdUsuarios(); 
            usu.setId(id+1);
            controlPersis.crearUsuario(usu);
            
    }

    private Rol traerRol(String rolRecibido) {
        List<Rol> listaRoles = controlPersis.traerRoles();
        for (Rol rol : listaRoles ){
            if (rol.getNombreRol().equals(rolRecibido)){
                return rol ;
            }
        }
        return null ;
    }

    private int buscarUltimoIdUsuarios() {
        List<Usuario> listaUsuarios = this.traerUsuarios();
        Usuario usu = listaUsuarios.get(listaUsuarios.size()-1);
        return usu.getId();
    }

    public void borrarUsuario(int id_usuario) {
        controlPersis.borrarUsuario(id_usuario);
    }

    public Usuario traerUsuario(int id_usuario) {
        return controlPersis.traerUsuario(id_usuario);
    }

    public void EditarUsuario(Usuario usu , String usuario, String contrasenia, String rolRecibido) {
            Rol rolEncontrado = new Rol (); 
        
            usu.setNombreUsuario(usuario);
            usu.setContrasenia(contrasenia);
            
            rolEncontrado = this.traerRol(rolRecibido);
            if (rolEncontrado != null ){
            usu.setUnRol(rolEncontrado);
            }
            
            controlPersis.EditarUsuario(usu);
    }

   

    
    
    
    
}
