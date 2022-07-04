/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.mempleado;
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
public class cloginTest {
    
    public cloginTest() {
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
     * Test of log method, of class clogin.
     */
    @Test
    public void testLog() {
        System.out.println("log");
        String usuario = "batto";
        String clave = "123456";
        clogin instance = new clogin();
        String expResult = null;
        mempleado result = instance.log(usuario, clave);
        if (result.getUsuario_empleado() == expResult){
              fail("The test case is a prototype.");
        }
    }
    
}
    
