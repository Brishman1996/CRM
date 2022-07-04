/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author SISTEMAS
 */
public class mempleado {
    private int idtb_empleado;
    private int idtb_empresa;
    private boolean estado_empleado;
    private String usuario_empleado;
    private String contraseña;
    private String nombre_empleado;
    private String correo_empleado;
    private int telefono_empleado;
    
    public mempleado() {
    }

    public mempleado(int idtb_empleado, int idtb_empresa, boolean estado_empleado, String usuario_empleado, String contraseña, String nombre_empleado, String correo_empleado, int telefono_empleado) {
        this.idtb_empleado = idtb_empleado;
        this.idtb_empresa = idtb_empresa;
        this.estado_empleado = estado_empleado;
        this.usuario_empleado = usuario_empleado;
        this.contraseña = contraseña;
        this.nombre_empleado = nombre_empleado;
        this.correo_empleado = correo_empleado;
        this.telefono_empleado = telefono_empleado;
    }

    public int getIdtb_empleado() {
        return idtb_empleado;
    }

    public void setIdtb_empleado(int idtb_empleado) {
        this.idtb_empleado = idtb_empleado;
    }

    public int getIdtb_empresa() {
        return idtb_empresa;
    }

    public void setIdtb_empresa(int idtb_empresa) {
        this.idtb_empresa = idtb_empresa;
    }

    public boolean isEstado_empleado() {
        return estado_empleado;
    }

    public void setEstado_empleado(boolean estado_empleado) {
        this.estado_empleado = estado_empleado;
    }

    public String getUsuario_empleado() {
        return usuario_empleado;
    }

    public void setUsuario_empleado(String usuario_empleado) {
        this.usuario_empleado = usuario_empleado;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getCorreo_empleado() {
        return correo_empleado;
    }

    public void setCorreo_empleado(String correo_empleado) {
        this.correo_empleado = correo_empleado;
    }

    public int getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(int telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }
    
    
}
