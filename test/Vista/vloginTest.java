/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Vista;

import Controlador.clogin;
import Modelo.mempleado;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luz Maria
 */
public class vloginTest {
    
    public vloginTest() {
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
     * Test of validar method, of class vlogin.
     */

    @Test
    public void testValidar_01() {
        String usuario= "mariafer";
        String clave="852147";
        mempleado me = new mempleado();
        clogin login = new clogin();
        
        System.out.println("validar");
        boolean esperado=false;
        boolean exitoso=false;
        
        if (!"".equals(usuario) || !"".equals(clave)){
            me = login.log(usuario, clave);
            if(me.getUsuario_empleado() != null && me.getContraseña() != null){
             exitoso=true;
            }else{
               exitoso=false; 
            }
        }else{
            exitoso=true;
        }
        assertFalse(exitoso);
        //verifica el parametro ingresado
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testValidar_02() {
    String usuario= "";
    String clave="";
        mempleado me = new mempleado();
    clogin login = new clogin();
        System.out.println("validar");
        boolean esperado=false;
        boolean exitoso=false;
        
        if (!"".equals(usuario) || !"".equals(clave)){
            me = login.log(usuario, clave);
            if(me.getUsuario_empleado() != null && me.getContraseña() != null){
             exitoso=true;
            }else{
               exitoso=false; 
            }
        }else{
            exitoso=false;
        //que no permita registrar usuarios vacios
        }
        assertTrue(exitoso);
    }

}
    
