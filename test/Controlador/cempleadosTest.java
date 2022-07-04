/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.mempleado;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SISTEMAS
 */
public class cempleadosTest {
    
    public cempleadosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of insertar method, of class cempleados.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        mempleado dts = new mempleado();
        dts.setIdtb_empleado(5);
        dts.setIdtb_empresa(1);
        dts.setUsuario_empleado("Pperez");
        dts.setContraseña("qaz789");
        dts.setNombre_empleado("Pepito Perez");
        dts.setCorreo_empleado("pperez@mail.com");
        dts.setTelefono_empleado(789456123);
        dts.setEstado_empleado(true);
        cempleados instance = new cempleados();
        boolean expResult = true;
        boolean result = instance.insertar(dts);
        if (result != expResult){
           fail("El empleado ya se encuentra registrado");
        }
    }
}
