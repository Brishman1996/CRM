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
public class mcanales {
    private int idtb_canales;
    private String tipo_canal;
    
    public mcanales() {
    }

    public mcanales(int idtb_canales, String tipo_canal) {
        this.idtb_canales = idtb_canales;
        this.tipo_canal = tipo_canal;
    }

    public int getIdtb_canales() {
        return idtb_canales;
    }

    public void setIdtb_canales(int idtb_canales) {
        this.idtb_canales = idtb_canales;
    }

    public String getTipo_canal() {
        return tipo_canal;
    }

    public void setTipo_canal(String tipo_canal) {
        this.tipo_canal = tipo_canal;
    }
    
    
}
