
package com.mycompany.login.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable {
    @Id
  //  @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id; 
    
    @Basic
    private String nombreUsuario;
    private String contrasenia;
    
    @ManyToOne              // muchos a uno para la bidireccion entre usuario y rol
    @JoinColumn(name="fk_rol") //  se especifica que la fk es el id 
    private Rol unRol;    // instancia al objeto rol 
    
    public Usuario(){
    
    }

    public Usuario(Integer id, String nombreUsuario, String contrasenia, Rol unRol) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.unRol = unRol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }
    
   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia + ", unRol=" + unRol + '}';
    }

    
    
    
    
    
}
