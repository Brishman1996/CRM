/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.mpedidos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SISTEMAS
 */
public class cpedidosTest {

    /**
     * Test of mostrarTotalVentas method, of class cpedidos.
     */
    @Test
    public void testMostrarTotalVentas() {
        System.out.println("mostrarTotalVentas");
        cpedidos instance = new cpedidos();
        int expResult = 4;
        int result = instance.mostrarTotalVentas();
        if (result != expResult){
              fail("The test case is a prototype.");
        }
    }
    
    
}
    
    
    
    
 