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
public class mproducto {
    private int idtb_producto;
    private String nombre_producto;
    private Double precio_producto;
    private String stock_producto;
    
    public mproducto() {
    }

    public mproducto(int idtb_producto, String nombre_producto, Double precio_producto, String stock_producto) {
        this.idtb_producto = idtb_producto;
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
        this.stock_producto = stock_producto;
    }

    public int getIdtb_producto() {
        return idtb_producto;
    }

    public void setIdtb_producto(int idtb_producto) {
        this.idtb_producto = idtb_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(String stock_producto) {
        this.stock_producto = stock_producto;
    }
    
}
