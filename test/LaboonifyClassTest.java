/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benjamin
 */
public class LaboonifyClassTest {
    
    public LaboonifyClassTest() {
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
     * Test of Laboonify method, of class LaboonifyClass.
     */
    @Test
    public void testLaboonify() {
        System.out.println("Laboonify");
        int[] x = null;
        LaboonifyClass instance = new LaboonifyClass();
        int[] expResult = null;
        int[] result = instance.Laboonify(x);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
