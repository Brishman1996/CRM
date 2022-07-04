/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.mempresa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SISTEMAS
 */
public class cempresa {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;
    
    public mempresa Buscarempresa(int empresa){
        mempresa me = new mempresa();
        
        sSQL="SELECT * from tb_empresa where idtb_empresa = '"+ empresa + "'";
        
        try {
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {
                me.setIdtb_empresa(rs.getInt("idtb_empresa"));
                me.setNombre_empresa(rs.getString("nombre_empresa"));
                me.setCorreo_empresa(rs.getString("correo_empresa"));       
                me.setRuc_empresa(rs.getInt("ruc_empresa"));
                me.setTelefono_empresa(rs.getInt("telefono_empresa"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return me;
    }
    
    
}
