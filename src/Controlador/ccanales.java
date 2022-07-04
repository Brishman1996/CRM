/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.mcanales;
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
public class ccanales {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    
    
    public DefaultTableModel mostrar(int Canal) {
        DefaultTableModel modelo;

        String[] titulos = {"Nombre completo cliente", "Telefono","correo","Nombre completo empleado", "Fecha pedido", "Estado de pedido"};

        String[] registro = new String[6];

        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from tb_pedidos inner join tb_cliente on tb_pedidos.idtb_cliente = tb_cliente.idtb_cliente inner join tb_empleado on tb_pedidos.idtb_empleado  = tb_empleado.idtb_empleado where idtb_canales = "
                + Canal + " order by idtb_pedidos desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("nombre_cliente");
                registro[1] = rs.getString("telefono_cliente");
                registro[2] = rs.getString("correo_cliente");
                registro[3] = rs.getString("nombre_empleado");
                registro[4] = rs.getString("fecha_pedido");
                registro[5] = rs.getString("estado_pedido");

                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    public boolean insertar(mcanales dts) {
       
        sSQL = "insert into tb_canales (idtb_canales,tipo_canal)"
                + "values (?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getIdtb_canales());
            pst.setString(2, dts.getTipo_canal());

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
