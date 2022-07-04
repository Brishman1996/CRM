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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SISTEMAS
 */
public class cempleados {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    
    public DefaultTableModel listarEmpleados() {
        DefaultTableModel modelo;

        String[] titulos = {"Nombre completo", "Telefono","correo","usuario"};

        String[] registro = new String[4];

        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from tb_empleado";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("nombre_empleado");
                registro[1] = rs.getString("telefono_empleado");
                registro[2] = rs.getString("correo_empleado");
                registro[3] = rs.getString("usuario_empleado");
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    public boolean insertar(mempleado dts) {
        
        sSQL = "insert into tb_empleado (idtb_empleado,idtb_empresa,estado_empleado,usuario_empleado,contraseña,nombre_empleado,correo_empleado,telefono_empleado)"
                + "values (?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getIdtb_empleado());
            pst.setInt(2, 1);
            pst.setBoolean(3, true);
            pst.setString(4, dts.getUsuario_empleado());
            pst.setString(5, dts.getContraseña());
            pst.setString(6, dts.getNombre_empleado());
            pst.setString(7, dts.getCorreo_empleado());
            pst.setInt(8, dts.getTelefono_empleado());
            
            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
