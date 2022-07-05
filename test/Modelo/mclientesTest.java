/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import Controlador.cclientes;
import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author canow
 */
public class mclientesTest {

    public mclientesTest() {
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

    @Test
    public void testRegistro_cliente_Caso_01(){
        //registro nuevo cliente
        //valores de entrada
        String nombre = "fredy";
        String direccion = "Villa el Salvador";
        String correo = "fredy@gmail.com";
        int telefono = 33333333;

        mclientes registro = new mclientes();

        System.out.println("Registro_clientes");

        registro.setNombre_cliente(nombre);
        registro.setDireccion_cliente(direccion);
        registro.setCorreo_cliente(correo);
        registro.setTelefono_cliente(telefono);

        System.out.println("Registro_BaseDeDatos_clientes");

        cclientes clienteNuevo = new cclientes();

        boolean exitoso = false;

        exitoso = clienteNuevo.insertar(registro);
        //resultado esperado true
        assertTrue(exitoso);
    }
    
    public void testRegistro_cliente_Caso_02(){
        //registro de datos de vacios
        String nombre = "";
        String direccion = "";
        String correo = "";
        int telefono = 0;

        mclientes registro = new mclientes();

        System.out.println("Registro_clientes");

        registro.setNombre_cliente(nombre);
        registro.setDireccion_cliente(direccion);
        registro.setCorreo_cliente(correo);
        registro.setTelefono_cliente(telefono);

        System.out.println("Registro_BaseDeDatos_clientes");

        cclientes clienteNuevo = new cclientes();

        boolean exitoso = false;

        exitoso = clienteNuevo.insertar(registro);
        //resultado esperado false
        assertFalse(exitoso);
    }
    
    public void testRegistro_cliente_Caso_03(){
        //Registro con datos existentes correo y telf
        String nombre = "Brishman";
        String direccion = "abc";
        String correo = "fredy@gmail.com";
        int telefono = 33333333;

        mclientes registro = new mclientes();

        System.out.println("Registro_clientes");

        registro.setNombre_cliente(nombre);
        registro.setDireccion_cliente(direccion);
        registro.setCorreo_cliente(correo);
        registro.setTelefono_cliente(telefono);

        System.out.println("Registro_BaseDeDatos_clientes");

        cclientes clienteNuevo = new cclientes();

        boolean exitoso = false;

        exitoso = clienteNuevo.insertar(registro);
        //resultado esperado true
        assertTrue(exitoso);
    }

}
