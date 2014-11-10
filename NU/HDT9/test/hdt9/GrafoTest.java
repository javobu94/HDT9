/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hdt9;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier Bucaro
 */
public class GrafoTest {
    
    public GrafoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Grafo.
     */
    @Test
    public void testAdd() {
        System.out.println("Guatemala");
        Object label = 5;
        Grafo instance = new Grafo();
        instance.add(label);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addEdge method, of class Grafo.
     */
    @Test
    public void testAddEdge() {
        System.out.println("addEdge");
        Object vtx1 = "Paris";
        Object vtx2 = "Argentina";
        Object label = 5;
        Grafo instance = new Grafo();
        instance.addEdge(vtx1, vtx2, label);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of show method, of class Grafo.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        Grafo instance = new Grafo();
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of size method, of class Grafo.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Grafo instance = new Grafo();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIndex method, of class Grafo.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex");
        Object label = null;
        Grafo instance = new Grafo();
        int expResult = 0;
        int result = instance.getIndex(label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of contains method, of class Grafo.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object label = null;
        Grafo instance = new Grafo();
        boolean expResult = false;
        boolean result = instance.contains(label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
