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
public class mpedidos {
    private int idtb_pedidos;
    private int idtb_canales;
    private int idtb_cliente;
    private int idtb_empleado;
    private Date fecha_pedido;
    private Date fecha_entrega;
    private Date fecha_envio;
    private String forma_envio;
    private String direccion_envio;
    private String estado_pedido;
    private String metodo_pago;
    
    public mpedidos() {
    }

    public mpedidos(int idtb_pedidos, int idtb_canales, int idtb_cliente, int idtb_empleado, Date fecha_pedido, Date fecha_entrega, Date fecha_envio, String forma_envio, String direccion_envio, String estado_pedido, String metodo_pago) {
        this.idtb_pedidos = idtb_pedidos;
        this.idtb_canales = idtb_canales;
        this.idtb_cliente = idtb_cliente;
        this.idtb_empleado = idtb_empleado;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entrega = fecha_entrega;
        this.fecha_envio = fecha_envio;
        this.forma_envio = forma_envio;
        this.direccion_envio = direccion_envio;
        this.estado_pedido = estado_pedido;
        this.metodo_pago = metodo_pago;
    }

    public int getIdtb_pedidos() {
        return idtb_pedidos;
    }

    public void setIdtb_pedidos(int idtb_pedidos) {
        this.idtb_pedidos = idtb_pedidos;
    }

    public int getIdtb_canales() {
        return idtb_canales;
    }

    public void setIdtb_canales(int idtb_canales) {
        this.idtb_canales = idtb_canales;
    }

    public int getIdtb_cliente() {
        return idtb_cliente;
    }

    public void setIdtb_cliente(int idtb_cliente) {
        this.idtb_cliente = idtb_cliente;
    }

    public int getIdtb_empleado() {
        return idtb_empleado;
    }

    public void setIdtb_empleado(int idtb_empleado) {
        this.idtb_empleado = idtb_empleado;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public Date getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getForma_envio() {
        return forma_envio;
    }

    public void setForma_envio(String forma_envio) {
        this.forma_envio = forma_envio;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    
    
    
}
