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
import java.util.Random;

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
     * tests whether the laboonified array has one more element than the input array
     */
    @Test
    public void testLaboonifySize() {
        System.out.println("Laboonify");
        int[][] testHolder=new int[100][];
        for(int i=0;i<testHolder.length;i++){
            Random rand=new Random();
            int arraySize=rand.nextInt(100)+1;
            int[] holderArray=new int[arraySize];
            for(int j=0;j<arraySize;j++){
                holderArray[j]=(rand.nextInt(100)+1);
            }
            testHolder[i]=holderArray;
        }
        //int[] x = null;
        LaboonifyClass instance = new LaboonifyClass();
        for (int i=0;i<testHolder.length;i++){
            int expResult = (testHolder[i].length)+1;
            int result = instance.Laboonify(testHolder[i]).length;
            assertEquals(expResult, result);    
        }
    }
    /**
     * Test of Laboonify method, of class LaboonifyClass.
     * tests whether the laboonified array has all the values of the original array squared
     */
    @Test
    public void testLaboonifySquare() {
        System.out.println("Laboonify");
        int[][] testHolder=new int[100][];
        for(int i=0;i<testHolder.length;i++){
            Random rand=new Random();
            int arraySize=rand.nextInt(100)+1;
            int[] holderArray=new int[arraySize];
            for(int j=0;j<arraySize;j++){
                holderArray[j]=(rand.nextInt(100)+1);
            }
            testHolder[i]=holderArray;
        }
        //int[] x = null;
        LaboonifyClass instance = new LaboonifyClass();
        for (int i=0;i<testHolder.length;i++){
            for (int j=0;j<testHolder[i].length;j++){
                int expResult = ((testHolder[i])[j])*((testHolder[i])[j]);
                int result = (instance.Laboonify(testHolder[i]))[j];
                assertEquals(expResult, result);
            }
        }
    }
    
    
    /*
    @Property(trials = 100)
    public void testAddition(int number) {

        System.out.println("Generated number for testAddition: " + number);

        Calculator calculator = new Calculator();
        calculator.add(number);
        assertEquals(calculator.getResult(), number);
    }
    */
    
}
