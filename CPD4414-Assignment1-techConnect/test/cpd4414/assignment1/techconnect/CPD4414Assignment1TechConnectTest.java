/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.techconnect;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0665336
 */
public class CPD4414Assignment1TechConnectTest {
    
    public CPD4414Assignment1TechConnectTest() {
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
        // test created by gurvinder kaur
    @Test
        public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("testEmptyStringShouldReturnEmptyString");
        String str = "";
        int i = 2;
        String expResult = "";
        String result = CPD4414Assignment1TechConnect.stringPower(str, i);
        assertEquals(expResult, result);
    }
        
        // Test Created by Ruturaj Kalal.
        
          @Test 
     public void testLessThanOneShouldReturnNull(){
         System.out.println("testLessThanOneShouldReturnNull");
       String s = "";
        int i = 0;
        if(i<1){
           
        String expResult = null;
        String result = CPD4414Assignment1TechConnect.stringPower(s, i);
       
        assertEquals(expResult, result);
         
        } 
        
        
        
     }
     
        // Test Created by Ruturaj Kalal.
     
      @Test 
       public void testStringAndOneShouldReturnString(){
           System.out.println("testStringAndOneShouldReturnString");
        String str = "bob";
        int i = 1;
        String expResult = "bob";
        String result = CPD4414Assignment1TechConnect.stringPower(str, i);
        assertEquals(expResult, result);
       }
       
        // Test Created by Cyril Dsouza.
     
      @Test 
       public void testStringAndTwoShouldReturnStringDoubled(){
           System.out.println("testStringAndTwoShouldReturnStringDoubled");
        String str = "bob";
        int i = 2;
        String expResult = "bobbob";
        String result = CPD4414Assignment1TechConnect.stringPower(str, i);
        assertEquals(expResult, result);
       }
    
       
     
}
