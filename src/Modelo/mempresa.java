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
public class mempresa {
    private int idtb_empresa;
    private String nombre_empresa;
    private int ruc_empresa;
    private String correo_empresa;
    private int telefono_empresa;
    
    public mempresa () {
        
    }

    public mempresa(int idtb_empresa, String nombre_empresa, int ruc_empresa, String correo_empresa, int telefono_empresa) {
        this.idtb_empresa = idtb_empresa;
        this.nombre_empresa = nombre_empresa;
        this.ruc_empresa = ruc_empresa;
        this.correo_empresa = correo_empresa;
        this.telefono_empresa = telefono_empresa;
    }

    public int getIdtb_empresa() {
        return idtb_empresa;
    }

    public void setIdtb_empresa(int idtb_empresa) {
        this.idtb_empresa = idtb_empresa;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public int getRuc_empresa() {
        return ruc_empresa;
    }

    public void setRuc_empresa(int ruc_empresa) {
        this.ruc_empresa = ruc_empresa;
    }

    public String getCorreo_empresa() {
        return correo_empresa;
    }

    public void setCorreo_empresa(String correo_empresa) {
        this.correo_empresa = correo_empresa;
    }

    public int getTelefono_empresa() {
        return telefono_empresa;
    }

    public void setTelefono_empresa(int telefono_empresa) {
        this.telefono_empresa = telefono_empresa;
    }
    
    
    
    
}
