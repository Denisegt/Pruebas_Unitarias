/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package vocals;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class VocalsNGTest {

    public VocalsNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
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

    /**
     * Test of esVocal method, of class Vocals.
     */
    @Test(expectedExceptions = java.lang.NullPointerException.class)
    public void testEsVocal1() {
        System.out.println("esVocal1");
        String lletra = null;
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test()
    public void testEsVocal2() {
        System.out.println("esVocal2");
        String lletra = "a";
        Vocals instance = new Vocals();
        boolean expResult = true;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test()
    public void testEsVocal3() {
        System.out.println("esVocal3");
        String lletra = "A";
        Vocals instance = new Vocals();
        boolean expResult = true;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test()
    public void testEsVocal4() {
        System.out.println("esVocal4");
        String lletra = "á";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test()
    public void testEsVocal5() {
        System.out.println("esVocal5");
        String lletra = "ao";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test()
    public void testEsVocal6() {
        System.out.println("esVocal6");
        String lletra = "b";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    //Extras:
    
    @Test()
    public void testEsVocal7() {
        System.out.println("esVocal77");
        String lletra = "B";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test()
    public void testEsVocal8() {
        System.out.println("esVocal8");
        String lletra = "5";
        Vocals instance = new Vocals();
        boolean expResult = false;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
