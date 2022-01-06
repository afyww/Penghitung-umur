/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umur;

import static org.testng.Assert.*;

/**
 *
 * @author Asus
 */
public class umurNGTest {
    
    public umurNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of setUmurnya method, of class umur.
     */
    @org.testng.annotations.Test
    public void testSetUmurnya() {
        System.out.println("setUmurnya");
        int pertambahanUmurnya = 0;
        umur instance = new umur();
        instance.setUmurnya(pertambahanUmurnya);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUmur method, of class umur.
     */
    @org.testng.annotations.Test
    public void testGetUmur() {
        System.out.println("getUmur");
        umur instance = new umur();
        int expResult = 0;
        int result = instance.getUmur();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setumurnya method, of class umur.
     */
    @org.testng.annotations.Test
    public void testSetumurnya() {
        System.out.println("setumurnya");
        int i = 0;
        umur instance = new umur();
        instance.setumurnya(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
