/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.prn3;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import sv.uesocc.edu.prn.Usuarios;
import sv.uesocc.edu.prn2.UsuariosFacadeLocal;

/**
 *
 * @author brigels
 */
@Named(value = "form")
@ViewScoped
public class form implements Serializable {

    /**
     * Creates a new instance of form
     */
    @Inject
    private UsuariosFacadeLocal facade;
    Usuarios usuarios = new Usuarios();

    private Integer id;
    private String usuario;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private Date fechaRegistro;
    private short activo;
    private short disponible;
    private String clave;
    private int tipoUsuario;

    public form() {
    }

    public List<Usuarios> todo(){
    return facade.findAll();
    
    }
}
