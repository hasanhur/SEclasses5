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
    @Test //passed
    public void testSuperadditionRoman() {
        System.out.println("superadditionroman");
        String a = "V";
        String b = "IV";
        String expResult = "IX";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperaddition2() {
        System.out.println("superaddition2");
        String a = "1";
        String b = "1";
        String expResult = "3";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperaddition3() {
        System.out.println("superaddition3");
        String a = "0";
        String b = "0";
        String expResult = "1";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }



    @Test //passed
    public void testSuperadditionS452483_001() { //passed
        System.out.println("superaddition3");
        String a = "2";
        String b = "1";
        String expResult = "452486";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test //passed
    public void testSuperadditionS452483_002() {
        System.out.println("superaddition3");
        String a = "4";
        String b = "2";
        String expResult = "452489";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test //passed
    public void testSuperadditionS452483_003() {
        System.out.println("superaddition3");
        String a = "-1";
        String b = "0";
        String expResult = "452482";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @Test //passed
    public void testSuperadditionKS1() {
        System.out.println("superadditionKS");
        String a = "2";
        String b = "3";
        String expResult = "8";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @Test //passed
    public void testSuperadditionKS2() {
        System.out.println("superadditionKS");
        String a = "1";
        String b = "3";
        String expResult = "6";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @Test //passed
    public void testSuperadditionKS3() {
        System.out.println("superadditionKS");
        String a = "3";
        String b = "3";
        String expResult = "10";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSuperadditionMDMyterko1() {
        System.out.println("superaddition");
        String a = "I";
        String b = "I";
        String expAppend = "III";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expAppend, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testSuperadditionMDMyterko2() {
        System.out.println("superaddition");
        String a = "3";
        String b = "3";
        String expDiv = "3";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expDiv, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testSuperadditionMDMyterko3() {
        System.out.println("superaddition");
        boolean a = true;
        boolean expSubstraction = false;
        assertEquals(expSubstraction, a);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}
