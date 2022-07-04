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
public class mrol {
    private int idtb_rol;
    private String nombre_rol;
    private boolean estado_rol;
    
    public mrol() {
    }

    public mrol(int idtb_rol, String nombre_rol, boolean estado_rol) {
        this.idtb_rol = idtb_rol;
        this.nombre_rol = nombre_rol;
        this.estado_rol = estado_rol;
    }

    public int getIdtb_rol() {
        return idtb_rol;
    }

    public void setIdtb_rol(int idtb_rol) {
        this.idtb_rol = idtb_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public boolean isEstado_rol() {
        return estado_rol;
    }

    public void setEstado_rol(boolean estado_rol) {
        this.estado_rol = estado_rol;
    }
    
    
}
