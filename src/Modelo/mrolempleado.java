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
public class mrolempleado {
    private int idtb_rol;
    private int idtb_empleado;
    
    public mrolempleado() {
    }

    public mrolempleado(int idtb_rol, int idtb_empleado) {
        this.idtb_rol = idtb_rol;
        this.idtb_empleado = idtb_empleado;
    }

    public int getIdtb_rol() {
        return idtb_rol;
    }

    public void setIdtb_rol(int idtb_rol) {
        this.idtb_rol = idtb_rol;
    }

    public int getIdtb_empleado() {
        return idtb_empleado;
    }

    public void setIdtb_empleado(int idtb_empleado) {
        this.idtb_empleado = idtb_empleado;
    }
    
    
}
