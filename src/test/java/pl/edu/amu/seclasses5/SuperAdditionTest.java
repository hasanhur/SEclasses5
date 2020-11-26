/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.seclasses5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jsiwek
 */
public class SuperAdditionTest {
    
    public SuperAdditionTest() {
    }

    @Test
    public void testSuperaddition() {
        System.out.println("superaddition");
        String a = "1";
        String b = "2";
        String expResult = "4";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    public void testSuperadditionKS1() {
        System.out.println("superadditionKS");
        String a = "2";
        String b = "3";
        String expResult = "8";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    public void testSuperadditionKS2() {
        System.out.println("superadditionKS");
        String a = "1";
        String b = "3";
        String expResult = "6";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    public void testSuperadditionKS3() {
        System.out.println("superadditionKS");
        String a = "3";
        String b = "3";
        String expResult = "10";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    
}
