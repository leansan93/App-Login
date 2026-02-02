
package com.mycompany.login.logica;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol {
    @Id
  //  @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Basic
    private String Descripcion;
    private String nombreRol ;
    @OneToMany (mappedBy="unRol")
    List<Usuario> listaUsuarios ;

    public Rol() {
    }

    public Rol(int id, String Descripcion, String nombreRol, List<Usuario> listaUsuarios) {
        this.id = id;
        this.Descripcion = Descripcion;
        this.nombreRol = nombreRol;
        this.listaUsuarios = listaUsuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", Descripcion=" + Descripcion + ", nombreRol=" + nombreRol + ", listaUsuarios=" + listaUsuarios + '}';
    }
    
    
    
    
    
}
