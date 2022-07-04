/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.mclientes;
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
public class cclientes {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistrosc;
    public Integer totalregistros;
    
    
    
    public int mostrarTotal(){
        totalregistrosc=0;
        
        sSQL="select count(*) from tb_cliente";
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               totalregistrosc = rs.getInt(1);
           }
           return totalregistrosc;

       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return 0;
       }
    }
    
    public DefaultTableModel mostrar() {
        DefaultTableModel modelo;

        String[] titulos = {"Nombre completo", "Tipo cliente", "Correo ", "Telefono", "Direccion"};

        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from tb_cliente order by idtb_cliente desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("nombre_cliente");
                registro[1] = rs.getString("tipo_cliente");
                registro[2] = rs.getString("correo_cliente");
                registro[3] = rs.getString("telefono_cliente");
                registro[4] = rs.getString("direccion_cliente");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    
    
    public boolean insertar(mclientes dts) {
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String currentTime = sdf.format(dt);

        
        
        sSQL = "insert into tb_cliente (idtb_cliente,tipo_cliente,nombre_cliente,correo_cliente,direccion_cliente,telefono_cliente,fecha_creacion)"
                + "values (?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getIdtb_cliente());
            pst.setString(2, "Nuevo");
            pst.setString(3, dts.getNombre_cliente());
            pst.setString(4, dts.getCorreo_cliente());
            pst.setString(5, dts.getDireccion_cliente());
            pst.setInt(6, dts.getTelefono_cliente());
            pst.setString(7, currentTime);
            

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
