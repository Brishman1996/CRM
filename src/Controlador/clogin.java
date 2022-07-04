/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.mempleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class clogin {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    
    public mempleado log(String usuario, String clave){
        mempleado me = new mempleado();
        sSQL="select * from tb_empleado where usuario_empleado = ? and contraseña = ?";
        
        try {
           
           PreparedStatement pst = cn.prepareStatement(sSQL);
           pst.setString(1, usuario);
           pst.setString(2, clave);
           ResultSet rs = pst.executeQuery();
           
           while (rs.next()) {
               me.setIdtb_empleado(rs.getInt("idtb_empleado"));
               me.setNombre_empleado(rs.getString("nombre_empleado"));
               me.setCorreo_empleado(rs.getString("correo_empleado"));
               me.setUsuario_empleado(rs.getString("usuario_empleado"));
               me.setContraseña(rs.getString("contraseña"));
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return me;
    }
}
