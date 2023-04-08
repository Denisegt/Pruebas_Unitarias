/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package Matricad;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DeniseGT
 */
public class MatricadNGTest {

    public MatricadNGTest() {
    }

    static String[] cadenes;
    static String[] vacia;

    @BeforeClass
    public static void setUpClass() throws Exception {
        cadenes = new String[]{"hui", "és", "dilluns", "i", "no", "m'agrada", "gens"}; 	// carrega la matriu de cadenes
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = java.lang.IllegalArgumentException.class)
    public void constructor1() {
        Matricad constructor1 = new Matricad(vacia);
    }

    @Test(expectedExceptions = java.lang.IllegalArgumentException.class)
    public void constructor2() {
        Matricad constructor2 = new Matricad(null);
    }

    @Test
    public void constructor3() {
        Matricad constructor3 = new Matricad(cadenes);
    }

    /**
     * Test of getMaxCad method, of class Matricad. El test da correcto ya que
     * la cadena más larga del array es "m'agrada", el cual hemos asigando como
     * resultado esperado.
     */
    @Test
    public void testGetMaxCad() {
        System.out.println("getMaxCad");
        Matricad instance = new Matricad(cadenes);
        String expResult = "m'agrada";
        String result = instance.getMaxCad();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSumaCaracters method, of class Matricad. El resultado del test
     * es correcto ya que en el array de Strings hay 27 carácteres en total,
     * juntando todas las cadenas
     */
    @Test
    public void testGetSumaCaracters() {
        System.out.println("getSumaCaracters");
        Matricad instance = new Matricad(cadenes);
        int expResult = 27;
        int result = instance.getSumaCaracters();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexDe method, of class Matricad. El test es correcto ya que
     * queremos saber en que índice está la cadena "i" y nos devuelve el índice
     * 3, teniendo en cuenta que el primer índice es 0, el resultado es correcto
     */
    @Test
    public void testGetIndexDe1() {
        System.out.println("getIndexDe1");
        String unaCadena = "i";
        Matricad instance = new Matricad(cadenes);
        int expResult = 3;
        int result = instance.getIndexDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexDe method, of class Matricad. El test da un resultado
     * correcto ya que hemos asignado que lanzará una excepción no marcada si la
     * cadena es nula
     */
    @Test(expectedExceptions = java.lang.IllegalArgumentException.class)
    public void testGetIndexDe2() {
        System.out.println("getIndexDe2");
        String unaCadena = null;
        Matricad instance = new Matricad(cadenes);
        int expResult = 0;
        int result = instance.getIndexDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexDe method, of class Matricad. El test da un resultado
     * correcto ya que hemos asignado que lanzará una excepción no marcada si la
     * cadena es no está en el array "cadenes".
     */
    @Test(expectedExceptions = java.util.NoSuchElementException.class)
    public void testGetIndexDe3() {
        System.out.println("getIndexDe3");
        String unaCadena = "deniso";
        Matricad instance = new Matricad(cadenes);
        int expResult = 0;
        int result = instance.getIndexDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
