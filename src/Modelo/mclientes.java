/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author SISTEMAS
 */
public class mclientes {
    private int idtb_cliente;
    private String tipo_cliente;
    private Date fecha_creacion;
    private String nombre_cliente;
    private String correo_cliente;
    private int telefono_cliente;
    private String direccion_cliente;
    
    
    public mclientes() {
    }

    public mclientes(int idtb_cliente, String tipo_cliente, Date fecha_creacion, String nombre_cliente, String correo_cliente, int telefono_cliente, String direccion_cliente) {
        this.idtb_cliente = idtb_cliente;
        this.tipo_cliente = tipo_cliente;
        this.fecha_creacion = fecha_creacion;
        this.nombre_cliente = nombre_cliente;
        this.correo_cliente = correo_cliente;
        this.telefono_cliente = telefono_cliente;
        this.direccion_cliente = direccion_cliente;
    }

    public int getIdtb_cliente() {
        return idtb_cliente;
    }

    public void setIdtb_cliente(int idtb_cliente) {
        this.idtb_cliente = idtb_cliente;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }
    
    
}
