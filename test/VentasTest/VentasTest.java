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
    private String[] idPedidos() {//Solo retorna  id_pedidos != entregado

        cpedidos func = new cpedidos();

        DefaultTableModel modelo;
        modelo = func.mostrarPedidos();

        //IDS
        String[] ids = new String[modelo.getRowCount()];
        for (int i = 0; i < modelo.getRowCount(); i++) {
            ids[i] = (String) modelo.getValueAt(i, 0);
        }
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
        
        boolean esperado = false;

        mpedidos pedido = new mpedidos();
        cpedidos func = new cpedidos();

        String idPedido = "8";
        for (int i = 0; i < idPedidos().length; i++) {
            if (idPedido == idPedidos()[i]) {
                pedido.setIdtb_pedidos(Integer.parseInt(idPedido));

                Date fechaEnvio = new Date(116, 5, 3);
                String formaEnvio = "Delivery";
                String estadoPedido = "Entregado";
                String direccion = "Villa Salavaje";
                Date fechaEntrega = new Date(116, 7, 10);

                pedido.setFecha_entrega(fechaEntrega);
                pedido.setFecha_envio(fechaEnvio);
                pedido.setForma_envio(formaEnvio);
                pedido.setDireccion_envio(direccion);
                pedido.setEstado_pedido(estadoPedido);
                
                //VALIDACION
                esperado = func.RegistrarVenta(pedido);
            } else {
                esperado = false;
            }    
        }       
        
        //pedido.setIdtb_pedidos(9);
        assertTrue(func.RegistrarVenta(pedido));
    }
    
    @Test
    public void nuevaVenta_002() {
        
        boolean esperado = false;

        mpedidos pedido = new mpedidos();
        cpedidos func = new cpedidos();

        String idPedido = "32";
        for (int i = 0; i < idPedidos().length; i++) {
            if (idPedido == idPedidos()[i]) {
                pedido.setIdtb_pedidos(Integer.parseInt(idPedido));

                Date fechaEnvio = new Date(116, 5, 3);
                String formaEnvio = "Delivery";
                String estadoPedido = "Entregado";
                String direccion = "Villa Salavaje";
                Date fechaEntrega = new Date(116, 7, 10);

                pedido.setFecha_entrega(fechaEntrega);
                pedido.setFecha_envio(fechaEnvio);
                pedido.setForma_envio(formaEnvio);
                pedido.setDireccion_envio(direccion);
                pedido.setEstado_pedido(estadoPedido);
                
                //VALIDACION
                esperado = func.RegistrarVenta(pedido);
            } else {
                esperado = false;
            }    
        }       
        
        assertFalse(func.RegistrarVenta(pedido));
    }

}
