/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentasTest;

import Controlador.cpedidos;
import Modelo.mpedidos;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.sql.Date;

/**
 *
 * @author SISTEMAS
 */
public class VentasTest {

    public VentasTest() {

    }

    @BeforeClass
    private String[] idPedidos() {
        cpedidos func = new cpedidos();
        
        DefaultTableModel modelo;
        modelo = func.mostrarPedidos();
        
        //IDS
        String[] ids = new String[modelo.getRowCount()];
        for(int i=0; i <modelo.getRowCount(); i++){
            ids[i] = (String) modelo.getValueAt(i, 0);
        }
        System.out.println("ID DE FILA" + ids[1]);
        return ids; 
    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void nuevaVenta_001() {
        
        mpedidos pedido = new mpedidos();
        cpedidos func = new cpedidos();

        String idPedido = "7";
        for(int i=0; i<idPedidos().length; i++ ){
            if(idPedido == idPedidos()[i]){
                pedido.setIdtb_pedidos(Integer.parseInt(idPedido));
            }
        }

        int dia = 3, mes = 5, año = 2022;
        Date fechaEnvio = new Date(año, mes, dia);
        String formaEnvio = "Delivery";
        String estadoPedido = "Enviado";
        String direccion = "Villa Salavaje";
        int diaE = 10, mesE = 7, añoE = 2022;
        Date fechaEntrega = new Date(año, mes, dia);
        
        pedido.setFecha_envio(fechaEnvio);
        pedido.setFecha_entrega(fechaEntrega);
        pedido.setForma_envio(formaEnvio);
        pedido.setEstado_pedido(estadoPedido);
        pedido.setDireccion_envio(direccion);
        
        System.out.println("PROBANDO TEST IDS STRING"+ idPedidos()[1]);
        assertTrue(func.RegistrarVenta(pedido));
    }
    
    @Test
    public void nuevaVenta_002() {
        
        mpedidos pedido = new mpedidos();
        cpedidos func = new cpedidos();

        String idPedido = "10";
        for(int i=0; i<idPedidos().length; i++ ){
            if(idPedido == idPedidos()[i]){
                pedido.setIdtb_pedidos(Integer.parseInt(idPedido));
            }
        }

        int dia = 3, mes = 5, año = 2022;
        Date fechaEnvio = new Date(año, mes, dia);
        String formaEnvio = "Delivery";
        String estadoPedido = "Enviado";
        String direccion = "Villa Salavaje";
        int diaE = 10, mesE = 7, añoE = 2022;
        Date fechaEntrega = new Date(año, mes, dia);
        
        pedido.setFecha_envio(fechaEnvio);
        pedido.setFecha_entrega(fechaEntrega);
        pedido.setForma_envio(formaEnvio);
        pedido.setEstado_pedido(estadoPedido);
        pedido.setDireccion_envio(direccion);
        
        System.out.println("PROBANDO TEST IDS STRING"+ idPedidos()[1]);
        assertFalse(func.RegistrarVenta(pedido));
    }

}
