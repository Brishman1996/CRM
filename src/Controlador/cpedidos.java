/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.mdetallespedido;
import Modelo.mpedidos;
import Modelo.mproducto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SISTEMAS
 */
public class cpedidos {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistrosp;
    public Integer totalregistrosv;
    public Integer totalganancias;
    int r;
    
    
    public int mostrarTotalPedidos(){
        
        totalregistrosp=0;
        
        sSQL="select count(*) from tb_pedidos";
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               totalregistrosp = rs.getInt(1);
           }
           return totalregistrosp;

       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return 0;
       }
    }
    
    public int mostrarTotalVentas(){
        totalregistrosv=0;
        
        sSQL="select count(*) from tb_pedidos where estado_pedido = 'Entregado' or estado_pedido = 'Enviado'";
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               totalregistrosv = rs.getInt(1);
           }
           return totalregistrosv;

       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return 0;
       }
    }
    
    
    public int mostrarTotalGanancias(){
        totalganancias=0;
        
        sSQL="SELECT sum(precio_unidad*cant_producto) from tb_pedidos inner join tb_detallespedido on tb_pedidos.idtb_pedidos = tb_detallespedido.idtb_pedidos where estado_pedido = 'Entregado' or estado_pedido = 'Enviado'";
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               totalganancias = rs.getInt(1);
           }
           return totalganancias;

       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return 0;
       }
    }
    
    public DefaultTableModel mostrar() {
        DefaultTableModel modelo;

        String[] titulos = {"Nombre completo cliente", "Telefono","correo","Nombre completo empleado", "Fecha pedido", "Estado de pedido", "Metodo de Pago" , "Total"};

        String[] registro = new String[8];

        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select tb_pedidos.idtb_pedidos,nombre_cliente,telefono_cliente,correo_cliente,nombre_empleado,fecha_pedido,estado_pedido,metodo_pago,sum(precio_unidad*cant_producto) as total_pago  from tb_pedidos inner join tb_cliente on tb_pedidos.idtb_cliente = tb_cliente.idtb_cliente inner join tb_empleado on tb_pedidos.idtb_empleado  = tb_empleado.idtb_empleado inner join tb_detallespedido on tb_pedidos.idtb_pedidos = tb_detallespedido.idtb_pedidos where estado_pedido = 'Entregado' or estado_pedido = 'Enviado' GROUP BY tb_detallespedido.idtb_pedidos order by idtb_pedidos desc";

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
                registro[6] = rs.getString("metodo_pago");
                registro[7] = rs.getString("total_pago");

                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    public DefaultTableModel mostrarPedidos() {
        DefaultTableModel modelo;

        String[] titulos = {"ID","Nombre completo cliente", "Telefono","correo","Nombre completo empleado", "Fecha pedido", "Estado de pedido"};

        String[] registro = new String[7];

        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select idtb_pedidos,nombre_cliente,telefono_cliente,correo_cliente,nombre_empleado,fecha_pedido,estado_pedido,metodo_pago from tb_pedidos inner join tb_cliente on tb_pedidos.idtb_cliente = tb_cliente.idtb_cliente inner join tb_empleado on tb_pedidos.idtb_empleado  = tb_empleado.idtb_empleado where estado_pedido <> 'Entregado' order by idtb_pedidos desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idtb_pedidos");
                registro[1] = rs.getString("nombre_cliente");
                registro[2] = rs.getString("telefono_cliente");
                registro[3] = rs.getString("correo_cliente");
                registro[4] = rs.getString("nombre_empleado");
                registro[5] = rs.getString("fecha_pedido");
                registro[6] = rs.getString("estado_pedido");
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    
    public void consultarEmpleado(JComboBox<String> empleado){
        
        sSQL="SELECT nombre_empleado from tb_empleado";
        
        try {
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {
                empleado.addItem(rs.getString("nombre_empleado"));
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
    }
    
    
    public void consultarCliente(JComboBox<String> cliente){
        
        sSQL="SELECT nombre_cliente from tb_cliente";
        
        try {
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {
                cliente.addItem(rs.getString("nombre_cliente"));
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
    }
    
    public void consultarCanal(JComboBox<String> canal){
        
        sSQL="SELECT tipo_canal from tb_canales";
        
        try {
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {
                canal.addItem(rs.getString("tipo_canal"));
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
    }
    
    public void consultarProductos(JComboBox<String> productos){
        
        sSQL="SELECT nombre_producto from tb_producto";
        
        try {
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {
                productos.addItem(rs.getString("nombre_producto"));
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
    }
    
    public mproducto Buscarpro(String nombre){
        mproducto producto = new mproducto();
        
        sSQL="SELECT * from tb_producto where nombre_producto = '"+ nombre + "'";
        
        try {
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {
                producto.setIdtb_producto(rs.getInt("idtb_producto"));
                producto.setNombre_producto(rs.getString("nombre_producto"));
                producto.setPrecio_producto(rs.getDouble("precio_producto"));       
                producto.setStock_producto(rs.getString("stock_producto"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    }
    
    public int buscarEmpleado(String nombre){
        int idempleado = 0;
        
        sSQL="SELECT idtb_empleado from tb_empleado where nombre_empleado = '"+nombre+"'";
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               idempleado = rs.getInt(1);
           }
           return idempleado;

       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return 0;
       }
    }
    
    public int buscarCliente(String nombre){
        int idcliente = 0;
        
        sSQL="SELECT idtb_cliente from tb_cliente where nombre_cliente = '"+nombre+"'";
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               idcliente = rs.getInt(1);
           }
           return idcliente;

       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return 0;
       }
    }
     
    public int buscarCanal(String nombre){
        int idcanal = 0;
        
        sSQL="SELECT idtb_canales from tb_canales where tipo_canal = '"+nombre+"'";
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               idcanal = rs.getInt(1);
           }
           return idcanal;

       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return 0;
       }
    }

    
    public int RegistrarPedido(mpedidos m){
        
        sSQL="insert into tb_pedidos (idtb_pedidos,idtb_canales,idtb_cliente,idtb_empleado,fecha_pedido,estado_pedido,metodo_pago)" +
               "values (?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setInt(1, m.getIdtb_pedidos());
            pst.setInt(2, m.getIdtb_canales());
            pst.setInt(3, m.getIdtb_cliente());
            pst.setInt(4, m.getIdtb_empleado());
            pst.setDate(5, m.getFecha_pedido());
            pst.setString(6, m.getEstado_pedido());
            pst.setString(7, m.getMetodo_pago());
            pst.execute();
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
        return r;
    }
    
    public int IdVenta(){
        int id = 0;
        sSQL="select max(idtb_pedidos) from tb_pedidos";
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               id = rs.getInt(1);
           }
           return id;

       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return id;
       }
    }
    
    public int RegistrarDetalle(mdetallespedido d){
        Conexion mysqls = new Conexion();
        Connection cns = mysqls.conectar();
    
        sSQL="insert into tb_detallespedido (idtb_pedidos,idtb_producto,cant_producto,precio_unidad,descuento)" +
               "values (?,?,?,?,?)";
        
        try{
            PreparedStatement pst = cns.prepareStatement(sSQL);
            
            pst.setInt(1, d.getIdtb_pedido());
            pst.setInt(2, d.getIdtb_producto());
            pst.setInt(3, d.getCant_producto());
            pst.setDouble(4, d.getPrecio_unidad());
            pst.setDouble(5, 0.00);
            pst.execute();
        }catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try{
                cns.close();
            }catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    public boolean RegistrarVenta(mpedidos m){
         sSQL="update tb_pedidos set fecha_entrega = ?, fecha_envio = ?, forma_envio = ?, direccion_envio = ?, estado_pedido = ? where idtb_pedidos = ? ";
         
         Conexion mysqls = new Conexion();
         Connection cns = mysqls.conectar();
        
         try{
            PreparedStatement pst = cns.prepareStatement(sSQL);
            pst.setDate(1, m.getFecha_entrega());
            pst.setDate(2, m.getFecha_envio());
            pst.setString(3, m.getForma_envio());
            pst.setString(4, m.getDireccion_envio());
            pst.setString(5, m.getEstado_pedido());
            pst.setInt(6, m.getIdtb_pedidos());
            pst.execute();
            return true;
        }catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                cns.close();
            }catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        
    }
    
}
