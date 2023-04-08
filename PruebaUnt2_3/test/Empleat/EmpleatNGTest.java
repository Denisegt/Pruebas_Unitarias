/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package Empleat;

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
public class EmpleatNGTest {

    public EmpleatNGTest() {
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
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a fallar
     * dando la excepción "MaException" diciendo que el empleado no existe ya
     * que el tipo de empleado le hemos puesto "null"
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut1() throws Exception {
        System.out.println("calculaSalariBrut1");
        String tipusEmpleat = null;
        double vendesMes = 0.0;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 0.0;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a fallar
     * dando la excepción "MaException" diciendo que el empleado no existe ya
     * que el tipo de empleado no es ni "venedor" ni "encarregat"
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut2() throws Exception {
        System.out.println("calculaSalariBrut2");
        String tipusEmpleat = "publicista";
        double vendesMes = 0.0;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 0.0;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a dar un
     * resultado correcto ya que el tipo de empleado es "venedor" esperando un
     * salarioBrut de 1000
     */
    @Test()
    public void testCalculaSalariBrut3() throws Exception {
        System.out.println("calculaSalariBrut3");
        String tipusEmpleat = "venedor";
        double vendesMes = 0;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 1000;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a dar un
     * resultado correcto ya que el tipo de empleado es "encarregat" esperando
     * un salarioBrut de 1500
     */
    @Test()
    public void testCalculaSalariBrut4() throws Exception {
        System.out.println("calculaSalariBrut4");
        String tipusEmpleat = "encarregat";
        double vendesMes = 0;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 1500;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a fallar
     * dando la excepción "MaException" diciendo que el valor no puede ser
     * negativo ya que hemos aplicado que las ventas del mes son -100
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut5() throws Exception {
        System.out.println("calculaSalariBrut5");
        String tipusEmpleat = "encarregat";
        double vendesMes = -100.0;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 1500;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a fallar
     * dando la excepción "MaException" diciendo que el valor no puede ser
     * negativo ya que hemos aplicado que las horas extras son -20
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut6() throws Exception {
        System.out.println("calculaSalariBrut6");
        String tipusEmpleat = "encarregat";
        double vendesMes = 0.0;
        int horesExtra = -20;
        Empleat instance = new Empleat();
        double expResult = 1500;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a fallar
     * dando la excepción "MaException" diciendo que el valor no puede ser
     * negativo ya que hemos aplicado que las horas extras son -40 y las ventas
     * del mes -90. Ambos valores negativos
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut7() throws Exception {
        System.out.println("calculaSalariBrut7");
        String tipusEmpleat = "encarregat";
        double vendesMes = -90.0;
        int horesExtra = -20;
        Empleat instance = new Empleat();
        double expResult = 1500;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a dar un
     * resultado correcto ya que el tipo de empleado es "venedor", y tiene unas
     * ventas del mess de 100, lo que hara un SalarioBruto de 1500
     */
    @Test()
    public void testCalculaSalariBrut8() throws Exception {
        System.out.println("calculaSalariBrut8");
        String tipusEmpleat = "venedor";
        double vendesMes = 1000.0;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 1100;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a dar un
     * resultado correcto ya que el tipo de empleado es "venedor", y tiene unas
     * ventas del mess de 100, y 20 horas extras, lo que hara un SalarioBruto de
     * 1471.4
     */
    @Test()
    public void testCalculaSalariBrut9() throws Exception {
        System.out.println("calculaSalariBrut9");
        String tipusEmpleat = "venedor";
        double vendesMes = 1000.0;
        int horesExtra = 20;
        Empleat instance = new Empleat();
        double expResult = 1471.4;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a dar un
     * resultado correcto ya que el tipo de empleado es "encarregat", y tiene
     * unas ventas del mess de 1500, lo que hara un SalarioBruto de 1600
     */
    @Test()
    public void testCalculaSalariBrut10() throws Exception {
        System.out.println("calculaSalariBrut10");
        String tipusEmpleat = "encarregat";
        double vendesMes = 1500.0;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 1600;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariBrut method, of class Empleat. Este Test va a dar un
     * resultado correcto ya que el tipo de empleado es "encarregat", y tiene
     * unas ventas del mess de 2600, y 10 horas extras, lo que hara un
     * SalarioBruto de 1885.7
     */
    @Test()
    public void testCalculaSalariBrut11() throws Exception {
        System.out.println("calculaSalariBrut11");
        String tipusEmpleat = "encarregat";
        double vendesMes = 2600.0;
        int horesExtra = 10;
        Empleat instance = new Empleat();
        double expResult = 1885.7;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test va a lanzar
     * una excepción del tipo MaException ya que el salario está en negativo
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariNet1() throws Exception {
        System.out.println("calculaSalariNet1");
        double salariBrut = -1200.0;
        Empleat instance = new Empleat();
        double expResult = 0.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test no va a
     * lanzar una excepción del tipo MaException ya que el salario es positivo
     */
    @Test
    public void testCalculaSalariNet2() throws Exception {
        System.out.println("calculaSalariNet2");
        double salariBrut = 1200.0;
        Empleat instance = new Empleat();
        double expResult = 1008.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test va a ser
     * correcto ya que tenemos un salarioBruto de 800 y una retención de 0
     */
    @Test
    public void testCalculaSalariNet3() throws Exception {
        System.out.println("calculaSalariNet3");
        double salariBrut = 800.0;
        Empleat instance = new Empleat();
        double expResult = 800.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test va a ser
     * correcto ya que tenemos un salarioBruto de 1500 y una retención de 16%
     */
    @Test
    public void testCalculaSalariNet4() throws Exception {
        System.out.println("calculaSalariNet4");
        double salariBrut = 1500;
        Empleat instance = new Empleat();
        double expResult = 1260.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test va a ser
     * correcto ya que tenemos un salarioBruto de 1620 y una retención de 20%
     */
    @Test
    public void testCalculaSalariNet5() throws Exception {
        System.out.println("calculaSalariNet5");
        double salariBrut = 1620;
        Empleat instance = new Empleat();
        double expResult = 1296.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test va a ser
     * correcto ya que tenemos un salarioBruto de 1340 y una retención de 16%,
     * lo que hace un resultado de 1125,6, pero tiene una variación en el
     * resultado del 0.5%
     */
    @Test
    public void testCalculaSalariNet6() throws Exception {
        System.out.println("calculaSalariNet6");
        double salariBrut = 1340;
        Empleat instance = new Empleat();
        double expResult = 1125.1;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test va a ser
     * correcto. Estamos probando los límites. Si el salario es 999 no tendrá
     * retención
     */
    @Test
    public void testCalculaSalariNet7() throws Exception {
        System.out.println("calculaSalariNet7");
        double salariBrut = 999.0;
        Empleat instance = new Empleat();
        double expResult = 999.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test va a ser
     * correcto. Estamos probando los límites. Si el salario es 0, incluso en
     * negativo no tendrá retención
     */
    @Test
    public void testCalculaSalariNet8() throws Exception {
        System.out.println("calculaSalariNet8");
        double salariBrut = -0.0;
        Empleat instance = new Empleat();
        double expResult = 0.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test va a ser
     * correcto. Estamos probando los límites. Si el salario es 1000 tendrá una
     * retención del 16%
     */
    @Test
    public void testCalculaSalariNet9() throws Exception {
        System.out.println("calculaSalariNet9");
        double salariBrut = 1000.0;
        Empleat instance = new Empleat();
        double expResult = 840.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalariNet method, of class Empleat. Este test va a ser
     * correcto. Estamos probando los límites. Si el salario es 1501 tendrá una
     * retención del 20%
     */
    @Test
    public void testCalculaSalariNet10() throws Exception {
        System.out.println("calculaSalariNet10");
        double salariBrut = 1501.0;
        Empleat instance = new Empleat();
        double expResult = 1200.8;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
