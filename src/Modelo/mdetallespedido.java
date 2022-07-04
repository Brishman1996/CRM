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
public class mdetallespedido {
    private int idtb_pedido;
    private int idtb_producto;
    private int cant_producto;
    private Double precio_unidad;
    private Double descuento;
    
    public mdetallespedido() {
    }

    public mdetallespedido(int idtb_pedido, int idtb_producto, int cant_producto, Double precio_unidad, Double descuento) {
        this.idtb_pedido = idtb_pedido;
        this.idtb_producto = idtb_producto;
        this.cant_producto = cant_producto;
        this.precio_unidad = precio_unidad;
        this.descuento = descuento;
    }

    public int getIdtb_pedido() {
        return idtb_pedido;
    }

    public void setIdtb_pedido(int idtb_pedido) {
        this.idtb_pedido = idtb_pedido;
    }

    public int getIdtb_producto() {
        return idtb_producto;
    }

    public void setIdtb_producto(int idtb_producto) {
        this.idtb_producto = idtb_producto;
    }

    public int getCant_producto() {
        return cant_producto;
    }

    public void setCant_producto(int cant_producto) {
        this.cant_producto = cant_producto;
    }

    public Double getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(Double precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
    
    
    
}
